package com.percolate.sdk.android.dto;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.openpojo.random.RandomFactory;
import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.PojoField;
import com.openpojo.reflection.filters.*;
import com.openpojo.validation.Validator;
import com.openpojo.validation.ValidatorBuilder;
import com.openpojo.validation.affirm.Affirm;
import com.openpojo.validation.test.Tester;
import com.openpojo.validation.test.impl.SetterTester;
import com.openpojo.validation.utils.IdentityHandlerStub;
import com.openpojo.validation.utils.ValidationHelper;
import com.percolate.sdk.android.BuildConfig;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * This class uses OpenPojo + reflection to test parceling all of our DTOs in one sweep.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
public class JavaVersionParcelTest {

    @Test
    public void test() throws Exception {
        Validator validator = ValidatorBuilder.create()
                .with(new MyParcelableTester())
                .build();

        validator.validate("com.percolate.sdk.android.dto",
                new FilterClassName(".*(?<!Test)$"), //Filter classes that end with "Test"
                new FilterClassName(".*(?<!Tester)$"), //Filter classes that end with "Tester"
                new FilterSyntheticClasses(), //Filter any synthetic classes
                new FilterNonConcrete(), //Filter interface, Enum and Abstract classes
                new FilterNestedClasses() //Filter nested / inner classes
        );
    }

    /**
     * OpenPojo {@link Tester} implementation for checking our {@link Parcelable} DTO objects.
     */
    class MyParcelableTester implements Tester {

        public void run(PojoClass pojoClass) {
            System.out.println("TESTING: " + pojoClass.getName());
            Object instance = setFieldValues(pojoClass);
            testParceling(instance);
        }

        /**
         * Almost an exact duplicate of OpenPojo's {@link SetterTester} class but this version gets fields from
         * `pojoClass.superClass` instead of `pojoClass` because our android DTOs don't have any of their own
         * getter/setter methods.
         */
        private Object setFieldValues(PojoClass pojoClass) {
            final Object classInstance = ValidationHelper.getBasicInstance(pojoClass);
            final PojoClass parent = pojoClass.getSuperClass();
            for (PojoField fieldEntry : parent.getPojoFields()) {
                if (fieldEntry.hasSetter()) {
                    Object value = getRandomValue(fieldEntry);
                    IdentityHandlerStub.registerIdentityHandlerStubForValue(value);
                    fieldEntry.invokeSetter(classInstance, value);
                    Affirm.affirmEquals("Setter test failed, non equal value for field=[$fieldEntry]", value, fieldEntry.get(classInstance));
                    IdentityHandlerStub.unregisterIdentityHandlerStubForValue(value);
                }
            }
            return classInstance;
        }

        /**
         * Handle {@code LinkedHashMap<String, Object>} and {@code List<LinkedHashMap<String, Object>>} as special
         * case (OpenPojo would actually create {@code new Object()} values, which don't work with {@link Parcel}.
         */
        private Object getRandomValue(PojoField fieldEntry) {
            if(fieldEntry.getType().isAssignableFrom(LinkedHashMap.class)) {
                List<Type> parameterTypes = fieldEntry.getParameterTypes();
                if(parameterTypes.size() == 2) {
                    if("class java.lang.Object".equals(parameterTypes.get(1).toString())) {
                        return createRandomLinkedHashMap();
                    }
                }
            }

            if (fieldEntry.getType().isAssignableFrom(List.class)) {
                List<Type> parameterTypes = fieldEntry.getParameterTypes();
                if (parameterTypes.size() == 1) {
                    if("java.util.LinkedHashMap<java.lang.String, java.lang.Object>".equals(parameterTypes.get(0).toString())) {
                        final List<LinkedHashMap<String, Object>> randomValues = new ArrayList<>();
                        randomValues.add(createRandomLinkedHashMap());
                        randomValues.add(createRandomLinkedHashMap());
                        return randomValues;
                    }
                }
            }

            return RandomFactory.getRandomValue(fieldEntry);
        }

        @NotNull
        private LinkedHashMap<String, Object> createRandomLinkedHashMap() {
            LinkedHashMap<String, Object> randomValues = new LinkedHashMap<>();
            for (int i = 0; i < 3; i++) {
                String randKey = RandomFactory.getRandomValue(String.class);
                String randVal = RandomFactory.getRandomValue(String.class);
                randomValues.put(randKey, randVal);
            }
            return randomValues;
        }

        /**
         * Here's where the magic happens.  We put an instance of the object into Parcel, and then get it
         * back out of Parcel.  We then make sure all the fields in the 2 objects match.
         */
        private void testParceling(Object instance) {
            try {
                if (instance instanceof Parcelable) {
                    final Parcelable object = (Parcelable) instance;
                    final Parcel parcel = Parcel.obtain();
                    writeToParcel(object, parcel);
                    final Object fromParcel = readFromParcel(object, parcel);
                    assertNotNull(fromParcel);
                    final EqualsBuilder equalsBuilder = createEqualsBuilder(object, fromParcel);

                    assertTrue("Objects do not match after writeToParcel / createFromParcel execution." +
                                    "\nInitial Object: [" + object + "]." +
                                    "\nParcel Object:  [" + fromParcel + "]",
                            equalsBuilder.build()
                    );
                } else {
                    fail("Object does not implement Parcelable: " + instance.getClass().getName());
                }
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }

        /**
         * Write the object to (Robolectric's version of) Parcel.
         */
        private void writeToParcel(Parcelable object, Parcel parcel) {
            object.writeToParcel(parcel, 0);
            parcel.setDataPosition(0);
        }

        /**
         * The the objects "CREATOR" field that holds an instance of {@link Parcelable.Creator}
         * and call {@code createFromParcel} on it.
         */
        private Object readFromParcel(Parcelable object, Parcel parcel) throws NoSuchFieldException, IllegalAccessException {
            final Class<? extends Parcelable> clazz = object.getClass();
            final Field creatorField = clazz.getDeclaredField("CREATOR");
            final Parcelable.Creator creator = (Parcelable.Creator) creatorField.get(object);
            return creator.createFromParcel(parcel);
        }

        /**
         * Construct an Apache Commons {@link EqualsBuilder}.  Add fields from both objects
         * to it, ignoring objects annotated with {@code @JsonIgnore}.
         */
        @NotNull
        private EqualsBuilder createEqualsBuilder(Parcelable object, Object fromParcel) throws IllegalAccessException {
            final EqualsBuilder equalsBuilder = new EqualsBuilder();
            final Class<? extends Parcelable> clazz = object.getClass();
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                if(!field.isAnnotationPresent(JsonIgnore.class) && !Modifier.isTransient(field.getModifiers())) {
                    equalsBuilder.append(field.get(object), field.get(fromParcel));
                }
            }
            return equalsBuilder;
        }
    }
}

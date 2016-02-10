package com.percolate.sdk.android.dto

import android.os.Build
import android.os.Parcel
import android.os.Parcelable
import com.fasterxml.jackson.annotation.JsonIgnore
import com.openpojo.random.RandomFactory
import com.openpojo.reflection.PojoClass
import com.openpojo.reflection.PojoField
import com.openpojo.reflection.filters.FilterClassName
import com.openpojo.reflection.filters.FilterNestedClasses
import com.openpojo.reflection.filters.FilterNonConcrete
import com.openpojo.reflection.filters.FilterSyntheticClasses
import com.openpojo.validation.ValidatorBuilder
import com.openpojo.validation.affirm.Affirm
import com.openpojo.validation.test.Tester
import com.openpojo.validation.utils.IdentityHandlerStub
import com.openpojo.validation.utils.ValidationHelper
import com.percolate.sdk.android.BuildConfig
import org.apache.commons.lang3.builder.EqualsBuilder
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricGradleTestRunner
import org.robolectric.annotation.Config
import java.lang.reflect.Modifier
import java.util.*

/**
 * This class uses OpenPojo + reflection to test parceling all of our DTOs in one sweep.
 */
@RunWith(RobolectricGradleTestRunner::class)
@Config(constants = BuildConfig::class, sdk = intArrayOf(Build.VERSION_CODES.LOLLIPOP))
class ParcelTest {

    @Test
    fun testObjectParceling() {
        val validator = ValidatorBuilder.create().with(MyParcelableTester()).build()

        validator.validate("com.percolate.sdk.android.dto",
                FilterClassName(".*(?<!Test)$"), //Filter classes that end with "Test"
                FilterClassName(".*(?<!Tester)$"), //Filter classes that end with "Tester"
                FilterSyntheticClasses(), //Filter any synthetic classes
                FilterNonConcrete(), //Filter interface, Enum and Abstract classes
                FilterNestedClasses() //Filter nested / inner classes
        )
    }

    /**
     * OpenPojo [Tester] implementation for checking our [Parcelable] DTO objects.
     */
    internal inner class MyParcelableTester : Tester {

        override fun run(pojoClass: PojoClass) {
            print("Testing parceling : " + pojoClass.name)
            val instance = setFieldValues(pojoClass)
            testParceling(instance)
            println(" (passed)")
        }

        /**
         * Almost an exact duplicate of OpenPojo's `SetterTester` class but this
         * version gets fields from `pojoClass.superClass` instead of `pojoClass` because our android DTOs don't have
         * any of their own getter/setter methods.
         */
        private fun setFieldValues(pojoClass: PojoClass): Any {
            val classInstance = ValidationHelper.getBasicInstance(pojoClass)
            val parent = pojoClass.superClass
            val randomValueGenerator = RandomValueGenerator();
            for (fieldEntry in parent.pojoFields) {
                if (fieldEntry.hasSetter()) {
                    val value = randomValueGenerator.createRandomValue(fieldEntry)
                    IdentityHandlerStub.registerIdentityHandlerStubForValue(value)
                    fieldEntry.invokeSetter(classInstance, value)
                    Affirm.affirmEquals("Setter test failed, non equal value for field=[$fieldEntry]", value, fieldEntry.get(classInstance))
                    IdentityHandlerStub.unregisterIdentityHandlerStubForValue(value)
                }
            }
            return classInstance
        }

        /**
         * Here's where the magic happens.  We put an instance of the object into Parcel, and then get it
         * back out of Parcel.  We then make sure all the fields in the 2 objects match.
         */
        @Suppress("ConvertToStringTemplate")
        private fun testParceling(instance: Any) {
            try {
                if (instance is Parcelable) {
                    val parcel = Parcel.obtain()
                    writeToParcel(instance, parcel)
                    val fromParcel = readFromParcel(instance, parcel)
                    assertNotNull(fromParcel)
                    val equalsBuilder = createEqualsBuilder(instance, fromParcel)

                    assertTrue("Objects do not match after writeToParcel / createFromParcel execution." +
                            "\nInitial Object: [$instance]." +
                            "\nParcel Object:  [$fromParcel]",
                            equalsBuilder.build())

                } else {
                    fail("Object does not implement Parcelable: " + instance.javaClass.name)
                }
            } catch (ex: Exception) {
                throw RuntimeException(ex)
            }

        }

        /**
         * Write the object to (Robolectric's version of) Parcel.
         */
        private fun writeToParcel(obj: Parcelable, parcel: Parcel) {
            obj.writeToParcel(parcel, 0)
            parcel.setDataPosition(0)
        }

        /**
         * Get the objects "CREATOR" field that holds an instance of [Parcelable.Creator] and call
         * `createFromParcel` on it.
         */
        @Throws(NoSuchFieldException::class, IllegalAccessException::class)
        private fun readFromParcel(obj: Parcelable, parcel: Parcel): Any {
            val clazz = obj.javaClass
            val creatorField = clazz.getDeclaredField("CREATOR")
            val creator = creatorField.get(obj) as Parcelable.Creator<*>
            return creator.createFromParcel(parcel)
        }

        /**
         * Construct an Apache Commons [EqualsBuilder].  Add fields from both objects
         * to it, ignoring fields annotated with jackson's `@JsonIgnore` annotation.
         */
        @Throws(IllegalAccessException::class)
        private fun createEqualsBuilder(obj: Parcelable, fromParcel: Any): EqualsBuilder {
            val equalsBuilder = EqualsBuilder()
            val clazz = obj.javaClass
            val fields = clazz.declaredFields
            for (field in fields) {
                if (!field.isAnnotationPresent(JsonIgnore::class.java) && !Modifier.isTransient(field.modifiers)) {
                    equalsBuilder.append(field.get(obj), field.get(fromParcel))
                }
            }
            return equalsBuilder
        }
    }

    /**
     * Class used to handle `LinkedHashMap<String, Object>` and `List<LinkedHashMap<String, Object>>` as special
     * cases.  OpenPojo would create `new Object()` values, which don't work with [Parcel].  If the field is not one
     * of the above types, we use OpenPojo's [RandomFactory.getRandomValue] for value generation.
     */
    internal inner class RandomValueGenerator {

        fun createRandomValue(fieldEntry: PojoField): Any {
            if(isLinkedHashMapOfObjects(fieldEntry)) {
                return createRandomLinkedHashMap()
            } else if (isListOfLinkedHashMapOfObjects(fieldEntry)) {
                val randomValues = ArrayList<LinkedHashMap<String, Any>>()
                randomValues.add(createRandomLinkedHashMap())
                randomValues.add(createRandomLinkedHashMap())
                return randomValues
            } else {
                return RandomFactory.getRandomValue(fieldEntry)
            }
        }

        /**
         * @return true if field is of type `LinkedHashMap<String, Object>`
         */
        private fun isLinkedHashMapOfObjects(fieldEntry: PojoField): Boolean {
            return fieldEntry.type.isAssignableFrom(LinkedHashMap::class.java) &&
                    fieldEntry.parameterTypes.size == 2 &&
                    "class java.lang.Object" == fieldEntry.parameterTypes[1].toString();
        }

        /**
         * @return true if field is of type `List<LinkedHashMap<String, Object>>`
         */
        private fun isListOfLinkedHashMapOfObjects(fieldEntry: PojoField): Boolean {
            return fieldEntry.type.isAssignableFrom(List::class.java) &&
                    fieldEntry.parameterTypes.size == 1 &&
                    "java.util.LinkedHashMap<java.lang.String, java.lang.Object>" == fieldEntry.parameterTypes[0].toString();
        }

        /**
         * Create a new `LinkedHashMap<String, Object>` containing 3 random key=value combinations.
         */
        private fun createRandomLinkedHashMap(): LinkedHashMap<String, Any> {
            val randomValues = LinkedHashMap<String, Any>()
            for (i in 0..2) {
                val randKey = RandomFactory.getRandomValue(String::class.java)
                val randVal = RandomFactory.getRandomValue(String::class.java)
                randomValues.put(randKey, randVal)
            }
            return randomValues
        }
    }
}

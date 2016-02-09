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
    @Throws(Exception::class)
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
            for (fieldEntry in parent.pojoFields) {
                if (fieldEntry.hasSetter()) {
                    val value = getRandomValue(fieldEntry)
                    IdentityHandlerStub.registerIdentityHandlerStubForValue(value)
                    fieldEntry.invokeSetter(classInstance, value)
                    Affirm.affirmEquals("Setter test failed, non equal value for field=[$fieldEntry]", value, fieldEntry.get(classInstance))
                    IdentityHandlerStub.unregisterIdentityHandlerStubForValue(value)
                }
            }
            return classInstance
        }

        /**
         * Handle `LinkedHashMap&lt;String, Object&gt;` and `List&lt;LinkedHashMap&lt;String, Object&gt;&gt;` as special
         * case (OpenPojo would actually create `new Object()` values, which don't work with [Parcel].
         */
        private fun getRandomValue(fieldEntry: PojoField): Any {
            if (fieldEntry.type.isAssignableFrom(LinkedHashMap::class.java)) {
                val parameterTypes = fieldEntry.parameterTypes
                if (parameterTypes.size == 2) {
                    if ("class java.lang.Object" == parameterTypes[1].toString()) {
                        return createRandomLinkedHashMap()
                    }
                }
            }

            if (fieldEntry.type.isAssignableFrom(List::class.java)) {
                val parameterTypes = fieldEntry.parameterTypes
                if (parameterTypes.size == 1) {
                    if ("java.util.LinkedHashMap<java.lang.String, java.lang.Object>" == parameterTypes[0].toString()) {
                        val randomValues = ArrayList<LinkedHashMap<String, Any>>()
                        randomValues.add(createRandomLinkedHashMap())
                        randomValues.add(createRandomLinkedHashMap())
                        return randomValues
                    }
                }
            }

            return RandomFactory.getRandomValue(fieldEntry)
        }

        private fun createRandomLinkedHashMap(): LinkedHashMap<String, Any> {
            val randomValues = LinkedHashMap<String, Any>()
            for (i in 0..2) {
                val randKey = RandomFactory.getRandomValue(String::class.java)
                val randVal = RandomFactory.getRandomValue(String::class.java)
                randomValues.put(randKey, randVal)
            }
            return randomValues
        }

        /**
         * Here's where the magic happens.  We put an instance of the object into Parcel, and then get it
         * back out of Parcel.  We then make sure all the fields in the 2 objects match.
         */
        private fun testParceling(instance: Any) {
            try {
                if (instance is Parcelable) {
                    val parcel = Parcel.obtain()
                    writeToParcel(instance, parcel)
                    val fromParcel = readFromParcel(instance, parcel)
                    assertNotNull(fromParcel)
                    val equalsBuilder = createEqualsBuilder(instance, fromParcel)

                    assertTrue("Objects do not match after writeToParcel / createFromParcel execution.\nInitial Object: [$instance].\nParcel Object:  [$fromParcel]",
                            equalsBuilder.build()!!)
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
        private fun writeToParcel(`object`: Parcelable, parcel: Parcel) {
            `object`.writeToParcel(parcel, 0)
            parcel.setDataPosition(0)
        }

        /**
         * The the objects "CREATOR" field that holds an instance of [Parcelable.Creator]
         * and call `createFromParcel` on it.
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
         * to it, ignoring objects annotated with `@JsonIgnore`.
         */
        @Throws(IllegalAccessException::class)
        private fun createEqualsBuilder(`object`: Parcelable, fromParcel: Any): EqualsBuilder {
            val equalsBuilder = EqualsBuilder()
            val clazz = `object`.javaClass
            val fields = clazz.declaredFields
            for (field in fields) {
                if (!field.isAnnotationPresent(JsonIgnore::class.java) && !Modifier.isTransient(field.modifiers)) {
                    equalsBuilder.append(field.get(`object`), field.get(fromParcel))
                }
            }
            return equalsBuilder
        }
    }
}

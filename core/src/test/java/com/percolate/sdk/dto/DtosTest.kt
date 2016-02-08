package com.percolate.sdk.dto

import com.openpojo.reflection.PojoClass
import com.openpojo.reflection.filters.FilterClassName
import com.openpojo.reflection.filters.FilterEnum
import com.openpojo.reflection.filters.FilterSyntheticClasses
import com.openpojo.validation.ValidatorBuilder
import com.openpojo.validation.affirm.Affirm
import com.openpojo.validation.rule.impl.NoNestedClassRule
import com.openpojo.validation.rule.impl.NoStaticExceptFinalRule
import com.openpojo.validation.rule.impl.SerializableMustHaveSerialVersionUIDRule
import com.openpojo.validation.test.Tester
import com.openpojo.validation.test.impl.GetterTester
import com.openpojo.validation.test.impl.SetterTester
import com.openpojo.validation.utils.ValidationHelper
import org.junit.Test

/**
 * This test class uses OpenPojo to test all of our DTO classes dynamically.
 * Docs available here: https://github.com/oshoukry/openpojo
 */
class DtosTest {

    @Test
    fun testAllDtos() {
        val validator = ValidatorBuilder.create().with(SetterTester()) // Test all setter methods
                .with(GetterTester()) // Test all getter methods
                .with(OpenPojoToStringTester()) // Test for custom toString() method
                .with(NoNestedClassRule()) // Pojo's should stay simple, don't allow nested classes.
                .with(NoStaticExceptFinalRule()) // Static fields must be final.
                .with(SerializableMustHaveSerialVersionUIDRule()) // Serializable classes must have serialVersionUID.
                .build()

        validator.validate("com.percolate.sdk.dto",
                FilterClassName(".*(?<!Test)$"), //Filter classes that end with "Test"
                FilterClassName(".*(?<!Tester)$"), //Filter classes that end with "Tester"
                FilterSyntheticClasses(), //Filter any synthetic classes
                FilterEnum() //Skip enums (needed because of `NoNestedClassRule` rule)
        )
    }

    /**
     * This class implements OpenPojo's `Tester` interface.
     * It runs `toString()` for each class passed into it to make sure
     * our custom `toString()` method format is detected.
     */
    internal inner class OpenPojoToStringTester : Tester {
        override fun run(pojoClass: PojoClass) {
            val classInstance = ValidationHelper.getBasicInstance(pojoClass)
            val fullClassName = classInstance.javaClass.canonicalName
            val simpleClassName = classInstance.javaClass.simpleName
            val toString = classInstance.toString()
            val startsAsExpected = toString.startsWith(simpleClassName + "[")
            Affirm.affirmTrue("No toString() found in " + fullClassName, startsAsExpected)
        }
    }
}

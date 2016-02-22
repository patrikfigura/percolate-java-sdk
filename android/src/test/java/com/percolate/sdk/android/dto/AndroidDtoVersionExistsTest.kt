package com.percolate.sdk.android.dto

import com.openpojo.reflection.PojoClass
import com.openpojo.reflection.filters.FilterClassName
import com.openpojo.reflection.filters.FilterNestedClasses
import com.openpojo.reflection.filters.FilterNonConcrete
import com.openpojo.reflection.filters.FilterSyntheticClasses
import com.openpojo.validation.ValidatorBuilder
import com.openpojo.validation.test.Tester
import org.junit.Assert.fail
import org.junit.Test

/**
 * Confirm that there is an Android version of each core library DTO object.
 */
class AndroidDtoVersionExistsTest {

    @Test
    fun testAndroidDtoVersionsExist() {
        val validator = ValidatorBuilder.create().with(AndroidDtoExistsTester()).build()

        validator.validate("com.percolate.sdk.dto",
                FilterClassName(".*(?<!Test)$"), //Filter classes that end with "Test"
                FilterClassName(".*(?<!Tester)$"), //Filter classes that end with "Tester"
                FilterSyntheticClasses(), //Filter any synthetic classes
                FilterNonConcrete(), //Filter interface, Enum and Abstract classes
                FilterNestedClasses() //Filter nested / inner classes
        )
    }

    internal inner class AndroidDtoExistsTester : Tester {
        override fun run(pojoClass: PojoClass) {
            val coreVersion = pojoClass.name; //Eg: com.percolate.sdk.dto.Post
            val androidVersion = coreVersion.replace(".dto.", ".android.dto.")  //Eg: com.percolate.sdk.android.dto.Post

            try {
                Class.forName(androidVersion);
            } catch(ex: ClassNotFoundException) {
                fail("No Android DTO found for Core DTO " + coreVersion);
            }

        }
    }
}

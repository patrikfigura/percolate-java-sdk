package com.percolate.sdk.rxjava.request

import com.openpojo.reflection.PojoClass
import com.openpojo.reflection.PojoMethod
import com.openpojo.reflection.filters.FilterClassName
import com.openpojo.reflection.filters.FilterNestedClasses
import com.openpojo.reflection.filters.FilterNonConcrete
import com.openpojo.reflection.filters.FilterSyntheticClasses
import com.openpojo.reflection.impl.PojoClassFactory
import com.openpojo.reflection.impl.PojoMethodFactory
import com.openpojo.validation.ValidatorBuilder
import com.openpojo.validation.test.Tester
import org.junit.Assert
import org.junit.Test

class RxRequestMethodTest {

    @Test
    fun testRxRequestMethodsExists() {
        val validator = ValidatorBuilder.create().with(RxRequestMethodsExistsTester()).build()

        validator.validateRecursively("com.percolate.sdk.api.request",
                FilterClassName(".*(?<!Params)$"), //Filter classes that end with "Params"
                FilterClassName(".*(?<!Service)$"), //Filter classes that end with "Service"
                FilterClassName(".*(?<!Test)$"), //Filter classes that end with "Test"
                FilterClassName(".*(?<!Tester)$"), //Filter classes that end with "Tester"
                FilterSyntheticClasses(), //Filter any synthetic classes
                FilterNonConcrete(), //Filter interface, Enum and Abstract classes
                FilterNestedClasses() //Filter nested / inner classes
        )
    }

    internal inner class RxRequestMethodsExistsTester : Tester {
        override fun run(pojoClass: PojoClass) {
            val apiVersion = pojoClass.name; //Eg: com.percolate.sdk.api.request.ActivityRequest
            val rxVersion = apiVersion.replace(".api.request.", ".rxjava.request.").plus("Rx")  //Eg: com.percolate.sdk.api.request.ActivityRequestRx

            try {
                val rxRequestClass = PojoClassFactory.getPojoClass(Class.forName(rxVersion)); // get Rx version of request class
                val apiMethods : List<PojoMethod> = pojoClass.pojoMethods; // get all methods in api version of request class

                // check whether each get, set, post methods exists in Rx version of request class
                apiMethods.forEach {
                    if (!it.isConstructor) {
                        val rxMethod = PojoMethodFactory.getMethod(rxRequestClass.clazz, it.name, *it.parameterTypes)
                        Assert.assertNotNull(rxRequestClass.name + "doesn't have this method.", rxMethod)
                    }
                }

            } catch(ex: ClassNotFoundException) {
                Assert.fail("No RxJava version found for Api Request class" + apiVersion);
            }

        }
    }

}

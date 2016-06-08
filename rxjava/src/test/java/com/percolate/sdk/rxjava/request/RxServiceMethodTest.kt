package com.percolate.sdk.rxjava.request

import com.openpojo.reflection.impl.PojoClassFactory
import com.openpojo.reflection.impl.PojoMethodFactory
import org.junit.Assert
import org.junit.Assert.assertNotNull
import org.junit.Test

class RxServiceMethodTest {

    @Test
    fun testRxServiceMethodExists() {
        // get api service classes Eg: com.percolate.sdk.api.request.ActivityService
        val apiServices = PojoClassFactory.getPojoClassesRecursively("com.percolate.sdk.api.request") { service ->
            service.isInterface;
        }
        assertNotNull(apiServices)

        apiServices.forEach {
            try {
                // get Rx version of service class Eg: com.percolate.sdk.rxjava.request.ActivityServiceRx
                val rxServiceClassName = it.name.replace(".api.request.", ".rxjava.request.").plus("Rx");
                val rxServiceClass = PojoClassFactory.getPojoClass(Class.forName(rxServiceClassName));

                // loop through each api service method checking whether it exists in rx version of the service class
                it.pojoMethods.forEach {
                    val rxServiceMethod = PojoMethodFactory.getMethod(rxServiceClass.clazz, it.name, *it.parameterTypes);
                    assertNotNull(rxServiceMethod)
                }

            } catch (ex: ClassNotFoundException) {
                Assert.fail("No RxJava version found for Api Service class" + it);
            }
        }

    }
}

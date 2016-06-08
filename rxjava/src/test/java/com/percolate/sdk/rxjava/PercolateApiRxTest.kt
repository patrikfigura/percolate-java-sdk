package com.percolate.sdk.rxjava

import com.openpojo.reflection.impl.PojoClassFactory
import com.openpojo.reflection.impl.PojoMethodFactory
import com.percolate.sdk.api.PercolateApi
import org.junit.Assert.assertNotNull
import org.junit.Test

class PercolateApiRxTest {

    @Test
    fun testPercolateApiRxToApiMethods() {
        // get PercolateApi
        val apiRx = PojoClassFactory.getPojoClass(PercolateApiRx::class.java)
        assertNotNull("PercolateApiRx class not found.", apiRx)

        // get methods in PercolateApi
        val rxMethods = apiRx.pojoMethods
        assertNotNull("PercolateApiRx class has no methods.", rxMethods)

        // check whether each method in PercolateApiRx has an api version in PercolateApi Eg: authRx() -> auth() exists
        rxMethods.forEach {
            if (!it.isConstructor) {
                val method = PojoMethodFactory.getMethod(PercolateApi::class.java, it.name.replace("Rx", ""))
                assertNotNull("PercolateApi does not have this method. ", method)
            }
        }
    }

    @Test
    fun testPercolateApiToRxMethods() {
        // get PercolateApi
        val api = PojoClassFactory.getPojoClass(PercolateApi::class.java)
        assertNotNull("PercolateApi class not found.", api)

        // get methods in PercolateApi
        val apiMethods = api.pojoMethods
        assertNotNull("PercolateApi class has no methods.", apiMethods)

        // check whether each method in PercolateApi has an rxjava version in PercolateApiRx Eg: auth() -> authRx() exists
        apiMethods.forEach {
            if (!it.isConstructor && !it.name.startsWith("get") && !it.name.startsWith("set")) {
                val method = PojoMethodFactory.getMethod(PercolateApiRx::class.java, it.name.plus("Rx"))
                assertNotNull("PercolateApiRx does not have this method. ", method)
            }
        }
    }
}

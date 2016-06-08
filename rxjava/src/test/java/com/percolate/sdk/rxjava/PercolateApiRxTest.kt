package com.percolate.sdk.rxjava

import com.openpojo.reflection.impl.PojoClassFactory
import com.openpojo.reflection.impl.PojoMethodFactory
import com.percolate.sdk.api.PercolateApi
import org.junit.Assert.assertNotNull
import org.junit.Test

class PercolateApiRxTest {

    @Test
    fun testPercolateApiAndRxMethods() {
        // get PercolateApi
        val apiRx = PojoClassFactory.getPojoClass(PercolateApiRx::class.java)
        assertNotNull(apiRx)

        // get methods in PercolateApi
        val rxMethods = apiRx.pojoMethods
        assertNotNull(rxMethods)

        // check whether each method in PercolateApiRx has an api version in PercolateApi Eg: authRx() -> auth() exists
        rxMethods.forEach {
            if (!it.isConstructor) {
                val method = PojoMethodFactory.getMethod(PercolateApi::class.java, it.name.replace("Rx", ""))
                assertNotNull(method)
            }
        }
    }
}

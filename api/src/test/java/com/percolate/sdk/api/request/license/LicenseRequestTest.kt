package com.percolate.sdk.api.request.license

import com.percolate.sdk.api.BaseApiTest
import org.junit.Assert
import org.junit.Test

class LicenseRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val licenses = percolateApi
                .license()
                .get(LicenseParams())
                .execute()
                .body();

        Assert.assertNotNull(licenses)
        Assert.assertNotNull(licenses.licenses)
        Assert.assertEquals(4, licenses.licenses.size.toLong())
    }
}

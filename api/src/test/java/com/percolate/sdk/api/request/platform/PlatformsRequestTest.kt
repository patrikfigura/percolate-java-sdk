package com.percolate.sdk.api.request.platform

import com.percolate.sdk.api.BaseApiTest
import org.junit.Assert
import org.junit.Test

class PlatformsRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val platforms = percolateApi
                .platforms()
                .get(PlatformsParams())
                .execute()
                .body();

        Assert.assertNotNull(platforms)
        Assert.assertNotNull(platforms.data)
        Assert.assertEquals(6, platforms.data.size.toLong())
    }
}
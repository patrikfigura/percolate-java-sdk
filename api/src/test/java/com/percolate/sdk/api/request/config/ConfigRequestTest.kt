package com.percolate.sdk.api.request.comment

import com.percolate.sdk.api.BaseApiTest
import org.junit.Assert
import org.junit.Test

class ConfigRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val config = percolateApi
                .config()
                .get()
                .execute()
                .body();

        Assert.assertNotNull(config)
        Assert.assertNotNull(config.data)
        Assert.assertEquals(3, config.data.size.toLong())
    }
}

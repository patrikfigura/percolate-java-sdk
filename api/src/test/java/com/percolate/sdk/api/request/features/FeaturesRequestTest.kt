package com.percolate.sdk.api.request.features

import com.percolate.sdk.api.BaseApiTest
import org.junit.Assert
import org.junit.Test

class FeaturesRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val features = percolateApi
                .features()
                .get(FeaturesParams())
                .execute()
                .body();

        Assert.assertNotNull(features)
        Assert.assertNotNull(features.data)
        Assert.assertEquals(7, features.data.size.toLong())
    }
}

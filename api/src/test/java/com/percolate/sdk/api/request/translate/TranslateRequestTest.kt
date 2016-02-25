package com.percolate.sdk.api.request.translate

import com.percolate.sdk.api.BaseApiTest
import org.junit.Assert
import org.junit.Test

class TranslateRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val translation = percolateApi
                .translate()
                .get(TranslateParams())
                .execute()
                .body();

        Assert.assertNotNull(translation)
        Assert.assertNotNull(translation.data)
        Assert.assertEquals("Testing", translation.data.translation)
    }
}

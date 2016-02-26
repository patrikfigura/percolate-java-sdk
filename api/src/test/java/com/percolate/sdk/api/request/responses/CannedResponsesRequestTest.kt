package com.percolate.sdk.api.request.responses

import com.percolate.sdk.api.BaseApiTest
import org.junit.Assert
import org.junit.Test

class CannedResponsesRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val cannedResponses = percolateApi
                .cannedResponses()
                .get(CannedResponsesParams())
                .execute()
                .body();

        Assert.assertNotNull(cannedResponses)
        Assert.assertNotNull(cannedResponses.data)
        Assert.assertEquals(2, cannedResponses.data.size.toLong())
    }
}
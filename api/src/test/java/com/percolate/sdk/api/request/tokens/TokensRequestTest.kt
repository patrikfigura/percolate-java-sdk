package com.percolate.sdk.api.request.tokens

import com.percolate.sdk.api.BaseApiTest
import org.junit.Assert
import org.junit.Test

class TokensRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val tokens = percolateApi
                .tokens()
                .get(TokensParams())
                .execute()
                .body();

        Assert.assertNotNull(tokens)
        Assert.assertNotNull(tokens.data)
        Assert.assertEquals(11, tokens.data.size.toLong())
    }

    @Test
    fun testDelete() {
        val responseBody = percolateApi
                .tokens()
                .delete(TokensDeleteParams("123"))
                .execute()
                .body();

        Assert.assertNotNull(responseBody)
    }
}

package com.percolate.sdk.api.request.terms

import com.percolate.sdk.api.BaseApiTest
import com.percolate.sdk.dto.Term
import org.junit.Assert
import org.junit.Test

class TermsRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val terms = percolateApi
                .terms()
                .get(TermsParams())
                .execute()
                .body();

        Assert.assertNotNull(terms)
        Assert.assertNotNull(terms.data)
        Assert.assertEquals(5, terms.data.size.toLong())
    }

    @Test
    fun testCreate() {
        val singleTerm = percolateApi
                .terms()
                .create(Term())
                .execute()
                .body();

        Assert.assertNotNull(singleTerm)
        Assert.assertNotNull(singleTerm.data)
    }
}

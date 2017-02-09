package com.percolate.sdk.api.request.activity

import com.percolate.sdk.api.BaseApiTest
import com.percolate.sdk.api.request.variants.VariantsGetParams
import com.percolate.sdk.api.request.variants.VariantsListParams
import org.junit.Assert
import org.junit.Test

class VariantsRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val variant = percolateApi
                .variants()
                .get(VariantsGetParams("variant:123"))
                .execute()
                .body()

        Assert.assertNotNull(variant)
        Assert.assertNotNull(variant.data)
        Assert.assertEquals("variant:123", variant.data.id)
    }

    @Test
    fun testList() {
        val variants = percolateApi
                .variants()
                .list(VariantsListParams())
                .execute()
                .body()

        Assert.assertNotNull(variants)
        Assert.assertNotNull(variants.data)
        Assert.assertEquals(3, variants.data.size.toLong())
    }
}

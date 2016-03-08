package com.percolate.sdk.api.request.schema

import com.percolate.sdk.api.BaseApiTest
import org.junit.Assert
import org.junit.Test

class SchemasRequestTest : BaseApiTest() {

    @Test
    fun testList() {
        val schemas = percolateApi
                .schemas()
                .list(SchemasListParams())
                .execute()
                .body();

        Assert.assertNotNull(schemas)
        Assert.assertNotNull(schemas.data)
        Assert.assertEquals(9, schemas.data.size.toLong())
    }

    @Test
    fun testGet() {
        val singleSchema = percolateApi
                .schemas()
                .get(SchemasGetParams("123"))
                .execute()
                .body();

        Assert.assertNotNull(singleSchema)
        Assert.assertNotNull(singleSchema.data)
        Assert.assertNotNull(singleSchema.data.id)
    }
}

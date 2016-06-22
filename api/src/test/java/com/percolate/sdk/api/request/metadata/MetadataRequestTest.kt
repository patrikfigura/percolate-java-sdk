package com.percolate.sdk.api.request.platform

import com.percolate.sdk.api.BaseApiTest
import com.percolate.sdk.api.request.metadata.MetadataParams
import com.percolate.sdk.dto.MetadataItem
import org.junit.Assert
import org.junit.Test

class MetadataRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val metadata = percolateApi
                .metadata()
                .get("123")
                .execute()
                .body();

        Assert.assertNotNull(metadata)
        Assert.assertNotNull(metadata.data)
        Assert.assertEquals("metadata:4", metadata.data.id)
    }

    @Test
    fun testList() {
        val metadata = percolateApi
                .metadata()
                .list(MetadataParams())
                .execute()
                .body();

        Assert.assertNotNull(metadata)
        Assert.assertNotNull(metadata.data)
        Assert.assertEquals(4, metadata.data.size)
    }

    @Test
    fun testCreate() {
        val metadata = percolateApi
                .metadata()
                .create(MetadataItem())
                .execute()
                .body();

        Assert.assertNotNull(metadata)
        Assert.assertNotNull(metadata.data)
        Assert.assertEquals("metadata:9", metadata.data.id)
    }
}

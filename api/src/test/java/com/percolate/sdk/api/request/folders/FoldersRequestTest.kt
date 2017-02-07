package com.percolate.sdk.api.request.activity

import com.percolate.sdk.api.BaseApiTest
import com.percolate.sdk.api.request.folders.FoldersGetParams
import com.percolate.sdk.api.request.folders.FoldersListParams
import org.junit.Assert
import org.junit.Test

class FoldersRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val folder = percolateApi
                .folders()
                .get(FoldersGetParams("folder:123"))
                .execute()
                .body()

        Assert.assertNotNull(folder)
        Assert.assertNotNull(folder.data)
        Assert.assertEquals("folder:123", folder.data.id)
    }

    @Test
    fun testList() {
        val folders = percolateApi
                .folders()
                .list(FoldersListParams())
                .execute()
                .body()

        Assert.assertNotNull(folders)
        Assert.assertNotNull(folders.data)
        Assert.assertEquals(3, folders.data.size.toLong())
    }
}

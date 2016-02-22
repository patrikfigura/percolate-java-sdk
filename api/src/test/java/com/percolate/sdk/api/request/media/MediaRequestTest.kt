package com.percolate.sdk.api.request.media

import com.percolate.sdk.api.BaseApiTest
import org.junit.Assert
import org.junit.Test

class MediaRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val media = percolateApi
                .media()
                .get("video:123", MediaGetParams())
                .execute()
                .body();

        Assert.assertNotNull(media)
        Assert.assertNotNull(media.uid)
    }

    @Test
    fun testList() {
        val mediaList = percolateApi
                .media()
                .list("folder:123", MediaListParams())
                .execute()
                .body();

        Assert.assertNotNull(mediaList)
        Assert.assertNotNull(mediaList.data)
        Assert.assertEquals(3, mediaList.data.size.toLong())
    }

    @Test
    fun testItems() {
        val mediaItems = percolateApi
                .media()
                .items(MediaItemParams())
                .execute()
                .body();

        Assert.assertNotNull(mediaItems)
        Assert.assertFalse(mediaItems.isEmpty())
        Assert.assertEquals(2, mediaItems.size.toLong())
    }

    @Test
    fun testMeta() {
        val mediaMetaDataHolder = percolateApi
                .media()
                .meta("folder:123", MediaGetParams())
                .execute()
                .body();

        Assert.assertNotNull(mediaMetaDataHolder)
        Assert.assertNotNull(mediaMetaDataHolder.data)
    }
}

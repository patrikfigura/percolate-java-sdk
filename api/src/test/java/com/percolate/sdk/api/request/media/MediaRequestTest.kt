package com.percolate.sdk.api.request.media

import com.percolate.sdk.api.BaseApiTest
import com.percolate.sdk.dto.MediaMetaData
import okhttp3.RequestBody
import org.junit.Assert
import org.junit.Test
import java.io.File

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

    @Test
    fun testUpdateMeta() {
        val metadata = percolateApi
                .media()
                .updateMeta("video:123", MediaMetaData())
                .execute()
                .body();

        Assert.assertNotNull(metadata)
        Assert.assertEquals("New title", metadata.title)
        Assert.assertEquals(2, metadata.tags.size)
    }

    @Test
    fun testCreate() {
        val media = percolateApi
                .media()
                .create(MediaUploadParams().file(
                        RequestBody.create(null, File("/some/path/file.jpg")),
                        "/some/path/file.jpg"
                ))
                .execute()
                .body();

        Assert.assertNotNull(media)
        Assert.assertNotNull(media.uid)
    }
}

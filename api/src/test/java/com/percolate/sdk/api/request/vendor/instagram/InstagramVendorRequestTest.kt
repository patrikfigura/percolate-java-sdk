package com.percolate.sdk.api.request.vendor.instagram

import com.percolate.sdk.api.BaseApiTest
import com.percolate.sdk.api.request.vendor.instagram.params.InstagramMediaVendorParams
import org.junit.Assert
import org.junit.Test

class InstagramVendorRequestTest : BaseApiTest() {

    @Test
    fun testMedia() {
        val instagramMedia = percolateApi
                .vendorInstagram()
                .media(InstagramMediaVendorParams("123"))
                .execute()
                .body();

        Assert.assertNotNull(instagramMedia)
        Assert.assertNotNull(instagramMedia.data)
        Assert.assertNotNull(instagramMedia.data.id)
        Assert.assertNotNull(instagramMedia.data.comments)
        Assert.assertNotNull(instagramMedia.data.comments.data)
        Assert.assertEquals(3, instagramMedia.data.comments.data.size.toLong())
    }

    @Test
    fun testComments() {
        val instagramMediaComments = percolateApi
                .vendorInstagram()
                .comments(InstagramMediaVendorParams("123"))
                .execute()
                .body();

        Assert.assertNotNull(instagramMediaComments)
        Assert.assertNotNull(instagramMediaComments.data)
        Assert.assertEquals(3, instagramMediaComments.data.size.toLong())
    }
}

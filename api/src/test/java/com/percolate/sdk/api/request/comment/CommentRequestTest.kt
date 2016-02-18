package com.percolate.sdk.api.request.comment

import com.percolate.sdk.api.BaseApiTest
import com.percolate.sdk.dto.Comment
import org.junit.Assert
import org.junit.Test

class CommentRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val comments = percolateApi
                .comments()
                .get(CommentParams())
                .execute()
                .body();

        Assert.assertNotNull(comments)
        Assert.assertNotNull(comments.comments)
        Assert.assertEquals(3, comments.comments.size.toLong())
    }

    @Test
    fun testCreate() {
        val commentData = percolateApi
                .comments()
                .create(Comment())
                .execute()
                .body();

        Assert.assertNotNull(commentData)
        Assert.assertNotNull(commentData.comment)
    }
}

package com.percolate.sdk.api.request.followers

import com.percolate.sdk.api.BaseApiTest
import com.percolate.sdk.dto.Follower
import org.junit.Assert
import org.junit.Test

class FollowersRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val followers = percolateApi
                .followers()
                .get(FollowersParams())
                .execute()
                .body();

        Assert.assertNotNull(followers)
        Assert.assertNotNull(followers.followers)
        Assert.assertEquals(2, followers.followers.size.toLong())
    }

    @Test
    fun testCreate() {
        val followers = percolateApi
                .followers()
                .create(arrayListOf(Follower()))
                .execute()
                .body();

        Assert.assertNotNull(followers)
        Assert.assertNotNull(followers.followers)
        Assert.assertEquals(1, followers.followers.size.toLong())
    }

    @Test
    fun testDelete() {
        val response = percolateApi
                .followers()
                .delete("123")
                .execute()
                .body();

        Assert.assertNotNull(response)
    }
}

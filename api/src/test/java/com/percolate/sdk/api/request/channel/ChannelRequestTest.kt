package com.percolate.sdk.api.request.channel

import com.percolate.sdk.api.BaseApiTest
import org.junit.Assert
import org.junit.Test

class ChannelRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val channels = percolateApi
                .channels()
                .get(ChannelParams())
                .execute()
                .body();

        Assert.assertNotNull(channels)
        Assert.assertNotNull(channels.data)
        Assert.assertEquals(3, channels.data.size.toLong())
    }
}

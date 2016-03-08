package com.percolate.sdk.api.request.streams

import com.percolate.sdk.api.BaseApiTest
import org.junit.Assert
import org.junit.Test

class StreamsRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val streams = percolateApi
                .streams()
                .get(StreamsParams())
                .execute()
                .body();

        Assert.assertNotNull(streams)
        Assert.assertNotNull(streams.data)
        Assert.assertEquals(13, streams.data.size.toLong())
    }
}

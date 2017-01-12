package com.percolate.sdk.api.request.followers

import com.percolate.sdk.api.BaseApiTest
import com.percolate.sdk.api.request.interaction.InteractionParams
import com.percolate.sdk.dto.Follower
import com.percolate.sdk.dto.InteractionData
import org.junit.Assert
import org.junit.Test

class InteractionRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val interactions = percolateApi
                .interactions()
                .get(InteractionParams())
                .execute()
                .body()

        Assert.assertNotNull(interactions)
        Assert.assertNotNull(interactions.data)
        Assert.assertEquals(2, interactions.data.size)
    }

    @Test
    fun testCreate() {
        val interaction = percolateApi
                .interactions()
                .create(InteractionData())
                .execute()
                .body()

        Assert.assertNotNull(interaction)
        Assert.assertNotNull(interaction.data)
        Assert.assertEquals("interaction:1", interaction.data.id)
    }
}

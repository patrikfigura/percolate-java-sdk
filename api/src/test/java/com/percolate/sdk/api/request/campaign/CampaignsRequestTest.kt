package com.percolate.sdk.api.request.campaign

import com.percolate.sdk.api.BaseApiTest
import org.junit.Assert
import org.junit.Test

class CampaignsRequestTest : BaseApiTest() {

    @Test
    fun testList() {
        val campaigns = percolateApi
                .campaigns()
                .list(CampaignsListParams())
                .execute()
                .body()

        Assert.assertNotNull(campaigns)
        Assert.assertNotNull(campaigns.data)
        Assert.assertEquals(2, campaigns.data.size.toLong())
    }

    @Test
    fun testGet() {
        val singleCampaign = percolateApi
                .campaigns()
                .get("123")
                .execute()
                .body()

        Assert.assertNotNull(singleCampaign)
        Assert.assertNotNull(singleCampaign.data)
        Assert.assertEquals("123", singleCampaign.data.id)
    }
}

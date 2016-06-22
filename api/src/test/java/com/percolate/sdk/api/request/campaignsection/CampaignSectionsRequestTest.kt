package com.percolate.sdk.api.request.campaignsection

import com.percolate.sdk.api.BaseApiTest
import com.percolate.sdk.api.request.campaign.CampaignSectionsListParams
import com.percolate.sdk.dto.CampaignSectionData
import org.junit.Assert
import org.junit.Test

class CampaignSectionsRequestTest : BaseApiTest() {

    @Test
    fun testList() {
        val campaignSections = percolateApi
                .campaignSection()
                .list(CampaignSectionsListParams())
                .execute()
                .body();

        Assert.assertNotNull(campaignSections)
        Assert.assertNotNull(campaignSections.data)
        Assert.assertEquals(1, campaignSections.data.size.toLong())
    }

    @Test
    fun testGet() {
        val singleCampaignSection = percolateApi
                .campaignSection()
                .get("123")
                .execute()
                .body();

        Assert.assertNotNull(singleCampaignSection)
        Assert.assertNotNull(singleCampaignSection.data)
        Assert.assertEquals(singleCampaignSection.data.id, "123")
    }

    @Test
    fun testCreate() {
        val campaignSectionData = CampaignSectionData().apply {
            id = "campaign_section:111"
            campaignId = "campaign:222"
            schemaId = "schema:333"
            scopeId = "license:444"
            type = "brief"
            title = "Brief section 1"
        }

        val singleCampaignSection = percolateApi
                .campaignSection()
                .create(campaignSectionData)
                .execute()
                .body();

        Assert.assertNotNull(singleCampaignSection)
        Assert.assertNotNull(singleCampaignSection.data)
        Assert.assertEquals(singleCampaignSection.data.id, "campaign_section:111")
        Assert.assertEquals(singleCampaignSection.data.campaignId, "campaign:222")
        Assert.assertEquals(singleCampaignSection.data.schemaId, "schema:333")
        Assert.assertEquals(singleCampaignSection.data.scopeId, "license:444")
        Assert.assertEquals(singleCampaignSection.data.type, "brief")
        Assert.assertEquals(singleCampaignSection.data.title, "Brief section 1")
    }
}


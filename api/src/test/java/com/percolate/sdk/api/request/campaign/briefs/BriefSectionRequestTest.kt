package com.percolate.sdk.api.request.campaign.briefs

import com.percolate.sdk.api.BaseApiTest
import com.percolate.sdk.api.request.brief.BriefParams
import com.percolate.sdk.dto.CampaignSectionsData
import org.junit.Assert
import org.junit.Test

@SuppressWarnings("unused")
class BriefSectionRequestTest : BaseApiTest() {

    @Test
    fun testList() {
        val campaignBriefs = percolateApi
                .briefSections()
                .list(BriefSectionListParams())
                .execute()
                .body();

        Assert.assertNotNull(campaignBriefs)
        Assert.assertNotNull(campaignBriefs.data)
        Assert.assertEquals(2, campaignBriefs.data.size.toLong())
    }

    @Test
    fun testGet() {
        val singleCampaignSection = percolateApi
                .briefSections()
                .get(BriefParams("campaign_brief:1"))
                .execute()
                .body();

        Assert.assertNotNull(singleCampaignSection)
        Assert.assertNotNull(singleCampaignSection.data)
        Assert.assertEquals("campaign_brief:1", singleCampaignSection.data.id)
    }

    @Test
    fun testCreate() {
        val singleCampaignSection = percolateApi
                .briefSections()
                .create(CampaignSectionsData())
                .execute()
                .body();

        Assert.assertNotNull(singleCampaignSection)
        Assert.assertNotNull(singleCampaignSection.data)
    }
}

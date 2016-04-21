package com.percolate.sdk.api.request.campaign.briefs

import com.percolate.sdk.api.BaseApiTest
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
        Assert.assertEquals(1, campaignBriefs.data.size.toLong())
        Assert.assertNotNull(campaignBriefs.data.get(0))
        Assert.assertNotNull(campaignBriefs.data.get(0).sections)
        Assert.assertEquals(2, campaignBriefs.data.get(0).sections.size.toLong())
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

package com.percolate.sdk.api.request.campaign.brief

import com.percolate.sdk.api.BaseApiTest
import com.percolate.sdk.api.request.campaign.CampaignSectionsListParams
import com.percolate.sdk.dto.BriefSectionsData
import org.junit.Assert
import org.junit.Test

@SuppressWarnings("unused")
class BriefSectionsRequestTest : BaseApiTest() {

    @Test
    fun testList() {
        val campaignBriefs = percolateApi
                .briefSections()
                .list(CampaignSectionsListParams())
                .execute()
                .body();

        Assert.assertNotNull(campaignBriefs)
        Assert.assertNotNull(campaignBriefs.data)
        Assert.assertEquals(1, campaignBriefs.data.size.toLong())
        Assert.assertNotNull(campaignBriefs.data[0])
        Assert.assertNotNull(campaignBriefs.data[0].sections)
        Assert.assertEquals(2, campaignBriefs.data[0].sections.size.toLong())
    }

    @Test
    fun testCreate() {
        val singleCampaignSection = percolateApi
                .briefSections()
                .create(BriefSectionsData())
                .execute()
                .body();

        Assert.assertNotNull(singleCampaignSection)
        Assert.assertNotNull(singleCampaignSection.data)
    }
}

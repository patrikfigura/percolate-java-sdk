package com.percolate.sdk.api.request.campaign.brief

import com.percolate.sdk.api.BaseApiTest
import com.percolate.sdk.api.request.campaign.CampaignSectionsListParams
import com.percolate.sdk.dto.WorkspaceSection
import org.junit.Assert
import org.junit.Test

@SuppressWarnings("unused")
class WorkspaceSectionsRequestTest : BaseApiTest() {

    @Test
    fun testList() {
        val campaignWorkspaces = percolateApi
                .workspaceSections()
                .list(CampaignSectionsListParams())
                .execute()
                .body();

        Assert.assertNotNull(campaignWorkspaces)
        Assert.assertNotNull(campaignWorkspaces.data)
        Assert.assertEquals(1, campaignWorkspaces.data.size.toLong())
    }

    @Test
    fun testGet() {
        val campaignWorkspace = percolateApi
                .workspaceSections()
                .get("123")
                .execute()
                .body();

        Assert.assertNotNull(campaignWorkspace)
        Assert.assertNotNull(campaignWorkspace.data)
        Assert.assertEquals("123", campaignWorkspace.data.id)
    }

    @Test
    fun testCreate() {
        val singleWorkspaceSection = percolateApi
                .workspaceSections()
                .create(WorkspaceSection())
                .execute()
                .body();

        Assert.assertNotNull(singleWorkspaceSection)
        Assert.assertNotNull(singleWorkspaceSection.data)
    }
}

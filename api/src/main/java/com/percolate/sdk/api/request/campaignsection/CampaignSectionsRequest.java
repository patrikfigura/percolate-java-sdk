package com.percolate.sdk.api.request.campaignsection;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.campaign.CampaignSectionsListParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.CampaignSectionData;
import com.percolate.sdk.dto.CampaignSections;
import com.percolate.sdk.dto.SingleCampaignSection;

import org.jetbrains.annotations.NotNull;

import okhttp3.ResponseBody;
import retrofit2.Call;

/**
 * Campaign Sections request proxy.
 */
@SuppressWarnings("unused")
public class CampaignSectionsRequest {

    private CampaignSectionService service;

    public CampaignSectionsRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(CampaignSectionService.class);
    }

    /**
     * Get a campaign section.
     *
     * @param campaignSectionId Campaign section id.
     * @return {@link Call} object.
     */
    public Call<SingleCampaignSection> get(@NotNull final String campaignSectionId) {
        return service.get(campaignSectionId);
    }

    /**
     * Get campaign sections.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<CampaignSections> list(@NotNull final CampaignSectionsListParams params) {
        return service.list(params.getParams());
    }

    /**
     * Create campaign section.
     *
     * @param campaignSectionData {@link CampaignSectionData} object.
     * @return {@link SingleCampaignSection} object.
     */
    public Call<SingleCampaignSection> create(@NotNull final CampaignSectionData campaignSectionData) {
        return service.create(campaignSectionData);
    }

    /**
     * Update campaign section.
     *
     * @param campaignSectionData {@link CampaignSectionData} object.
     * @return {@link SingleCampaignSection} object.
     */
    public Call<SingleCampaignSection> update(@NotNull final CampaignSectionData campaignSectionData) {
        return service.update(campaignSectionData.getId(), campaignSectionData);
    }

    /**
     * Delete campaign section.
     *
     * @param campaignSectionId Campaign section id.
     * @return {@link ResponseBody} object.
     */
    public Call<ResponseBody> delete(@NotNull final String campaignSectionId) {
        return service.delete(campaignSectionId);
    }
}

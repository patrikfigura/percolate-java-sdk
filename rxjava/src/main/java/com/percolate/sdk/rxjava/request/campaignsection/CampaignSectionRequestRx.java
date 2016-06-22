package com.percolate.sdk.rxjava.request.campaignsection;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.campaign.CampaignSectionsListParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.CampaignSectionData;
import com.percolate.sdk.dto.CampaignSections;
import com.percolate.sdk.dto.SingleCampaignSection;

import org.jetbrains.annotations.NotNull;

import okhttp3.ResponseBody;
import rx.Observable;

/**
 * Campaign Sections request proxy.
 */
@SuppressWarnings("unused")
public class CampaignSectionRequestRx {

    private CampaignSectionServiceRx service;

    public CampaignSectionRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(CampaignSectionServiceRx.class);
    }

    /**
     * Get a campaign section.
     *
     * @param campaignSectionId Campaign section id.
     * @return {@link Observable} object.
     */
    public Observable<SingleCampaignSection> get(@NotNull final String campaignSectionId) {
        return service.get(campaignSectionId);
    }

    /**
     * Get campaign sections.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<CampaignSections> list(@NotNull final CampaignSectionsListParams params) {
        return service.list(params.getParams());
    }

    /**
     * Create campaign section.
     *
     * @param campaignSectionData {@link CampaignSectionData} object.
     * @return {@link Observable} object.
     */
    public Observable<SingleCampaignSection> create(@NotNull final CampaignSectionData campaignSectionData) {
        return service.create(campaignSectionData);
    }

    /**
     * Update campaign section.
     *
     * @param campaignSectionData {@link CampaignSectionData} object.
     * @return {@link Observable} object.
     */
    public Observable<SingleCampaignSection> update(@NotNull final CampaignSectionData campaignSectionData) {
        return service.update(campaignSectionData.getId(), campaignSectionData);
    }

    /**
     * Delete campaign section.
     *
     * @param campaignSectionId Campaign section id.
     * @return {@link Observable} object.
     */
    public Observable<ResponseBody> delete(@NotNull final String campaignSectionId) {
        return service.delete(campaignSectionId);
    }
}

package com.percolate.sdk.api.request.campaign.briefs;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.brief.BriefParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.CampaignSectionsData;
import com.percolate.sdk.dto.CampaignSections;
import com.percolate.sdk.dto.SingleCampaignSection;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Campaign briefs request proxy.
 */
@SuppressWarnings("unused")
public class BriefSectionRequest {

    private BriefSectionService service;

    public BriefSectionRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(BriefSectionService.class);
    }

    /**
     * Get campaign brief.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<SingleCampaignSection> get(@NotNull final BriefParams params) {
        return service.get(params.getBriefId());
    }

    /**
     * Get list of campaign briefs.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<CampaignSections> list(@NotNull final BriefSectionListParams params) {
        return service.list(params.getParams());
    }

    /**
     * Create campaign brief.
     *
     * @param campaignBrief {@link CampaignSectionsData} object.
     * @return {@link Call} object.
     */
    public Call<SingleCampaignSection> create(@NotNull final CampaignSectionsData campaignBrief) {
        return service.create(campaignBrief);
    }

    /**
     * Update campaign brief.
     *
     * @param campaignBriefUid Campaign brief id;
     * @param campaignBrief {@link CampaignSectionsData} object.
     * @return {@link Call} object.
     */
    public Call<SingleCampaignSection> update(@NotNull final String campaignBriefUid, @NotNull final CampaignSectionsData campaignBrief) {
        return service.update(campaignBriefUid, campaignBrief);
    }

    /**
     * Delete campaign brief.
     *
     * @param campaignBriefUid Campaign brief id;
     * @return {@link Call} object.
     */
    public Call<ResponseBody> delete(@NotNull final String campaignBriefUid) {
        return service.delete(campaignBriefUid);
    }
}

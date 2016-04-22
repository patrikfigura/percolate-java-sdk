package com.percolate.sdk.api.request.campaign.brief;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.brief.BriefParams;
import com.percolate.sdk.api.request.campaign.CampaignSectionsListParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.BriefSectionsData;
import com.percolate.sdk.dto.BriefSections;
import com.percolate.sdk.dto.SingleBriefSection;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Campaign briefs request proxy.
 */
@SuppressWarnings("unused")
public class BriefSectionsRequest {

    private BriefSectionsService service;

    public BriefSectionsRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(BriefSectionsService.class);
    }

    /**
     * Get campaign brief.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<SingleBriefSection> get(@NotNull final BriefParams params) {
        return service.get(params.getBriefId());
    }

    /**
     * Get list of campaign briefs.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<BriefSections> list(@NotNull final CampaignSectionsListParams params) {
        return service.list(params.getParams());
    }

    /**
     * Create campaign brief.
     *
     * @param campaignBrief {@link BriefSectionsData} object.
     * @return {@link Call} object.
     */
    public Call<SingleBriefSection> create(@NotNull final BriefSectionsData campaignBrief) {
        return service.create(campaignBrief);
    }

    /**
     * Update campaign brief.
     *
     * @param campaignBrief {@link BriefSectionsData} object.
     * @return {@link Call} object.
     */
    public Call<SingleBriefSection> update(@NotNull final BriefSectionsData campaignBrief) {
        return service.update(campaignBrief.getId(), campaignBrief);
    }

    /**
     * Delete campaign brief.
     *
     * @param briefUid Campaign brief id;
     * @return {@link Call} object.
     */
    public Call<ResponseBody> delete(@NotNull final String briefUid) {
        return service.delete(briefUid);
    }
}

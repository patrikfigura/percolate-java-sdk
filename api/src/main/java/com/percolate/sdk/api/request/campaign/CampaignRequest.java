package com.percolate.sdk.api.request.campaign;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Briefs;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Campaign request proxy.
 */
@SuppressWarnings("unused")
public class CampaignRequest {

    private CampaignService service;

    public CampaignRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(CampaignService.class);
    }

    /**
     * Query campaign sections endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Briefs> sections(@NotNull final CampaignBriefSectionParams params) {
        return service.sections(params.getParams());
    }
}

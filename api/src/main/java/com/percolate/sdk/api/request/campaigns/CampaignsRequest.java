package com.percolate.sdk.api.request.campaigns;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Campaigns;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Campaigns request proxy.
 */
@SuppressWarnings("unused")
public class CampaignsRequest {

    private CampaignsService service;

    public CampaignsRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(CampaignsService.class);
    }

    /**
     * Query campaigns endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Campaigns> get(@NotNull final CampaignsParams params) {
        return service.get(params.getParams());
    }
}

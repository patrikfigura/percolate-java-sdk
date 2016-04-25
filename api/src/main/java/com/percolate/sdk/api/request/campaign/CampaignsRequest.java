package com.percolate.sdk.api.request.campaign;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Campaigns;
import com.percolate.sdk.dto.SingleCampaign;
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
    public Call<Campaigns> list(@NotNull final CampaignsListParams params) {
        return service.list(params.getParams());
    }

    /**
     * Query campaigns endpoint.
     *
     * @param uid Campaign uid.
     * @return {@link Call} object.
     */
    public Call<SingleCampaign> get(@NotNull final String uid) {
        return service.get(uid);
    }
}

package com.percolate.sdk.rxjava.request.campaign;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.campaign.CampaignsListParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Campaigns;
import com.percolate.sdk.dto.SingleCampaign;

import org.jetbrains.annotations.NotNull;

import rx.Observable;

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
     * @return {@link Observable} object.
     */
    public Observable<Campaigns> list(@NotNull final CampaignsListParams params) {
        return service.list(params.getParams());
    }

    /**
     * Query campaigns endpoint.
     *
     * @param uid Campaign uid.
     * @return {@link Observable} object.
     */
    public Observable<SingleCampaign> get(@NotNull final String uid) {
        return service.get(uid);
    }
}

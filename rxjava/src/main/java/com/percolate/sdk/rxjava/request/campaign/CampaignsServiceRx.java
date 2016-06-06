package com.percolate.sdk.rxjava.request.campaign;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Campaigns;
import com.percolate.sdk.dto.SingleCampaign;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v5/campaigns API definition.
 */
interface CampaignsServiceRx {

    @GET(Endpoints.API_V5_PATH + "/campaign/")
    Observable<Campaigns> list(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/campaign/{campaign_id}")
    Observable<SingleCampaign> get(@Path("campaign_id") String campaignId);

}

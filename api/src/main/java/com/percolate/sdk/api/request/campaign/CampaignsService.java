package com.percolate.sdk.api.request.campaign;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Campaigns;
import com.percolate.sdk.dto.SingleCampaign;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v5/campaigns API definition.
 */
interface CampaignsService {

    @GET(Endpoints.API_V5_PATH + "/campaign/")
    Call<Campaigns> list(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/campaign/{campaign_id}")
    Call<SingleCampaign> get(@Path("campaign_id") String campaignId);

}

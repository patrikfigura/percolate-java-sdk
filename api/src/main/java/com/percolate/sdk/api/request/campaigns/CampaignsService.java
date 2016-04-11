package com.percolate.sdk.api.request.campaigns;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Campaigns;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v5/campaigns API definition.
 */
interface CampaignsService {

    @GET(Endpoints.API_V5_PATH + "/campaign/")
    Call<Campaigns> get(@QueryMap Map<String, Object> params);

}

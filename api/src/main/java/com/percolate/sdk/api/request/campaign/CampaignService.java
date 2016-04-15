package com.percolate.sdk.api.request.campaign;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Brief;
import com.percolate.sdk.dto.BriefData;
import com.percolate.sdk.dto.Briefs;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * Percolate v5/campaign (and related) API definition.
 */
interface CampaignService {

    @GET(Endpoints.API_V5_PATH + "/campaign_brief/")
    Call<X> sections(@QueryMap Map<String, Object> params);
}

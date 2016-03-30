package com.percolate.sdk.api.request.interaction;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.InteractionData;
import com.percolate.sdk.dto.Interactions;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v5/interaction API definition.
 */
interface InteractionService {

    @GET(Endpoints.API_V5_PATH + "/interaction/")
    Call<Interactions> get(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V5_PATH + "/interaction/")
    Call<InteractionData> create(@Body InteractionData interaction);
}

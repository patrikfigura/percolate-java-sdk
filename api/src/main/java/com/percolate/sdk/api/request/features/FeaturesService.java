package com.percolate.sdk.api.request.features;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Features;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v5/features API definition.
 */
interface FeaturesService {

    @GET(Endpoints.API_V5_PATH + "/feature/")
    Call<Features> get(@QueryMap Map<String, Object> params);
}

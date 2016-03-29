package com.percolate.sdk.api.request.platform;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Platforms;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v5/platform API definition.
 */
interface PlatformsService {

    @GET(Endpoints.API_V5_PATH + "/platform/")
    Call<Platforms> get(@QueryMap Map<String, Object> params);
}

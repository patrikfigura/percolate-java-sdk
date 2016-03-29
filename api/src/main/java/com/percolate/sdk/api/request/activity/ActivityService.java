package com.percolate.sdk.api.request.activity;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.ActivityStream;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v4/activity API definition.
 */
interface ActivityService {

    @GET(Endpoints.API_V4_PATH + "/activity/")
    Call<ActivityStream> get(@QueryMap Map<String, Object> params);
}

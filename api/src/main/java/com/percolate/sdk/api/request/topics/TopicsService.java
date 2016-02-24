package com.percolate.sdk.api.request.topics;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.Topics;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v4/topics API definition.
 */
interface TopicsService {

    @GET(PercolateApi.API_V4_PATH + "/tag/")
    Call<Topics> get(@QueryMap Map<String, Object> params);
}

package com.percolate.sdk.api.request.streams;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.Streams;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v5/stream API definition.
 */
interface StreamsService {

    @GET(PercolateApi.API_V5_PATH + "/stream/")
    Call<Streams> get(@QueryMap Map<String, Object> params);
}

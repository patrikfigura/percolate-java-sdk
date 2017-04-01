package com.percolate.sdk.rxjava.request.topics;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Topics;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Percolate v4/topics API definition.
 */
interface TopicsServiceRx {

    @GET(Endpoints.API_V4_PATH + "/tag/")
    Observable<Topics> get(@QueryMap Map<String, Object> params);
}

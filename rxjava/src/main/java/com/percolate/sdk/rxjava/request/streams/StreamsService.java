package com.percolate.sdk.rxjava.request.streams;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Streams;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v5/stream API definition.
 */
interface StreamsService {

    @GET(Endpoints.API_V5_PATH + "/stream/")
    Observable<Streams> get(@QueryMap Map<String, Object> params);
}

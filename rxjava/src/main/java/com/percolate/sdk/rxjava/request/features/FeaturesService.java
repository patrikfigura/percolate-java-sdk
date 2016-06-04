package com.percolate.sdk.rxjava.request.features;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Features;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v5/features API definition.
 */
interface FeaturesService {

    @GET(Endpoints.API_V5_PATH + "/feature/")
    Observable<Features> get(@QueryMap Map<String, Object> params);
}

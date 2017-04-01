package com.percolate.sdk.rxjava.request.features;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Features;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Percolate v5/features API definition.
 */
interface FeaturesServiceRx {

    @GET(Endpoints.API_V5_PATH + "/feature/")
    Observable<Features> get(@QueryMap Map<String, Object> params);
}

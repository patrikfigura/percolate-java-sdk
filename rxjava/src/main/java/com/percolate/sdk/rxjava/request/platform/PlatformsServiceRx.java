package com.percolate.sdk.rxjava.request.platform;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Platforms;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Percolate v5/platform API definition.
 */
interface PlatformsServiceRx {

    @GET(Endpoints.API_V5_PATH + "/platform/")
    Observable<Platforms> get(@QueryMap Map<String, Object> params);
}

package com.percolate.sdk.rxjava.request.config;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Config;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Percolate v5/config/ API definition.
 */
interface ConfigServiceRx {

    @GET(Endpoints.API_V5_PATH + "/config/")
    Observable<Config> get();
}

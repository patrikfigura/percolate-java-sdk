package com.percolate.sdk.rxjava.request.config;

import com.percolate.sdk.api.config.Endpoints;
import retrofit2.Call;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Percolate v5/config/ API definition.
 */
interface ConfigServiceRx {

    @GET(Endpoints.API_V5_PATH + "/config/")
    Call<Observable> get();
}

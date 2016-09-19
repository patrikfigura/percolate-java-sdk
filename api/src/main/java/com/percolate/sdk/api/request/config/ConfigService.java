package com.percolate.sdk.api.request.config;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Config;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Percolate v5/config/ API definition.
 */
interface ConfigService {

    @GET(Endpoints.API_V5_PATH + "/config/")
    Call<Config> get();
}

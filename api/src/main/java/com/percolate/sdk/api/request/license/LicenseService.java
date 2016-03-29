package com.percolate.sdk.api.request.license;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Licenses;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v3/licenses API definition.
 */
interface LicenseService {

    @GET(Endpoints.API_V3_PATH + "/licenses")
    Call<Licenses> get(@QueryMap Map<String, Object> params);
}

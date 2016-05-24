package com.percolate.sdk.api.request.roles;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Roles;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v5/role API definition.
 */
interface RolesService {

    @GET(Endpoints.API_V5_PATH + "/role/")
    Call<Roles> get(@QueryMap Map<String, Object> params);
}

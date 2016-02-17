package com.percolate.sdk.api.request.authorization;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.UserRoles;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v3/authorization API definition.
 */
interface UserRolesService {

    @GET(PercolateApi.API_V3_PATH + "/authorization/{user_id}")
    Call<UserRoles> get(@Path("user_id") String userId, @QueryMap Map<String, Object> params);
}

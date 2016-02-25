package com.percolate.sdk.api.request.users;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.Users;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v3/users API definition.
 */
interface UsersService {

    @GET(PercolateApi.API_V3_PATH + "/users")
    Call<Users> get(@QueryMap Map<String, Object> params);
}

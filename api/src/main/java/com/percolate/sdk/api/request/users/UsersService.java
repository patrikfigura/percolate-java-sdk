package com.percolate.sdk.api.request.users;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.ChangePasswordError;
import com.percolate.sdk.dto.Users;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v3/users and v5/user API definition.
 */
interface UsersService {

    @GET(PercolateApi.API_V3_PATH + "/users")
    Call<Users> get(@QueryMap Map<String, Object> params);

    @PUT(PercolateApi.API_V5_PATH + "/users/{user_id}/password")
    Call<ChangePasswordError> changePassword(@Path("user_id") String userId, @QueryMap Map<String, Object> params);
}

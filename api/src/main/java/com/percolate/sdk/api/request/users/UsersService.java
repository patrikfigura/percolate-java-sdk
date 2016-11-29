package com.percolate.sdk.api.request.users;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.ChangePasswordError;
import com.percolate.sdk.dto.SingleUser;
import com.percolate.sdk.dto.Users;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/**
 * Percolate v3/users and v5/user API definition.
 */
interface UsersService {

    @GET(Endpoints.API_V5_PATH + "/me")
    Call<SingleUser> me();

    @GET(Endpoints.API_V3_PATH + "/users")
    Call<Users> get(@QueryMap Map<String, Object> params);

    @PUT(Endpoints.API_V5_PATH + "/user/{user_id}/password")
    Call<ChangePasswordError> changePassword(@Path("user_id") String userId, @Body Map<String, Object> params);
}

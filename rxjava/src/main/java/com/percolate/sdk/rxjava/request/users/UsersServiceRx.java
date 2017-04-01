package com.percolate.sdk.rxjava.request.users;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.ChangePasswordError;
import com.percolate.sdk.dto.SingleUser;
import com.percolate.sdk.dto.Users;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/**
 * Percolate v3/users and v5/user API definition.
 */
interface UsersServiceRx {

    @GET(Endpoints.API_V5_PATH + "/me")
    Observable<SingleUser> me();

    @GET(Endpoints.API_V3_PATH + "/users")
    Observable<Users> get(@QueryMap Map<String, Object> params);

    @PUT(Endpoints.API_V5_PATH + "/user/{user_id}/password")
    Observable<ChangePasswordError> changePassword(@Path("user_id") String userId, @Body Map<String, Object> params);
}

package com.percolate.sdk.rxjava.request.authorization;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.UserRoles;
import com.percolate.sdk.dto.UserRolesV5;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate user roles (v3 and v5) API definitions.
 */
interface UserRolesService {

    @GET(Endpoints.API_V3_PATH + "/authorization/{user_id}")
    Observable<UserRoles> get(@Path("user_id") String userId, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/user_role/")
    Observable<UserRolesV5> get(@QueryMap Map<String, Object> params);
}

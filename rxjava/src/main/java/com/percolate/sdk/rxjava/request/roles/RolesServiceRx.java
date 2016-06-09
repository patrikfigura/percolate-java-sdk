package com.percolate.sdk.rxjava.request.roles;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Roles;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v5/role API definition.
 */
interface RolesServiceRx {

    @GET(Endpoints.API_V5_PATH + "/role/")
    Observable<Roles> get(@QueryMap Map<String, Object> params);
}

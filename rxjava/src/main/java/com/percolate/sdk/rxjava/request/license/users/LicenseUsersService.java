package com.percolate.sdk.rxjava.request.license.users;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.LicenseUsers;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v3/license users API definition.
 */
interface LicenseUsersService {

    @GET(Endpoints.API_V3_PATH + "/licenses/{license_id}/users")
    Observable<LicenseUsers> get(@Path("license_id") String licenseId, @QueryMap Map<String, Object> params);
}

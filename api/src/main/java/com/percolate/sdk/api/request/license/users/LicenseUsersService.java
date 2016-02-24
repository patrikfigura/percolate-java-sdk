package com.percolate.sdk.api.request.license.users;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.LicenseUsers;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v3/license users API definition.
 */
interface LicenseUsersService {

    @GET(PercolateApi.API_V3_PATH + "/licenses/{license_id}/users")
    Call<LicenseUsers> get(@Path("license_id") String licenseId, @QueryMap Map<String, Object> params);
}

package com.percolate.sdk.rxjava.request.license;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Licenses;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Percolate v3/licenses API definition.
 */
interface LicenseServiceRx {

    @GET(Endpoints.API_V3_PATH + "/licenses")
    Observable<Licenses> get(@QueryMap Map<String, Object> params);
}

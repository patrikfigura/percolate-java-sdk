package com.percolate.sdk.rxjava.request.license.settings;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.LicensePublishingSettings;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Percolate v3/licenses API definition.
 */
interface LicenseSettingsServiceRx {

    @GET(Endpoints.API_V3_PATH + "/licenses/{id}/settings/publishing")
    Observable<LicensePublishingSettings> get(@Path("id") String id);

    @PUT(Endpoints.API_V3_PATH + "/licenses/{id}/settings/publishing")
    Observable<LicensePublishingSettings> update(@Path("id") String id, @Body LicensePublishingSettings body);
}

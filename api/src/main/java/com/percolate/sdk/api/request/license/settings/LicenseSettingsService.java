package com.percolate.sdk.api.request.license.settings;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.LicensePublishingSettings;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Percolate v3/licenses API definition.
 */
interface LicenseSettingsService {

    @GET(Endpoints.API_V3_PATH + "/licenses/{id}/settings/publishing")
    Call<LicensePublishingSettings> get(@Path("id") String id);

    @PUT(Endpoints.API_V3_PATH + "/licenses/{id}/settings/publishing")
    Call<LicensePublishingSettings> update(@Path("id") String id, @Body LicensePublishingSettings body);
}

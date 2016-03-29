package com.percolate.sdk.api.request.translate;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Translation;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v5/translate API definition.
 */
interface TranslateService {

    @GET(Endpoints.API_V5_PATH + "/translate/")
    Call<Translation> get(@QueryMap Map<String, Object> params);
}

package com.percolate.sdk.api.request.release;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.ReleaseFormHtml;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v4/release/form API definition.
 */
interface ReleaseFormService {

    @GET(Endpoints.API_V4_PATH + "/release/form")
    Call<ReleaseFormHtml> get(@QueryMap Map<String, Object> params);
}

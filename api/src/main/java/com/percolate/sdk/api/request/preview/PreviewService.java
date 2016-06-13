package com.percolate.sdk.api.request.preview;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Preview;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Percolate v5/preview API definition.
 */
interface PreviewService {

    @POST(Endpoints.API_V5_PATH + "/preview/")
    Call<Preview> create(@Body Map body);

}

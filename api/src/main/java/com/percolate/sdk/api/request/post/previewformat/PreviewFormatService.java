package com.percolate.sdk.api.request.post.previewformat;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.PreviewFormats;
import com.percolate.sdk.dto.SinglePreviewFormat;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/**
 * Percolate v5/preview_format API definition.
 */
interface PreviewFormatService {

    @GET(Endpoints.API_V5_PATH + "/preview_format/{preview_format_id}")
    Call<SinglePreviewFormat> get(@Path("preview_format_id") String previewFormatId);

    @GET(Endpoints.API_V5_PATH + "/preview_format/")
    Call<PreviewFormats> list(@QueryMap Map<String, Object> params);

}

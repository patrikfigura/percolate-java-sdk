package com.percolate.sdk.rxjava.request.previewformat;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.PreviewFormats;
import com.percolate.sdk.dto.SinglePreviewFormat;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v5/preview_format API definition.
 */
interface PreviewFormatServiceRx {

    @GET(Endpoints.API_V5_PATH + "/preview_format/{preview_format_id}")
    Observable<SinglePreviewFormat> get(@Path("preview_format_id") String previewFormatId);

    @GET(Endpoints.API_V5_PATH + "/preview_format/")
    Observable<PreviewFormats> list(@QueryMap Map<String, Object> params);

}

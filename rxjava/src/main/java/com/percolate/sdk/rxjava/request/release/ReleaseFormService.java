package com.percolate.sdk.rxjava.request.release;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.ReleaseFormHtml;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v4/release/form API definition.
 */
interface ReleaseFormService {

    @GET(Endpoints.API_V4_PATH + "/release/form")
    Observable<ReleaseFormHtml> get(@QueryMap Map<String, Object> params);
}

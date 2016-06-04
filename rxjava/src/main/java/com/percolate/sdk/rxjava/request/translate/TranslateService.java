package com.percolate.sdk.rxjava.request.translate;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Translation;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v5/translate API definition.
 */
interface TranslateService {

    @GET(Endpoints.API_V5_PATH + "/translate/")
    Observable<Translation> get(@QueryMap Map<String, Object> params);
}

package com.percolate.sdk.rxjava.request.responses;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.CannedResponses;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v5/canned_response API definition.
 */
interface CannedResponsesServiceRx {

    @GET(Endpoints.API_V5_PATH + "/canned_response/")
    Observable<CannedResponses> get(@QueryMap Map<String, Object> params);
}

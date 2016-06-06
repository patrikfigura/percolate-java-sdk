package com.percolate.sdk.rxjava.request.interaction;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.InteractionData;
import com.percolate.sdk.dto.Interactions;

import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v5/interaction API definition.
 */
interface InteractionServiceRx {

    @GET(Endpoints.API_V5_PATH + "/interaction/")
    Observable<Interactions> get(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V5_PATH + "/interaction/")
    Observable<InteractionData> create(@Body InteractionData interaction);
}

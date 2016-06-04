package com.percolate.sdk.rxjava.request.activity;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.ActivityStream;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v4/activity API definition.
 */
interface ActivityService {

    @GET(Endpoints.API_V4_PATH + "/activity/")
    Observable<ActivityStream> get(@QueryMap Map<String, Object> params);
}

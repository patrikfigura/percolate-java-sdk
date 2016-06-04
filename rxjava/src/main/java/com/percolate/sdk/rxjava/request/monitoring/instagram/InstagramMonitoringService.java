package com.percolate.sdk.rxjava.request.monitoring.instagram;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.InstagramMonitoringObjects;
import com.percolate.sdk.dto.InstagramSingleMonitoringObject;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v4/monitoring/instagram API definition.
 */
interface InstagramMonitoringService {

    @GET(Endpoints.API_V4_PATH + "/monitoring/instagram/interaction/")
    Observable<InstagramMonitoringObjects> interactions(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/monitoring/instagram/interaction/{comment_id}")
    Observable<InstagramSingleMonitoringObject> interaction(@Path("comment_id") String commentId, @QueryMap Map<String, Object> params);
}

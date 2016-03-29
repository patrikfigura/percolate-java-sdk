package com.percolate.sdk.api.request.monitoring.instagram;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v4/monitoring/instagram API definition.
 */
interface InstagramMonitoringService {

    @GET(Endpoints.API_V4_PATH + "/monitoring/instagram/interaction/")
    Call<InstagramMonitoringObjects> interactions(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/monitoring/instagram/interaction/{comment_id}")
    Call<InstagramSingleMonitoringObject> interaction(@Path("comment_id") String commentId, @QueryMap Map<String, Object> params);
}

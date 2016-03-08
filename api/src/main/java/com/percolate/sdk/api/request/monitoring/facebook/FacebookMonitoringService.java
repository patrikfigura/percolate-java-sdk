package com.percolate.sdk.api.request.monitoring.facebook;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v4/monitoring/facebook API definition.
 */
interface FacebookMonitoringService {

    @GET(PercolateApi.API_V4_PATH + "/monitoring/facebook/interaction/")
    Call<FacebookMonitoringObjects> interactions(@QueryMap Map<String, Object> params);

    @GET(PercolateApi.API_V4_PATH + "/monitoring/facebook/interaction/{feed_id}")
    Call<FacebookMonitoringObject> interaction(@Path("feed_id") String feedId, @QueryMap Map<String, Object> params);

    @GET(PercolateApi.API_V4_PATH + "/monitoring/facebook/interaction/{facebook_id}/ancestors/")
    Call<FacebookMonitoringObjectsList> ancestors(@Path("facebook_id") String facebookId, @QueryMap Map<String, Object> params);

    @GET(PercolateApi.API_V4_PATH + "/monitoring/facebook/interaction/{parent_item_id}/responses/")
    Call<FacebookMonitoringObjects> responses(@Path("parent_item_id") String parentItemId, @QueryMap Map<String, Object> params);

    @GET(PercolateApi.API_V4_PATH + "/monitoring/facebook/conversation/")
    Call<FacebookConversationList> conversation(@QueryMap Map<String, Object> params);

    @GET(PercolateApi.API_V4_PATH + "/monitoring/facebook/conversation/{conversation_id}/messages/")
    Call<FacebookConversationThread> messages(@Path("conversation_id") String conversationId, @QueryMap Map<String, Object> params);
}

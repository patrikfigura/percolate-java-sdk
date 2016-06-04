package com.percolate.sdk.rxjava.request.monitoring.facebook;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.FacebookConversationList;
import com.percolate.sdk.dto.FacebookConversationThread;
import com.percolate.sdk.dto.FacebookMonitoringObject;
import com.percolate.sdk.dto.FacebookMonitoringObjects;
import com.percolate.sdk.dto.FacebookMonitoringObjectsList;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v4/monitoring/facebook API definition.
 */
interface FacebookMonitoringService {

    @GET(Endpoints.API_V4_PATH + "/monitoring/facebook/interaction/")
    Observable<FacebookMonitoringObjects> interactions(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/monitoring/facebook/interaction/{feed_id}")
    Observable<FacebookMonitoringObject> interaction(@Path("feed_id") String feedId, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/monitoring/facebook/interaction/{facebook_id}/ancestors/")
    Observable<FacebookMonitoringObjectsList> ancestors(@Path("facebook_id") String facebookId, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/monitoring/facebook/interaction/{parent_item_id}/responses/")
    Observable<FacebookMonitoringObjects> responses(@Path("parent_item_id") String parentItemId, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/monitoring/facebook/conversation/")
    Observable<FacebookConversationList> conversation(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/monitoring/facebook/conversation/{conversation_id}/messages/")
    Observable<FacebookConversationThread> messages(@Path("conversation_id") String conversationId, @QueryMap Map<String, Object> params);
}

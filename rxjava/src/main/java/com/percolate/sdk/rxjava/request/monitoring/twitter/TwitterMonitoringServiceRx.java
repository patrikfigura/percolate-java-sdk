package com.percolate.sdk.rxjava.request.monitoring.twitter;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.TwitterConversationList;
import com.percolate.sdk.dto.TwitterConversationThread;
import com.percolate.sdk.dto.TwitterInteractions;
import com.percolate.sdk.dto.TwitterInteractionsData;
import com.percolate.sdk.dto.TwitterMonitoringObjects;
import com.percolate.sdk.dto.TwitterQueries;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/**
 * Percolate v4/monitoring/twitter API definition.
 */
interface TwitterMonitoringServiceRx {

    @GET(Endpoints.API_V4_PATH + "/monitoring/twitter/interaction/{tweet_id}")
    Observable<TwitterInteractions> thread(@Path("tweet_id") String tweetId, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/monitoring/twitter/interaction/{tweet_id}/")
    Observable<TwitterInteractionsData> interaction(@Path("tweet_id") String tweetId, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/monitoring/twitter/conversation/")
    Observable<TwitterConversationList> conversations(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/monitoring/twitter/conversation/{twitter_user_id}/messages/")
    Observable<TwitterConversationThread> messages(@Path("twitter_user_id") String twitterUserId, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/monitoring/twitter/interaction/")
    Observable<TwitterMonitoringObjects> interactions(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/monitoring/query/")
    Observable<TwitterQueries> query(@QueryMap Map<String, Object> params);
}

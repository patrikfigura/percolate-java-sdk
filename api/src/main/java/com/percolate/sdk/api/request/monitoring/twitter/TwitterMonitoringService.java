package com.percolate.sdk.api.request.monitoring.twitter;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v4/monitoring/twitter API definition.
 */
interface TwitterMonitoringService {

    @GET(PercolateApi.API_V4_PATH + "/monitoring/twitter/interaction/{tweet_id}")
    Call<TwitterInteractions> thread(@Path("tweet_id") String tweetId, @QueryMap Map<String, Object> params);

    @GET(PercolateApi.API_V4_PATH + "/monitoring/twitter/interaction/{tweet_id}/")
    Call<TwitterInteractionsData> interaction(@Path("tweet_id") String tweetId, @QueryMap Map<String, Object> params);

    @GET(PercolateApi.API_V4_PATH + "/monitoring/twitter/conversation/")
    Call<TwitterConversationList> conversations(@QueryMap Map<String, Object> params);

    @GET(PercolateApi.API_V4_PATH + "/monitoring/twitter/conversation/{twitter_user_id}/messages/")
    Call<TwitterConversationThread> messages(@Path("twitter_user_id") String twitterUserId, @QueryMap Map<String, Object> params);

    @GET(PercolateApi.API_V4_PATH + "/monitoring/twitter/interaction/")
    Call<TwitterMonitoringObjects> interactions(@QueryMap Map<String, Object> params);

    @GET(PercolateApi.API_V4_PATH + "/monitoring/query/")
    Call<TwitterQueries> query(@QueryMap Map<String, Object> params);
}

package com.percolate.sdk.api.request.vendor.twitter;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * Percolate v4/vendor/twitter API definition.
 */
interface TwitterVendorService {

    @DELETE(Endpoints.API_V4_PATH + "/vendor/twitter/blocks")
    Call<TwitterUser> unblock(@QueryMap Map<String, Object> params);

    @DELETE(Endpoints.API_V4_PATH + "/vendor/twitter/favorites")
    Call<Tweet> unfavorite(@QueryMap Map<String, Object> params);

    @DELETE(Endpoints.API_V4_PATH + "/vendor/twitter/friendships")
    Call<TwitterUser> unfollow(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/vendor/twitter/statuses/show/{tweet_id}")
    Call<Tweet> getTweet(@Path("tweet_id") String tweetId, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/vendor/twitter/blocks/ids")
    Call<TwitterBlocks> blocks(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/vendor/twitter/friendships")
    Call<TwitterRelationships> following(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/vendor/twitter/statuses/user_timeline")
    Call<TweetList> timeline(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/vendor/twitter/users/show")
    Call<TwitterUser> user(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V4_PATH + "/vendor/twitter/blocks")
    Call<TwitterUser> block(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V4_PATH + "/vendor/twitter/direct_messages")
    Call<TwitterConversationMessage> dm(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V4_PATH + "/vendor/twitter/favorites")
    Call<Tweet> favorite(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V4_PATH + "/vendor/twitter/friendships")
    Call<TwitterUser> follow(@QueryMap Map<String, Object> params);
}

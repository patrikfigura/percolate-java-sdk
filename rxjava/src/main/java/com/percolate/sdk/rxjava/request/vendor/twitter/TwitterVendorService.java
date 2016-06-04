package com.percolate.sdk.rxjava.request.vendor.twitter;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Tweet;
import com.percolate.sdk.dto.TweetList;
import com.percolate.sdk.dto.TwitterBlocks;
import com.percolate.sdk.dto.TwitterConversationMessage;
import com.percolate.sdk.dto.TwitterRelationships;
import com.percolate.sdk.dto.TwitterUser;

import java.util.Map;

import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v4/vendor/twitter API definition.
 */
interface TwitterVendorService {

    @DELETE(Endpoints.API_V4_PATH + "/vendor/twitter/blocks")
    Observable<TwitterUser> unblock(@QueryMap Map<String, Object> params);

    @DELETE(Endpoints.API_V4_PATH + "/vendor/twitter/favorites")
    Observable<Tweet> unfavorite(@QueryMap Map<String, Object> params);

    @DELETE(Endpoints.API_V4_PATH + "/vendor/twitter/friendships")
    Observable<TwitterUser> unfollow(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/vendor/twitter/statuses/show/{tweet_id}")
    Observable<Tweet> getTweet(@Path("tweet_id") String tweetId, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/vendor/twitter/blocks/ids")
    Observable<TwitterBlocks> blocks(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/vendor/twitter/friendships")
    Observable<TwitterRelationships> following(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/vendor/twitter/statuses/user_timeline")
    Observable<TweetList> timeline(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/vendor/twitter/users/show")
    Observable<TwitterUser> user(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V4_PATH + "/vendor/twitter/blocks")
    Observable<TwitterUser> block(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V4_PATH + "/vendor/twitter/direct_messages")
    Observable<TwitterConversationMessage> dm(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V4_PATH + "/vendor/twitter/favorites")
    Observable<Tweet> favorite(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V4_PATH + "/vendor/twitter/friendships")
    Observable<TwitterUser> follow(@QueryMap Map<String, Object> params);
}

package com.percolate.sdk.api.request.vendor.twitter;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.vendor.twitter.params.*;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.*;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Twitter request proxy.
 */
@SuppressWarnings("unused")
public class TwitterVendorRequest {

    private TwitterVendorService service;

    public TwitterVendorRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(TwitterVendorService.class);
    }

    /**
     * Unblock Twitter user.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<TwitterUser> unblock(@NotNull final TwitterVendorParams params) {
        return service.unblock(params.getParams());
    }

    /**
     * Unfavorite tweet.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Tweet> unfavorite(@NotNull final TwitterUnfavoriteVendorParams params) {
        return service.unfavorite(params.getParams());
    }

    /**
     * Unfollow Twitter user.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<TwitterUser> unfollow(@NotNull final TwitterVendorParams params) {
        return service.unfollow(params.getParams());
    }

    /**
     * Get tweet.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Tweet> getTweet(@NotNull final TwitterGetTweetVendorParams params) {
        return service.getTweet(params.getTweetId(), params.getParams());
    }

    /**
     * Get Twitter user blocks.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<TwitterBlocks> blocks(@NotNull final TwitterBlocksVendorParams params) {
        return service.blocks(params.getParams());
    }

    /**
     * Get Twitter following status.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<TwitterRelationships> following(@NotNull final TwitterFollowingVendorParams params) {
        return service.following(params.getParams());
    }

    /**
     * Get Twitter user timeline.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<TweetList> timeline(@NotNull final TwitterTimelineVendorParams params) {
        return service.timeline(params.getParams());
    }

    /**
     * Get Twitter user.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<TwitterUser> user(@NotNull final TwitterUserVendorParams params) {
        return service.user(params.getParams());
    }

    /**
     * Block Twitter user.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<TwitterUser> block(@NotNull final TwitterVendorParams params) {
        return service.block(params.getParams());
    }

    /**
     * Direct Message Twitter user.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<TwitterConversationMessage> dm(@NotNull final TwitterDmVendorParams params) {
        return service.dm(params.getParams());
    }

    /**
     * Favorite a tweet.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Tweet> favorite(@NotNull final TwitterFavoriteVendorParams params) {
        return service.favorite(params.getParams());
    }

    /**
     * Follow a Twitter user.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<TwitterUser> follow(@NotNull final TwitterVendorParams params) {
        return service.follow(params.getParams());
    }
}

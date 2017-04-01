package com.percolate.sdk.rxjava.request.vendor.twitter;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.vendor.twitter.params.TwitterBlocksVendorParams;
import com.percolate.sdk.api.request.vendor.twitter.params.TwitterDmVendorParams;
import com.percolate.sdk.api.request.vendor.twitter.params.TwitterFavoriteVendorParams;
import com.percolate.sdk.api.request.vendor.twitter.params.TwitterFollowingVendorParams;
import com.percolate.sdk.api.request.vendor.twitter.params.TwitterGetTweetVendorParams;
import com.percolate.sdk.api.request.vendor.twitter.params.TwitterTimelineVendorParams;
import com.percolate.sdk.api.request.vendor.twitter.params.TwitterUnfavoriteVendorParams;
import com.percolate.sdk.api.request.vendor.twitter.params.TwitterUserVendorParams;
import com.percolate.sdk.api.request.vendor.twitter.params.TwitterVendorParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Tweet;
import com.percolate.sdk.dto.TweetList;
import com.percolate.sdk.dto.TwitterBlocks;
import com.percolate.sdk.dto.TwitterConversationMessage;
import com.percolate.sdk.dto.TwitterRelationships;
import com.percolate.sdk.dto.TwitterUser;

import org.jetbrains.annotations.NotNull;

import io.reactivex.Observable;

/**
 * Twitter request proxy.
 */
@SuppressWarnings("unused")
public class TwitterVendorRequestRx {

    private TwitterVendorServiceRx service;

    public TwitterVendorRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(TwitterVendorServiceRx.class);
    }

    /**
     * Unblock Twitter user.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<TwitterUser> unblock(@NotNull final TwitterVendorParams params) {
        return service.unblock(params.getParams());
    }

    /**
     * Unfavorite tweet.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Tweet> unfavorite(@NotNull final TwitterUnfavoriteVendorParams params) {
        return service.unfavorite(params.getParams());
    }

    /**
     * Unfollow Twitter user.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<TwitterUser> unfollow(@NotNull final TwitterVendorParams params) {
        return service.unfollow(params.getParams());
    }

    /**
     * Get tweet.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Tweet> getTweet(@NotNull final TwitterGetTweetVendorParams params) {
        return service.getTweet(params.getTweetId(), params.getParams());
    }

    /**
     * Get Twitter user blocks.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<TwitterBlocks> blocks(@NotNull final TwitterBlocksVendorParams params) {
        return service.blocks(params.getParams());
    }

    /**
     * Get Twitter following status.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<TwitterRelationships> following(@NotNull final TwitterFollowingVendorParams params) {
        return service.following(params.getParams());
    }

    /**
     * Get Twitter user timeline.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<TweetList> timeline(@NotNull final TwitterTimelineVendorParams params) {
        return service.timeline(params.getParams());
    }

    /**
     * Get Twitter user.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<TwitterUser> user(@NotNull final TwitterUserVendorParams params) {
        return service.user(params.getParams());
    }

    /**
     * Block Twitter user.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<TwitterUser> block(@NotNull final TwitterVendorParams params) {
        return service.block(params.getParams());
    }

    /**
     * Direct Message Twitter user.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<TwitterConversationMessage> dm(@NotNull final TwitterDmVendorParams params) {
        return service.dm(params.getParams());
    }

    /**
     * Favorite a tweet.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Tweet> favorite(@NotNull final TwitterFavoriteVendorParams params) {
        return service.favorite(params.getParams());
    }

    /**
     * Follow a Twitter user.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<TwitterUser> follow(@NotNull final TwitterVendorParams params) {
        return service.follow(params.getParams());
    }
}

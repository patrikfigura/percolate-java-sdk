package com.percolate.sdk.rxjava.request.monitoring.twitter;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.monitoring.twitter.TwitterMonitoringConversationParams;
import com.percolate.sdk.api.request.monitoring.twitter.TwitterMonitoringInteractionParams;
import com.percolate.sdk.api.request.monitoring.twitter.TwitterMonitoringInteractionsParams;
import com.percolate.sdk.api.request.monitoring.twitter.TwitterMonitoringMessagesParams;
import com.percolate.sdk.api.request.monitoring.twitter.TwitterMonitoringQueryParams;
import com.percolate.sdk.api.request.monitoring.twitter.TwitterMonitoringThreadParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.TwitterConversationList;
import com.percolate.sdk.dto.TwitterConversationThread;
import com.percolate.sdk.dto.TwitterInteractions;
import com.percolate.sdk.dto.TwitterInteractionsData;
import com.percolate.sdk.dto.TwitterMonitoringObjects;
import com.percolate.sdk.dto.TwitterQueries;

import org.jetbrains.annotations.NotNull;

import io.reactivex.Observable;

/**
 * Twitter monitoring request proxy.
 */
@SuppressWarnings("unused")
public class TwitterMonitoringRequestRx {

    private TwitterMonitoringServiceRx service;

    public TwitterMonitoringRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(TwitterMonitoringServiceRx.class);
    }

    /**
     * Query twitter monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<TwitterInteractions> thread(@NotNull final TwitterMonitoringThreadParams params) {
        return service.thread(params.getTweetId(), params.getParams());
    }

    /**
     * Query twitter monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<TwitterInteractionsData> interaction(@NotNull final TwitterMonitoringInteractionParams params) {
        return service.interaction(params.getTweetId(), params.getParams());
    }

    /**
     * Query twitter monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<TwitterConversationList> conversations(@NotNull final TwitterMonitoringConversationParams params) {
        return service.conversations(params.getParams());
    }

    /**
     * Query twitter monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<TwitterConversationThread> messages(@NotNull final TwitterMonitoringMessagesParams params) {
        return service.messages(params.getTwitterUserId(), params.getParams());
    }

    /**
     * Query twitter monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<TwitterMonitoringObjects> interactions(@NotNull final TwitterMonitoringInteractionsParams params) {
        return service.interactions(params.getParams());
    }

    /**
     * Query twitter monitoring query endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<TwitterQueries> query(@NotNull final TwitterMonitoringQueryParams params) {
        return service.query(params.getParams());
    }
}

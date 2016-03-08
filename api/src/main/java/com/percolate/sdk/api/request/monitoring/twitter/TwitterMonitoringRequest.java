package com.percolate.sdk.api.request.monitoring.twitter;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.*;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Twitter monitoring request proxy.
 */
@SuppressWarnings("unused")
public class TwitterMonitoringRequest {

    private TwitterMonitoringService service;

    public TwitterMonitoringRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(TwitterMonitoringService.class);
    }

    /**
     * Query twitter monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<TwitterInteractions> thread(@NotNull final TwitterMonitoringThreadParams params) {
        return service.thread(params.getTweetId(), params.getParams());
    }

    /**
     * Query twitter monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<TwitterInteractionsData> interaction(@NotNull final TwitterMonitoringInteractionParams params) {
        return service.interaction(params.getTweetId(), params.getParams());
    }

    /**
     * Query twitter monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<TwitterConversationList> conversations(@NotNull final TwitterMonitoringConversationParams params) {
        return service.conversations(params.getParams());
    }

    /**
     * Query twitter monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<TwitterConversationThread> messages(@NotNull final TwitterMonitoringMessagesParams params) {
        return service.messages(params.getTwitterUserId(), params.getParams());
    }

    /**
     * Query twitter monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<TwitterMonitoringObjects> interactions(@NotNull final TwitterMonitoringInteractionsParams params) {
        return service.interactions(params.getParams());
    }

    /**
     * Query twitter monitoring query endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<TwitterQueries> query(@NotNull final TwitterMonitoringQueryParams params) {
        return service.query(params.getParams());
    }
}

package com.percolate.sdk.rxjava.request.monitoring.facebook;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.monitoring.facebook.FacebookMonitoringAncestorsParams;
import com.percolate.sdk.api.request.monitoring.facebook.FacebookMonitoringConversationParams;
import com.percolate.sdk.api.request.monitoring.facebook.FacebookMonitoringInteractionParams;
import com.percolate.sdk.api.request.monitoring.facebook.FacebookMonitoringInteractionsParams;
import com.percolate.sdk.api.request.monitoring.facebook.FacebookMonitoringMessagesParams;
import com.percolate.sdk.api.request.monitoring.facebook.FacebookMonitoringResponsesParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.FacebookConversationList;
import com.percolate.sdk.dto.FacebookConversationThread;
import com.percolate.sdk.dto.FacebookMonitoringObject;
import com.percolate.sdk.dto.FacebookMonitoringObjects;
import com.percolate.sdk.dto.FacebookMonitoringObjectsList;

import org.jetbrains.annotations.NotNull;

import rx.Observable;

/**
 * Facebook monitoring request proxy.
 */
@SuppressWarnings("unused")
public class FacebookMonitoringRequestRx {

    private FacebookMonitoringServiceRx service;

    public FacebookMonitoringRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(FacebookMonitoringServiceRx.class);
    }

    /**
     * Query facebook monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<FacebookMonitoringObjects> interactions(@NotNull final FacebookMonitoringInteractionsParams params) {
        return service.interactions(params.getParams());
    }

    /**
     * Query facebook monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<FacebookMonitoringObject> interaction(@NotNull final FacebookMonitoringInteractionParams params) {
        return service.interaction(params.getFeedId(), params.getParams());
    }

    /**
     * Query facebook monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<FacebookMonitoringObjectsList> ancestors(@NotNull final FacebookMonitoringAncestorsParams params) {
        return service.ancestors(params.getFacebookId(), params.getParams());
    }

    /**
     * Query facebook monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<FacebookMonitoringObjects> responses(@NotNull final FacebookMonitoringResponsesParams params) {
        return service.responses(params.getParentItemId(), params.getParams());
    }

    /**
     * Query facebook monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<FacebookConversationList> conversation(@NotNull final FacebookMonitoringConversationParams params) {
        return service.conversation(params.getParams());
    }

    /**
     * Query facebook monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<FacebookConversationThread> messages(@NotNull final FacebookMonitoringMessagesParams params) {
        return service.messages(params.getConversationId(), params.getParams());
    }

}

package com.percolate.sdk.api.request.monitoring.facebook;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.*;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Facebook monitoring request proxy.
 */
@SuppressWarnings("unused")
public class FacebookMonitoringRequest {

    private FacebookMonitoringService service;

    public FacebookMonitoringRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(FacebookMonitoringService.class);
    }

    /**
     * Query facebook monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<FacebookMonitoringObjects> interactions(@NotNull final FacebookMonitoringInteractionsParams params) {
        return service.interactions(params.getParams());
    }

    /**
     * Query facebook monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<FacebookMonitoringObject> interaction(@NotNull final FacebookMonitoringInteractionParams params) {
        return service.interaction(params.getFeedId(), params.getParams());
    }

    /**
     * Query facebook monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<FacebookMonitoringObjectsList> ancestors(@NotNull final FacebookMonitoringAncestorsParams params) {
        return service.ancestors(params.getFacebookId(), params.getParams());
    }

    /**
     * Query facebook monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<FacebookMonitoringObjects> responses(@NotNull final FacebookMonitoringResponsesParams params) {
        return service.responses(params.getParentItemId(), params.getParams());
    }

    /**
     * Query facebook monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<FacebookConversationList> conversation(@NotNull final FacebookMonitoringConversationParams params) {
        return service.conversation(params.getParams());
    }

    /**
     * Query facebook monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<FacebookConversationThread> messages(@NotNull final FacebookMonitoringMessagesParams params) {
        return service.messages(params.getConversationId(), params.getParams());
    }

}

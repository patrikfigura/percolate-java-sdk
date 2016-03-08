package com.percolate.sdk.api.request.vendor.facebook;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.vendor.facebook.params.*;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.*;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Facebook vendor API request proxy.
 */
@SuppressWarnings("unused")
public class FacebookVendorRequest {

    private FacebookVendorService service;

    public FacebookVendorRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(FacebookVendorService.class);
    }

    /**
     * Unlike Facebook post.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<SuccessStatus> unlike(@NotNull final FacebookUnlikeVendorParams params) {
        return service.unlike(params.getParams());
    }

    /**
     * Get Facebook conversation.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<FacebookConversationListData> conversation(@NotNull final FacebookConversationVendorParams params) {
        return service.conversation(params.getConversationId(), params.getParams());
    }

    /**
     * Get Facebook mentions.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<FacebookMentions> mentions(@NotNull final FacebookMentionsVendorParams params) {
        return service.mentions(params.getParams());
    }

    /**
     * Get Facebook message.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<FacebookMessageExtendedData> message(@NotNull final FacebookMessageVendorParams params) {
        return service.message(params.getMessageId(), params.getParams());
    }

    /**
     * Get Facebook user.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<FacebookUser> user(@NotNull final FacebookUserVendorParams params) {
        return service.user(params.getParams());
    }

    /**
     * Get Facebook conversation message.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<FacebookConversationMessageIdData> conversationMessage(@NotNull final FacebookConversationMessageVendorParams params) {
        return service.conversationMessage(params.getConversationId(), params.getParams());
    }

    /**
     * Like Facebook post.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<SuccessStatus> like(@NotNull final FacebookLikeVendorParams params) {
        return service.like(params.getParams());
    }
}

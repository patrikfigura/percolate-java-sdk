package com.percolate.sdk.rxjava.request.vendor.facebook;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.vendor.facebook.params.FacebookConversationMessageVendorParams;
import com.percolate.sdk.api.request.vendor.facebook.params.FacebookConversationVendorParams;
import com.percolate.sdk.api.request.vendor.facebook.params.FacebookLikeVendorParams;
import com.percolate.sdk.api.request.vendor.facebook.params.FacebookMentionsVendorParams;
import com.percolate.sdk.api.request.vendor.facebook.params.FacebookMessageVendorParams;
import com.percolate.sdk.api.request.vendor.facebook.params.FacebookUnlikeVendorParams;
import com.percolate.sdk.api.request.vendor.facebook.params.FacebookUserVendorParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.FacebookConversationListData;
import com.percolate.sdk.dto.FacebookConversationMessageIdData;
import com.percolate.sdk.dto.FacebookMentions;
import com.percolate.sdk.dto.FacebookMessageExtendedData;
import com.percolate.sdk.dto.FacebookUser;
import com.percolate.sdk.dto.SuccessStatus;

import org.jetbrains.annotations.NotNull;

import rx.Observable;

/**
 * Facebook vendor API request proxy.
 */
@SuppressWarnings("unused")
public class FacebookVendorRequestRx {

    private FacebookVendorServiceRx service;

    public FacebookVendorRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(FacebookVendorServiceRx.class);
    }

    /**
     * Unlike Facebook post.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<SuccessStatus> unlike(@NotNull final FacebookUnlikeVendorParams params) {
        return service.unlike(params.getParams());
    }

    /**
     * Get Facebook conversation.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<FacebookConversationListData> conversation(@NotNull final FacebookConversationVendorParams params) {
        return service.conversation(params.getConversationId(), params.getParams());
    }

    /**
     * Get Facebook mentions.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<FacebookMentions> mentions(@NotNull final FacebookMentionsVendorParams params) {
        return service.mentions(params.getParams());
    }

    /**
     * Get Facebook message.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<FacebookMessageExtendedData> message(@NotNull final FacebookMessageVendorParams params) {
        return service.message(params.getMessageId(), params.getParams());
    }

    /**
     * Get Facebook user.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<FacebookUser> user(@NotNull final FacebookUserVendorParams params) {
        return service.user(params.getParams());
    }

    /**
     * Get Facebook conversation message.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<FacebookConversationMessageIdData> conversationMessage(@NotNull final FacebookConversationMessageVendorParams params) {
        return service.conversationMessage(params.getConversationId(), params.getParams());
    }

    /**
     * Like Facebook post.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<SuccessStatus> like(@NotNull final FacebookLikeVendorParams params) {
        return service.like(params.getParams());
    }
}

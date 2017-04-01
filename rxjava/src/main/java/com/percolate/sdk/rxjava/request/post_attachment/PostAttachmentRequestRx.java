package com.percolate.sdk.rxjava.request.post_attachment;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.post_attachment.PostAttachmentParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.PostAttachment;
import com.percolate.sdk.dto.PostAttachmentData;
import com.percolate.sdk.dto.SinglePostAttachment;

import org.jetbrains.annotations.NotNull;

import io.reactivex.Observable;

/**
 * Post attachment request proxy.
 */
@SuppressWarnings("unused")
public class PostAttachmentRequestRx {

    private PostAttachmentServiceRx service;

    public PostAttachmentRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(PostAttachmentServiceRx.class);
    }

    /**
     * Query post attachment endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<PostAttachment> list(@NotNull final PostAttachmentParams params) {
        return service.get(params.getParams());
    }

    /**
     * Query post attachment endpoint.
     *
     * @param uid Post attachment uid.
     * @return {@link Observable} object.
     */
    public Observable<SinglePostAttachment> get(@NotNull final String uid) {
        return service.get(uid);
    }

    /**
     * Create post attachment endpoint.
     *
     * @param attachmentData {@link PostAttachmentData} object.
     * @return {@link Observable} object.
     */
    public Observable<SinglePostAttachment> create(@NotNull final PostAttachmentData attachmentData) {
        return service.create(attachmentData);
    }

    /**
     * Update post attachment endpoint.
     *
     * @param attachmentData {@link PostAttachmentData} object.
     * @return {@link Observable} object.
     */
    public Observable<SinglePostAttachment> update(@NotNull final PostAttachmentData attachmentData) {
        return service.update(attachmentData.getId(), attachmentData);
    }

}

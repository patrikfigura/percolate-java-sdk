package com.percolate.sdk.api.request.post_attachment;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.PostAttachment;
import com.percolate.sdk.dto.PostAttachmentData;
import com.percolate.sdk.dto.SinglePostAttachment;

import org.jetbrains.annotations.NotNull;

import retrofit2.Call;

/**
 * Post attachment request proxy.
 */
@SuppressWarnings("unused")
public class PostAttachmentRequest {

    private PostAttachmentService service;

    public PostAttachmentRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(PostAttachmentService.class);
    }

    /**
     * Query post attachment endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<PostAttachment> list(@NotNull final PostAttachmentParams params) {
        return service.get(params.getParams());
    }

    /**
     * Query post attachment endpoint.
     *
     * @param uid Post attachment uid.
     * @return {@link Call} object.
     */
    public Call<SinglePostAttachment> get(@NotNull final String uid) {
        return service.get(uid);
    }

    /**
     * Create post attachment endpoint.
     *
     * @param attachmentData {@link PostAttachmentData} object.
     * @return {@link Call} object.
     */
    public Call<SinglePostAttachment> create(@NotNull final PostAttachmentData attachmentData) {
        return service.create(attachmentData);
    }

    /**
     * Update post attachment endpoint.
     *
     * @param attachmentData {@link PostAttachmentData} object.
     * @return {@link Call} object.
     */
    public Call<SinglePostAttachment> update(@NotNull final PostAttachmentData attachmentData) {
        return service.update(attachmentData.getId(), attachmentData);
    }

}

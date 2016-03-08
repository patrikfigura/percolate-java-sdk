package com.percolate.sdk.api.request.comment;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.*;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Comment request proxy.
 */
@SuppressWarnings("unused")
public class CommentRequest {

    private CommentService service;

    public CommentRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(CommentService.class);
    }

    /**
     * Query comment endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Comments> get(@NotNull final CommentParams params) {
        return service.get(params.getParams());
    }

    /**
     * Create comment.
     *
     * @param comment {@link Comment} object.
     * @return {@link CommentData} object.
     */
    public Call<CommentData> create(@NotNull final Comment comment) {
        return service.create(comment);
    }

    /**
     * Delete comment.
     *
     * @param commentId Comment UID.
     * @return {@link Call} object.
     */
    public Call<ResponseBody> delete(@NotNull final String commentId) {
        return service.create(commentId);
    }
}

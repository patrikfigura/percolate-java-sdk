package com.percolate.sdk.rxjava.request.comment;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.comment.CommentParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Comment;
import com.percolate.sdk.dto.CommentData;
import com.percolate.sdk.dto.Comments;

import org.jetbrains.annotations.NotNull;

import io.reactivex.Observable;
import okhttp3.ResponseBody;

/**
 * Comment request proxy.
 */
@SuppressWarnings("unused")
public class CommentRequestRx {

    private CommentServiceRx service;

    public CommentRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(CommentServiceRx.class);
    }

    /**
     * Query comment endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Comments> get(@NotNull final CommentParams params) {
        return service.get(params.getParams());
    }

    /**
     * Create comment.
     *
     * @param comment {@link Comment} object.
     * @return {@link CommentData} object.
     */
    public Observable<CommentData> create(@NotNull final Comment comment) {
        return service.create(comment);
    }

    /**
     * Delete comment.
     *
     * @param commentId Comment UID.
     * @return {@link Observable} object.
     */
    public Observable<ResponseBody> delete(@NotNull final String commentId) {
        return service.create(commentId);
    }
}

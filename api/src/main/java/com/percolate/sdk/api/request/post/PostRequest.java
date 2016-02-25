package com.percolate.sdk.api.request.post;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.PostV5;
import com.percolate.sdk.dto.PostV5Data;
import com.percolate.sdk.dto.PostsV5;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Post request proxy.
 */
@SuppressWarnings("unused")
public class PostRequest {

    private PostService service;

    public PostRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(PostService.class);
    }

    /**
     * Query post endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<PostV5> get(@NotNull final PostGetParams params) {
        return service.get(params.getPostId(), params.getParams());
    }

    /**
     * Query post endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<PostsV5> list(@NotNull final PostListParams params) {
        return service.list(params.getParams());
    }

    /**
     * Create post.
     *
     * @param postV5Data {@link PostV5Data} object.
     * @return {@link PostV5} object.
     */
    public Call<PostV5> create(@NotNull final PostV5Data postV5Data) {
        return service.create(postV5Data);
    }

    /**
     * Update post.
     *
     * @param postV5Data {@link PostV5Data} object.
     * @return {@link PostV5} object.
     */
    public Call<PostV5> update(@NotNull final PostV5Data postV5Data) {
        return service.update(postV5Data.getId(), postV5Data);
    }

    /**
     * Delete v4 post.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<ResponseBody> delete(@NotNull final PostV4DeleteParams params) {
        return service.deleteV4(params.getPostId(), params.getParams());
    }

    /**
     * Delete v5 post.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<ResponseBody> delete(@NotNull final PostV5DeleteParams params) {
        return service.deleteV5(params.getPostId(), params.getParams());
    }
}

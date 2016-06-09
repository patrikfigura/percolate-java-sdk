package com.percolate.sdk.rxjava.request.post.plug;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.post.plug.PostPlugParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Plugs;

import org.jetbrains.annotations.NotNull;

import rx.Observable;

/**
 * Post plug request proxy.
 */
@SuppressWarnings("unused")
public class PostPlugRequestRx {

    private PostPlugServiceRx service;

    public PostPlugRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(PostPlugServiceRx.class);
    }

    /**
     * Query post plug endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Plugs> get(@NotNull final PostPlugParams params) {
        return service.get(params.getParams());
    }

}

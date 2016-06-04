package com.percolate.sdk.rxjava.request.topics;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.topics.TopicsParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Topics;

import org.jetbrains.annotations.NotNull;

import rx.Observable;

/**
 * Topics request proxy.
 */
@SuppressWarnings("unused")
public class TopicsRequest {

    private TopicsService service;

    public TopicsRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(TopicsService.class);
    }

    /**
     * Query topics endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Topics> get(@NotNull final TopicsParams params) {
        return service.get(params.getParams());
    }
}

package com.percolate.sdk.rxjava.request.streams;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.streams.StreamsParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Streams;

import org.jetbrains.annotations.NotNull;

import rx.Observable;

/**
 * Streams request proxy.
 */
@SuppressWarnings("unused")
public class StreamsRequest {

    private StreamsService service;

    public StreamsRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(StreamsService.class);
    }

    /**
     * Query streams endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Streams> get(@NotNull final StreamsParams params) {
        return service.get(params.getParams());
    }
}

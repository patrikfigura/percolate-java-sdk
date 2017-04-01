package com.percolate.sdk.rxjava.request.streams;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.streams.StreamsParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Streams;

import org.jetbrains.annotations.NotNull;

import io.reactivex.Observable;

/**
 * Streams request proxy.
 */
@SuppressWarnings("unused")
public class StreamsRequestRx {

    private StreamsServiceRx service;

    public StreamsRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(StreamsServiceRx.class);
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

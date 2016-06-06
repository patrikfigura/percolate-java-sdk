package com.percolate.sdk.rxjava.request.channel;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.channel.ChannelParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Channels;

import org.jetbrains.annotations.NotNull;

import rx.Observable;

/**
 * Channel request proxy.
 */
@SuppressWarnings("unused")
public class ChannelRequestRx {

    private ChannelServiceRx service;

    public ChannelRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(ChannelServiceRx.class);
    }

    /**
     * Query channel endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Channels> get(@NotNull final ChannelParams params) {
        return service.get(params.getParams());
    }
}

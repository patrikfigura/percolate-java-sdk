package com.percolate.sdk.rxjava.request.platform;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.platform.PlatformsParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Platforms;

import org.jetbrains.annotations.NotNull;

import rx.Observable;

/**
 * Platforms request proxy.
 */
@SuppressWarnings("unused")
public class PlatformsRequestRx {

    private PlatformsServiceRx service;

    public PlatformsRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(PlatformsServiceRx.class);
    }

    /**
     * Query platforms endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Platforms> get(@NotNull final PlatformsParams params) {
        return service.get(params.getParams());
    }
}

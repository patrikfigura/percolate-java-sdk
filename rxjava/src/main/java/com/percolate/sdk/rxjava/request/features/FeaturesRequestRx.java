package com.percolate.sdk.rxjava.request.features;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.features.FeaturesParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Features;

import org.jetbrains.annotations.NotNull;

import io.reactivex.Observable;

/**
 * Feature request proxy.
 */
@SuppressWarnings("unused")
public class FeaturesRequestRx {

    private FeaturesServiceRx service;

    public FeaturesRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(FeaturesServiceRx.class);
    }

    /**
     * Query features endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Features> get(@NotNull final FeaturesParams params) {
        return service.get(params.getParams());
    }
}

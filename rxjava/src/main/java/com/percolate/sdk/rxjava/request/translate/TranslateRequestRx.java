package com.percolate.sdk.rxjava.request.translate;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.translate.TranslateParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Translation;

import org.jetbrains.annotations.NotNull;

import rx.Observable;

/**
 * Translate request proxy.
 */
@SuppressWarnings("unused")
public class TranslateRequestRx {

    private TranslateServiceRx service;

    public TranslateRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(TranslateServiceRx.class);
    }

    /**
     * Query translate endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Translation> get(@NotNull final TranslateParams params) {
        return service.get(params.getParams());
    }
}

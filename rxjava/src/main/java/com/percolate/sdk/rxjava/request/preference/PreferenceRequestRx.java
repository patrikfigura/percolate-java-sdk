package com.percolate.sdk.rxjava.request.preference;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.preference.PreferenceParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Preference;

import org.jetbrains.annotations.NotNull;

import rx.Observable;

public class PreferenceRequestRx {

    private PreferenceServiceRx service;

    public PreferenceRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(PreferenceServiceRx.class);
    }

    /**
     * Query preference endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Preference> get(@NotNull final PreferenceParams params) {
        return service.get(params.getParams());
    }
}

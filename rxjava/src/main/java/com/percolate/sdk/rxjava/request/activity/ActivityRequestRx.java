package com.percolate.sdk.rxjava.request.activity;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.activity.ActivityParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.ActivityStream;

import org.jetbrains.annotations.NotNull;

import rx.Observable;

/**
 * Activity request proxy.
 */
@SuppressWarnings("unused")
public class ActivityRequestRx {

    private ActivityServiceRx service;

    public ActivityRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(ActivityServiceRx.class);
    }

    /**
     * Query activity endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<ActivityStream> get(@NotNull final ActivityParams params) {
        return service.get(params.getParams());
    }

}

package com.percolate.sdk.rxjava.request.monitoring.instagram;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.monitoring.instagram.InstagramMonitoringInteractionParams;
import com.percolate.sdk.api.request.monitoring.instagram.InstagramMonitoringInteractionsParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.InstagramMonitoringObjects;
import com.percolate.sdk.dto.InstagramSingleMonitoringObject;

import org.jetbrains.annotations.NotNull;

import rx.Observable;

/**
 * Instagram monitoring request proxy.
 */
@SuppressWarnings("unused")
public class InstagramMonitoringRequestRx {

    private InstagramMonitoringServiceRx service;

    public InstagramMonitoringRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(InstagramMonitoringServiceRx.class);
    }

    /**
     * Query instagram monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<InstagramMonitoringObjects> interactions(@NotNull final InstagramMonitoringInteractionsParams params) {
        return service.interactions(params.getParams());
    }

    /**
     * Query instagram monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<InstagramSingleMonitoringObject> interaction(@NotNull final InstagramMonitoringInteractionParams params) {
        return service.interaction(params.getCommentId(), params.getParams());
    }
}

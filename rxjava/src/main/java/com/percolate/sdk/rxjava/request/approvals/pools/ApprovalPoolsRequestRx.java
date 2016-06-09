package com.percolate.sdk.rxjava.request.approvals.pools;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.approvals.pools.ApprovalPoolsParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.ApprovalPools;

import org.jetbrains.annotations.NotNull;

import rx.Observable;

/**
 * Approval pools request proxy.
 */
@SuppressWarnings("unused")
public class ApprovalPoolsRequestRx {

    private ApprovalPoolsServiceRx service;

    public ApprovalPoolsRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(ApprovalPoolsServiceRx.class);
    }

    /**
     * Query approval pools endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<ApprovalPools> get(@NotNull final ApprovalPoolsParams params) {
        return service.get(params.getParams());
    }

}

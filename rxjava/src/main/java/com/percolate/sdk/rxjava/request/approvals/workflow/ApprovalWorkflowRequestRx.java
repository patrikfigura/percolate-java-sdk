package com.percolate.sdk.rxjava.request.approvals.workflow;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.approvals.workflow.ApprovalWorkflowParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Workflow;

import org.jetbrains.annotations.NotNull;

import io.reactivex.Observable;

/**
 * Terms request proxy.
 */
@SuppressWarnings("unused")
public class ApprovalWorkflowRequestRx {

    private ApprovalWorkflowServiceRx service;

    public ApprovalWorkflowRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(ApprovalWorkflowServiceRx.class);
    }

    /**
     * Query terms endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Workflow> get(@NotNull final ApprovalWorkflowParams params) {
        return service.get(params.getParams());
    }

}

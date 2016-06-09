package com.percolate.sdk.rxjava.request.approvals.workflow.history;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.approvals.workflow.history.ApprovalWorkflowHistoryParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.WorkflowHistory;
import com.percolate.sdk.dto.WorkflowHistoryEvents;

import org.jetbrains.annotations.NotNull;

import rx.Observable;

/**
 * Approval workflow history request proxy.
 */
@SuppressWarnings("unused")
public class ApprovalWorkflowHistoryRequestRx {

    private ApprovalWorkflowHistoryServiceRx service;

    public ApprovalWorkflowHistoryRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(ApprovalWorkflowHistoryServiceRx.class);
    }

    /**
     * Query Approval workflow history endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<WorkflowHistory> get(@NotNull final ApprovalWorkflowHistoryParams params) {
        return service.get(params.getParams().get("id").toString());
    }

    /**
     * Create Approval workflow history endpoint.
     *
     * @param workflowHistoryEvents {@link WorkflowHistoryEvents} object.
     * @return {@link Observable} object.
     */
    public Observable<WorkflowHistory> create(@NotNull final WorkflowHistoryEvents workflowHistoryEvents) {
        return service.create(workflowHistoryEvents);
    }
}

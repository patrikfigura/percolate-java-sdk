package com.percolate.sdk.api.request.approvals.workflow.history;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.WorkflowHistory;
import com.percolate.sdk.dto.WorkflowHistoryEvent;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Approval workflow history request proxy.
 */
@SuppressWarnings("unused")
public class ApprovalWorkflowHistoryRequest {

    private ApprovalWorkflowHistoryService service;

    public ApprovalWorkflowHistoryRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(ApprovalWorkflowHistoryService.class);
    }

    /**
     * Query Approval workflow history endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<WorkflowHistory> get(@NotNull final ApprovalWorkflowHistoryParams params) {
        return service.get(params.getParams().get("id").toString());
    }

    /**
     * Create Approval workflow history endpoint.
     *
     * @param workflowHistoryEvent {@link WorkflowHistoryEvent} object.
     * @return {@link Call} object.
     */
    public Call<WorkflowHistoryEvent> create(@NotNull final WorkflowHistoryEvent workflowHistoryEvent) {
        return service.create(workflowHistoryEvent);
    }
}

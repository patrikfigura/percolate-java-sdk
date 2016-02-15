package com.percolate.sdk.api.request.approvals.workflow;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Workflow;
import retrofit2.Call;

/**
 * Terms request proxy.
 */
@SuppressWarnings("unused")
public class ApprovalWorkflowRequest {

    private ApprovalWorkflowService service;

    public ApprovalWorkflowRequest(PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(ApprovalWorkflowService.class);
    }

    /**
     * Query terms endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Workflow> get(final ApprovalWorkflowParams params) {
        return service.get(params.getParams());
    }

}

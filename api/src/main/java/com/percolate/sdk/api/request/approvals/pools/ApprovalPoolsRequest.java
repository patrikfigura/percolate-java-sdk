package com.percolate.sdk.api.request.approvals.pools;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.ApprovalPools;
import retrofit2.Call;

/**
 * Approval pools request proxy.
 */
@SuppressWarnings("unused")
public class ApprovalPoolsRequest {

    private ApprovalPoolsService service;

    public ApprovalPoolsRequest(PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(ApprovalPoolsService.class);
    }

    /**
     * Query approval pools endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<ApprovalPools> get(final ApprovalPoolsParams params) {
        return service.get(params.getParams());
    }

}

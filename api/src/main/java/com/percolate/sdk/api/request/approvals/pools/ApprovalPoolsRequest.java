package com.percolate.sdk.api.request.approvals.pools;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.ApprovalPools;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Approval pools request proxy.
 */
@SuppressWarnings("unused")
public class ApprovalPoolsRequest {

    private ApprovalPoolsService service;

    public ApprovalPoolsRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(ApprovalPoolsService.class);
    }

    /**
     * Query approval pools endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<ApprovalPools> get(@NotNull final ApprovalPoolsParams params) {
        return service.get(params.getParams());
    }

}

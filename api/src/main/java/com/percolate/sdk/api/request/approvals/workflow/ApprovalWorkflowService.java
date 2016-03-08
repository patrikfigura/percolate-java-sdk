package com.percolate.sdk.api.request.approvals.workflow;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.Workflow;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v5/approval/workflow API definition.
 */
interface ApprovalWorkflowService {

    @GET(PercolateApi.API_V3_PATH + "/approval/workflow/")
    Call<Workflow> get(@QueryMap Map<String, Object> params);

}

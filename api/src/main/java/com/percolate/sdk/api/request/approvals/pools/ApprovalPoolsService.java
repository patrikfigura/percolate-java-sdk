package com.percolate.sdk.api.request.approvals.pools;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.ApprovalPools;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v5/terms API definition.
 */
interface ApprovalPoolsService {

    @GET(PercolateApi.API_V4_PATH + "/approval/pool/")
    Call<ApprovalPools> get(@QueryMap Map<String, Object> params);

}

package com.percolate.sdk.rxjava.request.approvals.pools;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.ApprovalPools;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v4/approval/pool/ API definition.
 */
interface ApprovalPoolsService {

    @GET(Endpoints.API_V4_PATH + "/approval/pool/")
    Observable<ApprovalPools> get(@QueryMap Map<String, Object> params);

}

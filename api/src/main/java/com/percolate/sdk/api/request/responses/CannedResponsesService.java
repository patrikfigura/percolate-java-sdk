package com.percolate.sdk.api.request.responses;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.CannedResponses;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v5/canned_response API definition.
 */
interface CannedResponsesService {

    @GET(PercolateApi.API_V5_PATH + "/canned_response/")
    Call<CannedResponses> get(@QueryMap Map<String, Object> params);
}

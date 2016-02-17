package com.percolate.sdk.api.request.brief;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.Brief;
import com.percolate.sdk.dto.BriefData;
import com.percolate.sdk.dto.Briefs;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * Percolate v4/brief API definition.
 */
interface BriefService {

    @GET(PercolateApi.API_V4_PATH + "/brief/")
    Call<Briefs> list(@QueryMap Map<String, Object> params);

    @GET(PercolateApi.API_V4_PATH + "/brief/{brief_id}")
    Call<BriefData> get(@Path("brief_id") String briefId);

    @POST(PercolateApi.API_V4_PATH + "/brief/")
    Call<BriefData> create(@Body Brief brief);

}

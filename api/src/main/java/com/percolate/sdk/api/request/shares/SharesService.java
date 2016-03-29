package com.percolate.sdk.api.request.shares;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Shares;
import com.percolate.sdk.dto.SingleShare;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v4/share API definition.
 */
interface SharesService {

    @GET(Endpoints.API_V4_PATH + "/share/")
    Call<Shares> list(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/share/{share_id}")
    Call<SingleShare> get(@Path("share_id") String shareId, @QueryMap Map<String, Object> params);
}

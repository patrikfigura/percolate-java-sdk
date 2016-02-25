package com.percolate.sdk.api.request.post.plug;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.Plugs;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v4/post/plug API definition.
 */
interface PostPlugService {

    @GET(PercolateApi.API_V4_PATH + "/post/plug/")
    Call<Plugs> get(@QueryMap Map<String, Object> params);
}

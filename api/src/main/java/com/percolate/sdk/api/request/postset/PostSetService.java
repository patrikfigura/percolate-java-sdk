package com.percolate.sdk.api.request.postset;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.PostSet;
import com.percolate.sdk.dto.PostSetData;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * Percolate v4/post_set API definition.
 */
interface PostSetService {

    @GET(PercolateApi.API_V4_PATH + "/post_set/")
    Call<PostSet> get(@QueryMap Map<String, Object> params);

    @POST(PercolateApi.API_V4_PATH + "/post_set/")
    Call<PostSetData> create(@Body PostSetData postSetData);

    @PUT(PercolateApi.API_V4_PATH + "/post_set/{post_set_id}")
    Call<PostSetData> update(@Path("post_set_id") String postSetId, @Body PostSetData postSetData);
}

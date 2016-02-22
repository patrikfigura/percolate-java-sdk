package com.percolate.sdk.api.request.links;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.Link;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Percolate v3/links API definition.
 */
interface LinksService {

    @GET(PercolateApi.API_V3_PATH + "/links/{id}")
    Call<Link> get(@Path("id") String id);

    @POST(PercolateApi.API_V3_PATH + "/links")
    Call<Link> create(@Body String url);
}

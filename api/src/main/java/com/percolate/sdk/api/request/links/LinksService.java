package com.percolate.sdk.api.request.links;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Link;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.Map;

/**
 * Percolate v3/links API definition.
 */
interface LinksService {

    @GET(Endpoints.API_V3_PATH + "/links/{id}")
    Call<Link> get(@Path("id") String id);

    @POST(Endpoints.API_V3_PATH + "/links")
    Call<Link> create(@Body Map body);
}

package com.percolate.sdk.rxjava.request.postset;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.PostSet;
import com.percolate.sdk.dto.PostSetData;

import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v4/post_set API definition.
 */
interface PostSetService {

    @GET(Endpoints.API_V4_PATH + "/post_set/")
    Observable<PostSet> get(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V4_PATH + "/post_set/")
    Observable<PostSetData> create(@Body PostSetData postSetData);

    @PUT(Endpoints.API_V4_PATH + "/post_set/{post_set_id}")
    Observable<PostSetData> update(@Path("post_set_id") String postSetId, @Body PostSetData postSetData);
}

package com.percolate.sdk.rxjava.request.post;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.PostV5;
import com.percolate.sdk.dto.PostV5Data;
import com.percolate.sdk.dto.PostsV5;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v5/post API definition.
 */
interface PostService {

    @GET(Endpoints.API_V5_PATH + "/post/{post_id}")
    Observable<PostV5> get(@Path("post_id") String postId, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/post/")
    Observable<PostsV5> list(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V5_PATH + "/post/")
    Observable<PostV5> create(@Body PostV5Data postV5Data);

    @PUT(Endpoints.API_V5_PATH + "/post/{post_id}")
    Observable<PostV5> update(@Path("post_id") String postId, @Body PostV5Data postV5Data);

    @DELETE(Endpoints.API_V4_PATH + "/post/{post_id}")
    Observable<ResponseBody> deleteV4(@Path("post_id") String postId, @QueryMap Map<String, Object> params);

    @DELETE(Endpoints.API_V5_PATH + "/post/{post_id}")
    Observable<ResponseBody> deleteV5(@Path("post_id") String postId, @QueryMap Map<String, Object> params);
}

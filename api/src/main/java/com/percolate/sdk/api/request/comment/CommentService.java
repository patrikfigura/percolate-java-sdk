package com.percolate.sdk.api.request.comment;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.Comment;
import com.percolate.sdk.dto.CommentData;
import com.percolate.sdk.dto.Comments;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v5/comment API definition.
 */
interface CommentService {

    @GET(PercolateApi.API_V5_PATH + "/comment/")
    Call<Comments> get(@QueryMap Map<String, Object> params);

    @POST(PercolateApi.API_V5_PATH + "/comment/")
    Call<CommentData> create(@Body Comment comment);
}

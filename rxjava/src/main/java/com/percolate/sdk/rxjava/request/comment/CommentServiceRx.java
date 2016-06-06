package com.percolate.sdk.rxjava.request.comment;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Comment;
import com.percolate.sdk.dto.CommentData;
import com.percolate.sdk.dto.Comments;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v5/comment API definition.
 */
interface CommentServiceRx {

    @GET(Endpoints.API_V5_PATH + "/comment/")
    Observable<Comments> get(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V5_PATH + "/comment/")
    Observable<CommentData> create(@Body Comment comment);

    @DELETE(Endpoints.API_V5_PATH + "/comment/{comment_id}")
    Observable<ResponseBody> create(@Path("comment_id") String commentId);
}

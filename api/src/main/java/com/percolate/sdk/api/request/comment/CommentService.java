package com.percolate.sdk.api.request.comment;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Comment;
import com.percolate.sdk.dto.CommentData;
import com.percolate.sdk.dto.Comments;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * Percolate v5/comment API definition.
 */
interface CommentService {

    @GET(Endpoints.API_V5_PATH + "/comment/")
    Call<Comments> get(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V5_PATH + "/comment/")
    Call<CommentData> create(@Body Comment comment);

    @DELETE(Endpoints.API_V5_PATH + "/comment/{comment_id}")
    Call<ResponseBody> create(@Path("comment_id") String commentId);
}

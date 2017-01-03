package com.percolate.sdk.api.request.post_attachment;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.PostAttachment;
import com.percolate.sdk.dto.PostAttachmentData;
import com.percolate.sdk.dto.SinglePostAttachment;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/**
 * Percolate v5/post_attachment API definition.
 */
interface PostAttachmentService {

    @GET(Endpoints.API_V5_PATH + "/post_attachment/")
    Call<PostAttachment> get(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/post_attachment/{post_attachment_id}")
    Call<SinglePostAttachment> get(@Path("post_attachment_id") String attachmentId);

    @POST(Endpoints.API_V5_PATH + "/post_attachment/")
    Call<SinglePostAttachment> create(@Body PostAttachmentData attachmentData);

    @PUT(Endpoints.API_V5_PATH + "/post_attachment/{post_attachment_id}")
    Call<SinglePostAttachment> update(@Path("post_attachment_id") String attachmentId, @Body PostAttachmentData attachmentData);

}

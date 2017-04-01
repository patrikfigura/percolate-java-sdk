package com.percolate.sdk.rxjava.request.post_attachment;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.PostAttachment;
import com.percolate.sdk.dto.PostAttachmentData;
import com.percolate.sdk.dto.SinglePostAttachment;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/**
 * Percolate v5/post_attachment API definition.
 */
interface PostAttachmentServiceRx {

    @GET(Endpoints.API_V5_PATH + "/post_attachment/")
    Observable<PostAttachment> get(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/post_attachment/{post_attachment_id}")
    Observable<SinglePostAttachment> get(@Path("post_attachment_id") String attachmentId);

    @POST(Endpoints.API_V5_PATH + "/post_attachment/")
    Observable<SinglePostAttachment> create(@Body PostAttachmentData attachmentData);

    @PUT(Endpoints.API_V5_PATH + "/post_attachment/{post_attachment_id}")
    Observable<SinglePostAttachment> update(@Path("post_attachment_id") String attachmentId, @Body PostAttachmentData attachmentData);

}

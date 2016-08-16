package com.percolate.sdk.rxjava.request.upload;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.*;
import retrofit2.http.*;
import rx.Observable;

/**
 * Percolate v5/upload and v5/upload_policy API definitions.
 */
interface UploadServiceRx {

    @GET(Endpoints.API_V5_PATH + "/upload/{upload_id}")
    Observable<UploadResponse> status(@Path("upload_id") String uploadId);

    @PUT(Endpoints.API_V5_PATH + "/upload/{upload_id}")
    Observable<UploadResponse> updateStatus(@Path("upload_id") String uploadId, @Body UploadStatusRequestData uploadStatusRequestData);

    @POST(Endpoints.API_V5_PATH + "/upload/")
    Observable<UploadResponse> upload(@Body UploadRequestData uploadRequestData);

    @POST(Endpoints.API_V5_PATH + "/upload_policy/")
    Observable<UploadPolicyResponse> uploadPolicy(@Body UploadPolicyRequestData uploadPolicyRequestData);
}

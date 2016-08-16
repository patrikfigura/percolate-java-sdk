package com.percolate.sdk.api.request.upload;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.*;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * Percolate v5/upload and v5/upload_policy API definitions.
 */
interface UploadService {

    @GET(Endpoints.API_V5_PATH + "/upload/{upload_id}")
    Call<UploadResponse> status(@Path("upload_id") String uploadId);

    @PUT(Endpoints.API_V5_PATH + "/upload/{upload_id}")
    Call<UploadResponse> updateStatus(@Path("upload_id") String uploadId, @Body UploadStatusRequestData uploadStatusRequestData);

    @POST(Endpoints.API_V5_PATH + "/upload/")
    Call<UploadResponse> upload(@Body UploadRequestData uploadRequestData);

    @POST(Endpoints.API_V5_PATH + "/upload_policy/")
    Call<UploadPolicyResponse> uploadPolicy(@Body UploadPolicyRequestData uploadPolicyRequestData);
}

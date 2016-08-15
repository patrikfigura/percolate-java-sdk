package com.percolate.sdk.api.request.upload;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.UploadPolicyRequestData;
import com.percolate.sdk.dto.UploadPolicyResponse;
import com.percolate.sdk.dto.UploadRequestData;
import com.percolate.sdk.dto.UploadResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Percolate v5/upload and v5/upload_policy API definitions.
 */
interface UploadService {

    @GET(Endpoints.API_V5_PATH + "/upload/{upload_id}")
    Call<UploadResponse> status(@Path("upload_id") String uploadId);

    @POST(Endpoints.API_V5_PATH + "/upload/")
    Call<UploadResponse> upload(@Body UploadRequestData uploadRequestData);

    @POST(Endpoints.API_V5_PATH + "/upload_policy/")
    Call<UploadPolicyResponse> uploadPolicy(@Body UploadPolicyRequestData uploadPolicyRequestData);
}

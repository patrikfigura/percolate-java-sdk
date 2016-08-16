package com.percolate.sdk.api.request.upload;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.*;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Uploads request proxy.
 */
@SuppressWarnings("unused")
public class UploadRequest {

    private UploadService service;

    public UploadRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(UploadService.class);
    }

    /**
     * Get upload status.
     *
     * @param uploadId Upload id.
     * @return {@link Call} object.
     */
    public Call<UploadResponse> status(@NotNull final String uploadId) {
        return service.status(uploadId);
    }

    /**
     * Update media status.
     *
     * @param uploadId Upload id.
     * @param uploadStatusRequestData Upload status.
     * @return {@link Call} object.
     */
    public Call<UploadResponse> updateStatus(@NotNull final String uploadId, @NotNull final UploadStatusRequestData uploadStatusRequestData) {
        return service.updateStatus(uploadId, uploadStatusRequestData);
    }

    /**
     * Upload endpoint
     *
     * @param uploadRequestData Upload data.
     * @return {@link Call} object.
     */
    public Call<UploadResponse> upload(@NotNull final UploadRequestData uploadRequestData) {
        return service.upload(uploadRequestData);
    }

    /**
     * Upload Policy endpoint
     *
     * @param uploadPolicyRequestData Upload policy data.
     * @return {@link Call} object.
     */
    public Call<UploadPolicyResponse> uploadPolicy(@NotNull final UploadPolicyRequestData uploadPolicyRequestData) {
        return service.uploadPolicy(uploadPolicyRequestData);
    }
}

package com.percolate.sdk.rxjava.request.upload;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.UploadPolicyRequestData;
import com.percolate.sdk.dto.UploadPolicyResponse;
import com.percolate.sdk.dto.UploadRequestData;
import com.percolate.sdk.dto.UploadResponse;
import com.percolate.sdk.dto.UploadStatusRequestData;

import org.jetbrains.annotations.NotNull;

import io.reactivex.Observable;
import retrofit2.Call;

/**
 * Uploads request proxy.
 */
@SuppressWarnings("unused")
public class UploadRequestRx {

    private UploadServiceRx service;

    public UploadRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(UploadServiceRx.class);
    }

    /**
     * Get upload status.
     *
     * @param uploadId Upload id.
     * @return {@link Observable} object.
     */
    public Observable<UploadResponse> status(@NotNull final String uploadId) {
        return service.status(uploadId);
    }

    /**
     * Update media status.
     *
     * @param uploadId Upload id.
     * @param uploadStatusRequestData Upload status.
     * @return {@link Call} object.
     */
    public Observable<UploadResponse> updateStatus(@NotNull final String uploadId, @NotNull final UploadStatusRequestData uploadStatusRequestData) {
        return service.updateStatus(uploadId, uploadStatusRequestData);
    }

    /**
     * Upload endpoint
     *
     * @param uploadRequestData Upload data
     * @return {@link Observable} object.
     */
    public Observable<UploadResponse> upload(@NotNull final UploadRequestData uploadRequestData) {
        return service.upload(uploadRequestData);
    }

    /**
     * Upload Policy endpoint
     *
     * @param uploadPolicyRequestData Upload policy data.
     * @return {@link Call} object.
     */
    public Observable<UploadPolicyResponse> uploadPolicy(@NotNull final UploadPolicyRequestData uploadPolicyRequestData) {
        return service.uploadPolicy(uploadPolicyRequestData);
    }
}

package com.percolate.sdk.rxjava.request.upload;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.UploadPolicyRequestData;
import com.percolate.sdk.dto.UploadPolicyResponse;
import com.percolate.sdk.dto.UploadRequestData;
import com.percolate.sdk.dto.UploadResponse;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import rx.Observable;

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

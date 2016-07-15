package com.percolate.sdk.rxjava.request.upload;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.upload.UploadPolicyParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.UploadPolicyResponse;
import com.percolate.sdk.dto.UploadRequestData;
import com.percolate.sdk.dto.UploadResponse;
import org.jetbrains.annotations.NotNull;
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
     * @param params Upload policy params.
     * @return {@link Observable} object.
     */
    public Observable<UploadPolicyResponse> uploadPolicy(@NotNull final UploadPolicyParams params) {
        return service.uploadPolicy(params.getParams());
    }
}

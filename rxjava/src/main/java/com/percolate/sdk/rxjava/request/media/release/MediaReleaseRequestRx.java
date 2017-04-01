package com.percolate.sdk.rxjava.request.media.release;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.media.release.MediaReleaseParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.MediaReleaseResponse;

import org.jetbrains.annotations.NotNull;

import io.reactivex.Observable;

/**
 * MediaRelease request proxy.
 */
@SuppressWarnings("unused")
public class MediaReleaseRequestRx {

    private MediaReleaseServiceRx service;

    public MediaReleaseRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(MediaReleaseServiceRx.class);
    }

    /**
     * Create media release.
     *
     * @param params API params.
     * @return {@link MediaReleaseResponse} object.
     */
    public Observable<MediaReleaseResponse> create(@NotNull final MediaReleaseParams params) {
        return service.create(params.getParams());
    }
}

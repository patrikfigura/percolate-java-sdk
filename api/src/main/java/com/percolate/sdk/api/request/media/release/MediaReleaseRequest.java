package com.percolate.sdk.api.request.media.release;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.MediaReleaseResponse;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * MediaRelease request proxy.
 */
@SuppressWarnings("unused")
public class MediaReleaseRequest {

    private MediaReleaseService service;

    public MediaReleaseRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(MediaReleaseService.class);
    }

    /**
     * Create media release.
     *
     * @param params API params.
     * @return {@link MediaReleaseResponse} object.
     */
    public Call<MediaReleaseResponse> create(@NotNull final MediaReleaseParams params) {
        return service.create(params.getParams());
    }
}

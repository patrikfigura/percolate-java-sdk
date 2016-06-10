package com.percolate.sdk.api.request.previewformat;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.PreviewFormats;
import com.percolate.sdk.dto.SinglePreviewFormat;

import org.jetbrains.annotations.NotNull;

import retrofit2.Call;

/**
 * Preview format request proxy.
 */
public class PreviewFormatRequest {

    private PreviewFormatService service;

    public PreviewFormatRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(PreviewFormatService.class);
    }

    /**
     * Query preview format endpoint.
     *
     * @param uid preview format uid.
     * @return {@link Call} object.
     */
    public Call<SinglePreviewFormat> get(@NotNull final String uid) {
        return service.get(uid);
    }

    /**
     * Query preview format endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<PreviewFormats> list(@NotNull final PreviewFormatListParams params) {
        return service.list(params.getParams());
    }

}

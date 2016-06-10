package com.percolate.sdk.rxjava.request.post.previewformat;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.previewformat.PreviewFormatListParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.PreviewFormats;
import com.percolate.sdk.dto.SinglePreviewFormat;

import org.jetbrains.annotations.NotNull;

import rx.Observable;

/**
 * Preview format request proxy.
 */
public class PreviewFormatRequestRx {

    private PreviewFormatServiceRx service;

    public PreviewFormatRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(PreviewFormatServiceRx.class);
    }

    /**
     * Query preview format endpoint.
     *
     * @param uid preview format uid.
     * @return {@link Observable} object.
     */
    public Observable<SinglePreviewFormat> get(@NotNull final String uid) {
        return service.get(uid);
    }

    /**
     * Query preview format endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<PreviewFormats> list(@NotNull final PreviewFormatListParams params) {
        return service.list(params.getParams());
    }

}

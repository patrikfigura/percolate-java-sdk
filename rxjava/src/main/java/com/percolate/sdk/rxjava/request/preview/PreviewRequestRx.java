package com.percolate.sdk.rxjava.request.preview;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.PostV5Data;
import com.percolate.sdk.dto.Preview;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import rx.Observable;

/**
 * PreviewData request proxy.
 */
@SuppressWarnings("unused")
public class PreviewRequestRx {

    private PreviewServiceRx service;

    public PreviewRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(PreviewServiceRx.class);
    }

    /**
     * Create a post's preview.
     *
     * @param previewTemplateId PreviewData template id.
     * @param postData {@code PostV5} object.
     * @return {@link Observable} object.
     */
    public Observable<Preview> create(@NotNull final String previewTemplateId, @NotNull final PostV5Data postData) {
        final Map<String, Object> body = new HashMap<>();
        body.put("preview_template_id", previewTemplateId);
        body.put("post_data", postData);
        return service.create(body);
    }

}

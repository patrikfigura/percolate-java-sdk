package com.percolate.sdk.api.request.preview;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.PostV5Data;
import com.percolate.sdk.dto.Preview;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;

/**
 * Preview request proxy.
 */
@SuppressWarnings("unused")
public class PreviewRequest {

    private PreviewService service;

    public PreviewRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(PreviewService.class);
    }

    /**
     * Create a post's preview.
     *
     * @param previewTemplateId Preview template id.
     * @param postData {@code PostV5Data} object.
     * @return {@link Call} object.
     */
    public Call<Preview> create(@NotNull final String previewTemplateId, @NotNull final PostV5Data postData) {
        final Map<String, Object> body = new HashMap<>();
        body.put("preview_template_id", previewTemplateId);
        body.put("post_data", postData);
        return service.create(body);
    }

}

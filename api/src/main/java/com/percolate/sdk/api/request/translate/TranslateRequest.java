package com.percolate.sdk.api.request.translate;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Translation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Translate request proxy.
 */
@SuppressWarnings("unused")
public class TranslateRequest {

    private TranslateService service;

    public TranslateRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(TranslateService.class);
    }

    /**
     * Query translate endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Translation> get(@NotNull final TranslateParams params) {
        return service.get(params.getParams());
    }
}

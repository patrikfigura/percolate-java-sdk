package com.percolate.sdk.api.request.variants;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.SingleVariant;
import com.percolate.sdk.dto.Variants;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Asset variant request proxy.
 */
@SuppressWarnings("unused")
public class VariantsRequest {

    private VariantsService service;

    public VariantsRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(VariantsService.class);
    }

    /**
     * Query assets variant endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<SingleVariant> get(@NotNull final VariantsGetParams params) {
        return service.get(params.getVariantId(), params.getParams());
    }

    /**
     * Query assets variant endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Variants> list(@NotNull final VariantsListParams params) {
        return service.list(params.getParams());
    }

    /**
     * Query assets variant endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<ResponseBody> download(@NotNull final VariantsGetParams params) {
        return service.download(params.getVariantId(), params.getParams());
    }
}

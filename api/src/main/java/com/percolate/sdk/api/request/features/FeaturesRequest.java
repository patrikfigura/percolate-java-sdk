package com.percolate.sdk.api.request.features;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Features;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Feature request proxy.
 */
@SuppressWarnings("unused")
public class FeaturesRequest {

    private FeaturesService service;

    public FeaturesRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(FeaturesService.class);
    }

    /**
     * Query features endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Features> get(@NotNull final FeaturesParams params) {
        return service.get(params.getParams());
    }
}

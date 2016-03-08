package com.percolate.sdk.api.request.platform;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Platforms;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Platforms request proxy.
 */
@SuppressWarnings("unused")
public class PlatformsRequest {

    private PlatformsService service;

    public PlatformsRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(PlatformsService.class);
    }

    /**
     * Query platforms endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Platforms> get(@NotNull final PlatformsParams params) {
        return service.get(params.getParams());
    }
}

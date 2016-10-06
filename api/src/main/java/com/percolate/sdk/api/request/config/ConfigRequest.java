package com.percolate.sdk.api.request.config;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Config;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Config request proxy.
 */
@SuppressWarnings("unused")
public class ConfigRequest {

    private ConfigService service;

    public ConfigRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(ConfigService.class);
    }

    /**
     * Query config endpoint.
     *
     * @return {@link Call} object.
     */
    public Call<Config> get() {
        return service.get();
    }
}

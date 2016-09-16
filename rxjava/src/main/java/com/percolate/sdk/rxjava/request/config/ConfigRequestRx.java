package com.percolate.sdk.rxjava.request.config;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import rx.Observable;

/**
 * Config request proxy.
 */
@SuppressWarnings("unused")
public class ConfigRequestRx {

    private ConfigServiceRx service;

    public ConfigRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(ConfigServiceRx.class);
    }

    /**
     * Query config endpoint.
     *
     * @return {@link Observable} object.
     */
    public Call<Observable> get() {
        return service.get();
    }
}

package com.percolate.sdk.rxjava.request.config;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Config;
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
    public Observable<Config> get() {
        return service.get();
    }
}

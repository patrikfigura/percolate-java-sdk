package com.percolate.sdk.rxjava.request.license;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.license.LicenseParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Licenses;

import org.jetbrains.annotations.NotNull;

import io.reactivex.Observable;

/**
 * License request proxy.
 */
@SuppressWarnings("unused")
public class LicenseRequestRx {

    private LicenseServiceRx service;

    public LicenseRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(LicenseServiceRx.class);
    }

    /**
     * Query license endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Licenses> get(@NotNull final LicenseParams params) {
        return service.get(params.getParams());
    }
}

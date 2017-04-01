package com.percolate.sdk.rxjava.request.licensechannel;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.licensechannel.LicenseChannelParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.LicenseChannel;
import com.percolate.sdk.dto.LicenseChannels;
import com.percolate.sdk.dto.SingleLicenseChannel;

import org.jetbrains.annotations.NotNull;

import io.reactivex.Observable;

/**
 * LicenseChannel request proxy.
 */
@SuppressWarnings("unused")
public class LicenseChannelRequestRx {

    private LicenseChannelServiceRx service;

    public LicenseChannelRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(LicenseChannelServiceRx.class);
    }

    /**
     * Query license_channel endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<LicenseChannels> get(@NotNull final LicenseChannelParams params) {
        return service.get(params.getParams());
    }

    /**
     * Create license channel.
     *
     * @param licenseChannel {@link LicenseChannel} object.
     * @return {@link LicenseChannel} object.
     */
    public Observable<SingleLicenseChannel> create(@NotNull final LicenseChannel licenseChannel) {
        return service.create(licenseChannel);
    }
}

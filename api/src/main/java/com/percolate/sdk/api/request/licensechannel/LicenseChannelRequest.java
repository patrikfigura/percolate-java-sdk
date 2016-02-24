package com.percolate.sdk.api.request.licensechannel;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.LicenseChannel;
import com.percolate.sdk.dto.LicenseChannels;
import com.percolate.sdk.dto.SingleLicenseChannel;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * LicenseChannel request proxy.
 */
@SuppressWarnings("unused")
public class LicenseChannelRequest {

    private LicenseChannelService service;

    public LicenseChannelRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(LicenseChannelService.class);
    }

    /**
     * Query license_channel endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<LicenseChannels> get(@NotNull final LicenseChannelParams params) {
        return service.get(params.getParams());
    }

    /**
     * Create license channel.
     *
     * @param licenseChannel {@link LicenseChannel} object.
     * @return {@link LicenseChannel} object.
     */
    public Call<SingleLicenseChannel> create(@NotNull final LicenseChannel licenseChannel) {
        return service.create(licenseChannel);
    }
}

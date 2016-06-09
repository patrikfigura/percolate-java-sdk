package com.percolate.sdk.rxjava.request.licensechannel;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.LicenseChannel;
import com.percolate.sdk.dto.LicenseChannels;
import com.percolate.sdk.dto.SingleLicenseChannel;

import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v4/license_channel API definition.
 */
interface LicenseChannelServiceRx {

    @GET(Endpoints.API_V4_PATH + "/license_channel/")
    Observable<LicenseChannels> get(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V4_PATH + "/license_channel/")
    Observable<SingleLicenseChannel> create(@Body LicenseChannel licenseChannel);
}

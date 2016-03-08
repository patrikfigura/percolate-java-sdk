package com.percolate.sdk.api.request.licensechannel;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.LicenseChannel;
import com.percolate.sdk.dto.LicenseChannels;
import com.percolate.sdk.dto.SingleLicenseChannel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v4/license_channel API definition.
 */
interface LicenseChannelService {

    @GET(PercolateApi.API_V4_PATH + "/license_channel/")
    Call<LicenseChannels> get(@QueryMap Map<String, Object> params);

    @POST(PercolateApi.API_V4_PATH + "/license_channel/")
    Call<SingleLicenseChannel> create(@Body LicenseChannel licenseChannel);
}

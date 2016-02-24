package com.percolate.sdk.api.request.channel;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.Channels;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v5/channel API definition.
 */
interface ChannelService {

    @GET(PercolateApi.API_V5_PATH + "/channel/")
    Call<Channels> get(@QueryMap Map<String, Object> params);
}

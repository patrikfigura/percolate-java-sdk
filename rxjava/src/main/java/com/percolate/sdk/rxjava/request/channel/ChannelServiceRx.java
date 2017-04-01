package com.percolate.sdk.rxjava.request.channel;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Channels;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Percolate v5/channel API definition.
 */
interface ChannelServiceRx {

    @GET(Endpoints.API_V5_PATH + "/channel/")
    Observable<Channels> get(@QueryMap Map<String, Object> params);
}

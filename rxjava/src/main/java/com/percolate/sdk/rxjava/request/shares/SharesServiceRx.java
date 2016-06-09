package com.percolate.sdk.rxjava.request.shares;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Shares;
import com.percolate.sdk.dto.SingleShare;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v4/share API definition.
 */
interface SharesServiceRx {

    @GET(Endpoints.API_V4_PATH + "/share/")
    Observable<Shares> list(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/share/{share_id}")
    Observable<SingleShare> get(@Path("share_id") String shareId, @QueryMap Map<String, Object> params);
}

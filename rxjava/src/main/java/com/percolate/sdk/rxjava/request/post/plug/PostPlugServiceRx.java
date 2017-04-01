package com.percolate.sdk.rxjava.request.post.plug;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Plugs;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Percolate v4/post/plug API definition.
 */
interface PostPlugServiceRx {

    @GET(Endpoints.API_V4_PATH + "/post/plug/")
    Observable<Plugs> get(@QueryMap Map<String, Object> params);
}

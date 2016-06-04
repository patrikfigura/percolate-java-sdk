package com.percolate.sdk.rxjava.request.post.plug;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Plugs;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v4/post/plug API definition.
 */
interface PostPlugService {

    @GET(Endpoints.API_V4_PATH + "/post/plug/")
    Observable<Plugs> get(@QueryMap Map<String, Object> params);
}

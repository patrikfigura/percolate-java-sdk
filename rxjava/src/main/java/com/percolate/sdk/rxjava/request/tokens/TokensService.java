package com.percolate.sdk.rxjava.request.tokens;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Tokens;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v4/token API definition.
 */
interface TokensService {

    @GET(Endpoints.API_V4_PATH + "/token/")
    Observable<Tokens> get(@QueryMap Map<String, Object> params);

    @DELETE(Endpoints.API_V4_PATH + "/token/{token_id}")
    Observable<ResponseBody> delete(@Path("token_id") String tokenId, @QueryMap Map<String, Object> params);
}

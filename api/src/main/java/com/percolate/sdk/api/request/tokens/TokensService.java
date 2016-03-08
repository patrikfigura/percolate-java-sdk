package com.percolate.sdk.api.request.tokens;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.Tokens;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v4/token API definition.
 */
interface TokensService {

    @GET(PercolateApi.API_V4_PATH + "/token/")
    Call<Tokens> get(@QueryMap Map<String, Object> params);

    @DELETE(PercolateApi.API_V4_PATH + "/token/{token_id}")
    Call<ResponseBody> delete(@Path("token_id") String tokenId, @QueryMap Map<String, Object> params);
}

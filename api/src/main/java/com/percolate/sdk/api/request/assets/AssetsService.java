package com.percolate.sdk.api.request.assets;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Assets;
import com.percolate.sdk.dto.SingleAsset;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;

import java.util.Map;

/**
 * Percolate v5/asset API definitions.
 */
interface AssetsService {

    @GET(Endpoints.API_V5_PATH + "/asset/{asset_id}")
    Call<SingleAsset> get(@Path("asset_id") String assetId, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/asset")
    Call<Assets> list(@QueryMap Map<String, Object> params);

    @Streaming
    @GET(Endpoints.API_V5_PATH + "/asset/{asset_id}/download")
    Call<ResponseBody> download(@Path("asset_id") String assetId, @QueryMap Map<String, Object> params);
}

package com.percolate.sdk.rxjava.request.assets;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Assets;
import com.percolate.sdk.dto.SingleAsset;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;

/**
 * Percolate v5/asset, v5/folder, v5/variant API definitions.
 */
interface AssetsServiceRx {

    @GET(Endpoints.API_V5_PATH + "/asset/{asset_id}")
    Observable<SingleAsset> get(@Path("asset_id") String assetId, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/asset")
    Observable<Assets> list(@QueryMap Map<String, Object> params);

    @Streaming
    @GET(Endpoints.API_V5_PATH + "/asset/{asset_id}/download")
    Observable<ResponseBody> download(@Path("asset_id") String assetId, @QueryMap Map<String, Object> params);
}

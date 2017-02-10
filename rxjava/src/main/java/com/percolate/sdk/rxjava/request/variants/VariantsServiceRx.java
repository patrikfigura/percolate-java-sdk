package com.percolate.sdk.rxjava.request.variants;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.SingleVariant;
import com.percolate.sdk.dto.Variants;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;
import rx.Observable;

import java.util.Map;

/**
 * Percolate v5/variant API definitions.
 */
interface VariantsServiceRx {

    @GET(Endpoints.API_V5_PATH + "/variant/{variant_id}")
    Observable<SingleVariant> get(@Path("variant_id") String variantId, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/variant")
    Observable<Variants> list(@QueryMap Map<String, Object> params);

    @Streaming
    @GET(Endpoints.API_V5_PATH + "/variant/{variant_id}/download")
    Observable<ResponseBody> download(@Path("asset_id") String assetId, @QueryMap Map<String, Object> params);
}

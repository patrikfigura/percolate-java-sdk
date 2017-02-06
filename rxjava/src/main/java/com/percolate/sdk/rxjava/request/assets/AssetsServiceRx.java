package com.percolate.sdk.rxjava.request.assets;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Assets;
import com.percolate.sdk.dto.Folders;
import com.percolate.sdk.dto.Variants;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

import java.util.Map;

/**
 * Percolate v5/asset, v5/folder, v5/variant API definitions.
 */
interface AssetsServiceRx {

    @GET(Endpoints.API_V5_PATH + "/asset")
    Observable<Assets> list(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/folder")
    Observable<Folders> folder(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/variant")
    Observable<Variants> variant(@QueryMap Map<String, Object> params);
}

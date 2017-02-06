package com.percolate.sdk.api.request.assets;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v5/asset, v5/folder, v5/variant API definitions.
 */
interface AssetsService {

    @GET(Endpoints.API_V5_PATH + "/asset")
    Call<Assets> list(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/folder")
    Call<Folders> folder(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/variant")
    Call<Variants> variant(@QueryMap Map<String, Object> params);

}

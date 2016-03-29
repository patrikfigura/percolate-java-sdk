package com.percolate.sdk.api.request.schema;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Schemas;
import com.percolate.sdk.dto.SingleSchema;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v5/schema API definition.
 */
interface SchemasService {

    @GET(Endpoints.API_V5_PATH + "/schema/")
    Call<Schemas> list(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/schema/{schema_id}")
    Call<SingleSchema> get(@Path("schema_id") String schemaId, @QueryMap Map<String, Object> params);
}

package com.percolate.sdk.rxjava.request.schema;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Schemas;
import com.percolate.sdk.dto.SingleSchema;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v5/schema API definition.
 */
interface SchemasService {

    @GET(Endpoints.API_V5_PATH + "/schema/")
    Observable<Schemas> list(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/schema/{schema_id}")
    Observable<SingleSchema> get(@Path("schema_id") String schemaId, @QueryMap Map<String, Object> params);
}

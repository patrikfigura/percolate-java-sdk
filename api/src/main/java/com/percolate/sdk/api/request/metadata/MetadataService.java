package com.percolate.sdk.api.request.metadata;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * Percolate v5/metadata API definition.
 */
interface MetadataService {

    @GET(Endpoints.API_V5_PATH + "/metadata/{metadata_id}")
    Call<SingleMetadataItem> get(@Path("metadata_id") String metadataId);

    @GET(Endpoints.API_V5_PATH + "/metadata/")
    Call<MetadataList> list(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V5_PATH + "/metadata/")
    Call<SingleMetadataItem> create(@Body MetadataItem metadataItem);

    @PUT(Endpoints.API_V5_PATH + "/metadata/{metadata_id}")
    Call<SingleMetadataItem> update(@Path("metadata_id") String metadataId, @Body MetadataItem metadataItem);
}

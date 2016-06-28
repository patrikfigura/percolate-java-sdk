package com.percolate.sdk.rxjava.request.metadata;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.MetadataItem;
import com.percolate.sdk.dto.MetadataList;
import com.percolate.sdk.dto.SingleMetadataItem;
import retrofit2.http.*;
import rx.Observable;

import java.util.Map;

/**
 * Percolate v5/metadata API definition.
 */
interface MetadataServiceRx {

    @GET(Endpoints.API_V5_PATH + "/metadata/{metadata_id}")
    Observable<SingleMetadataItem> get(@Path("metadata_id") String metadataId);

    @GET(Endpoints.API_V5_PATH + "/metadata/")
    Observable<MetadataList> list(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V5_PATH + "/metadata/")
    Observable<SingleMetadataItem> create(@Body MetadataItem metadataItem);

    @PUT(Endpoints.API_V5_PATH + "/metadata/{metadata_id}")
    Observable<SingleMetadataItem> update(@Path("metadata_id") String metadataId, @Body MetadataItem metadataItem);
}

package com.percolate.sdk.api.request.metadata;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.*;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Metadata request proxy.
 */
@SuppressWarnings("unused")
public class MetadataRequest {

    private MetadataService service;

    public MetadataRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(MetadataService.class);
    }

    /**
     * Query metadata endpoint.
     *
     * @param metadataId Metadata item UID.
     * @return {@link Call} object.
     */
    public Call<SingleMetadataItem> get(@NotNull final String metadataId) {
        return service.get(metadataId);
    }

    /**
     * Query metadata endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<MetadataList> list(@NotNull final MetadataParams params) {
        return service.list(params.getParams());
    }

    /**
     * Create metadata data item.
     *
     * @param metadataItem {@link MetadataItem} object.
     * @return {@link SingleMetadataItem} object.
     */
    public Call<SingleMetadataItem> create(@NotNull final MetadataItem metadataItem) {
        return service.create(metadataItem);
    }
}

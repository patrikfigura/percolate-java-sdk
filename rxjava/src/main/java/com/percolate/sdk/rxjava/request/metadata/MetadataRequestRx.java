package com.percolate.sdk.rxjava.request.metadata;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.metadata.MetadataParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.MetadataItem;
import com.percolate.sdk.dto.MetadataList;
import com.percolate.sdk.dto.SingleMetadataItem;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

/**
 * Metadata request proxy.
 */
@SuppressWarnings("unused")
public class MetadataRequestRx {

    private MetadataServiceRx service;

    public MetadataRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(MetadataServiceRx.class);
    }

    /**
     * Query metadata endpoint.
     *
     * @param metadataId Metadata item UID.
     * @return {@link Observable} object.
     */
    public Observable<SingleMetadataItem> get(@NotNull final String metadataId) {
        return service.get(metadataId);
    }

    /**
     * Query metadata endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<MetadataList> list(@NotNull final MetadataParams params) {
        return service.list(params.getParams());
    }

    /**
     * Create metadata data item.
     *
     * @param metadataItem {@link MetadataItem} object.
     * @return {@link SingleMetadataItem} object.
     */
    public Observable<SingleMetadataItem> create(@NotNull final MetadataItem metadataItem) {
        return service.create(metadataItem);
    }
}

package com.percolate.sdk.rxjava.request.assets;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.assets.AssetsListParams;
import com.percolate.sdk.api.request.assets.FolderListParams;
import com.percolate.sdk.api.request.assets.VariantParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Assets;
import com.percolate.sdk.dto.Folders;
import com.percolate.sdk.dto.Variants;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

/**
 * Assets request proxy.
 */
public class AssetsRequestRx {

    private AssetsServiceRx service;

    public AssetsRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(AssetsServiceRx.class);
    }

    /**
     * Query assets endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Assets> list(@NotNull final AssetsListParams params) {
        return service.list(params.getParams());
    }

    /**
     * Query assets folder endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Folders> folder(@NotNull final FolderListParams params) {
        return service.folder(params.getParams());
    }

    /**
     * Query assets variant endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Variants> variant(@NotNull final VariantParams params) {
        return service.variant(params.getParams());
    }
}

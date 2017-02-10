package com.percolate.sdk.rxjava.request.assets;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.assets.AssetsGetParams;
import com.percolate.sdk.api.request.assets.AssetsListParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Assets;
import com.percolate.sdk.dto.SingleAsset;
import okhttp3.ResponseBody;
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
    public Observable<SingleAsset> get(@NotNull final AssetsGetParams params) {
        return service.get(params.getAssetId(), params.getParams());
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
     * Query assets variant endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<ResponseBody> download(@NotNull String assetId, @NotNull final AssetsListParams params) {
        return service.download(assetId, params.getParams());
    }

}

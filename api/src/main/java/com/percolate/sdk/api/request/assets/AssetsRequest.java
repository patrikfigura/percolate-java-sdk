package com.percolate.sdk.api.request.assets;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.*;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Assets request proxy.
 */
@SuppressWarnings("unused")
public class AssetsRequest {

    private AssetsService service;

    public AssetsRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(AssetsService.class);
    }

    /**
     * Query assets endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<SingleAsset> get(@NotNull final AssetsGetParams params) {
        return service.get(params.getAssetId(), params.getParams());
    }

    /**
     * Query assets endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Assets> list(@NotNull final AssetsListParams params) {
        return service.list(params.getParams());
    }

    /**
     * Query assets variant endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<ResponseBody> download(@NotNull String assetId, @NotNull final AssetsListParams params) {
        return service.download(assetId, params.getParams());
    }
}

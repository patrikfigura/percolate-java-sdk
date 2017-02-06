package com.percolate.sdk.api.request.assets;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.*;
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
    public Call<Assets> list(@NotNull final AssetsListParams params) {
        return service.list(params.getParams());
    }

    /**
     * Query assets folder endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Folders> folder(@NotNull final FolderListParams params) {
        return service.folder(params.getParams());
    }

    /**
     * Query assets variant endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Variants> variant(@NotNull final VariantParams params) {
        return service.variant(params.getParams());
    }
}

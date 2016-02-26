package com.percolate.sdk.api.request.shares;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Shares;
import com.percolate.sdk.dto.SingleShare;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Shares request proxy.
 */
@SuppressWarnings("unused")
public class SharesRequest {

    private SharesService service;

    public SharesRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(SharesService.class);
    }

    /**
     * Query shares endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Shares> list(@NotNull final SharesListParams params) {
        return service.list(params.getParams());
    }

    /**
     * Query shares endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<SingleShare> get(@NotNull final SharesGetParams params) {
        return service.get(params.getShareId(), params.getParams());
    }
}

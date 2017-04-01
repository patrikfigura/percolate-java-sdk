package com.percolate.sdk.rxjava.request.shares;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.shares.SharesGetParams;
import com.percolate.sdk.api.request.shares.SharesListParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Shares;
import com.percolate.sdk.dto.SingleShare;

import org.jetbrains.annotations.NotNull;

import io.reactivex.Observable;

/**
 * Shares request proxy.
 */
@SuppressWarnings("unused")
public class SharesRequestRx {

    private SharesServiceRx service;

    public SharesRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(SharesServiceRx.class);
    }

    /**
     * Query shares endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Shares> list(@NotNull final SharesListParams params) {
        return service.list(params.getParams());
    }

    /**
     * Query shares endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<SingleShare> get(@NotNull final SharesGetParams params) {
        return service.get(params.getShareId(), params.getParams());
    }
}

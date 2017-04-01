package com.percolate.sdk.rxjava.request.folders;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.folders.FoldersGetParams;
import com.percolate.sdk.api.request.folders.FoldersListParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Folders;
import com.percolate.sdk.dto.SingleFolder;

import org.jetbrains.annotations.NotNull;

import io.reactivex.Observable;

/**
 * Folders request proxy.
 */
@SuppressWarnings("unused")
public class FoldersRequestRx {

    private FoldersServiceRx service;

    public FoldersRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(FoldersServiceRx.class);
    }

    /**
     * Query folder endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<SingleFolder> get(@NotNull final FoldersGetParams params) {
        return service.get(params.getFolderId(), params.getParams());
    }

    /**
     * Query folder endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Folders> list(@NotNull final FoldersListParams params) {
        return service.list(params.getParams());
    }
}

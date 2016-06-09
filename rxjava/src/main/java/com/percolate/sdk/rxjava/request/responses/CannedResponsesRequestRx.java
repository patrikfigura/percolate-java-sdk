package com.percolate.sdk.rxjava.request.responses;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.responses.CannedResponsesParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.CannedResponses;

import org.jetbrains.annotations.NotNull;

import rx.Observable;

/**
 * Canned Responses request proxy.
 */
@SuppressWarnings("unused")
public class CannedResponsesRequestRx {

    private CannedResponsesServiceRx service;

    public CannedResponsesRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(CannedResponsesServiceRx.class);
    }

    /**
     * Query canned responses endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<CannedResponses> get(@NotNull final CannedResponsesParams params) {
        return service.get(params.getParams());
    }
}

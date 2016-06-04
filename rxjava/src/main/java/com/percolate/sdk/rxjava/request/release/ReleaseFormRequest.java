package com.percolate.sdk.rxjava.request.release;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.release.ReleaseFormParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.ReleaseFormHtml;

import org.jetbrains.annotations.NotNull;

import rx.Observable;

/**
 * Release Form request proxy.
 */
@SuppressWarnings("unused")
public class ReleaseFormRequest {

    private ReleaseFormService service;

    public ReleaseFormRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(ReleaseFormService.class);
    }

    /**
     * Query release form endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<ReleaseFormHtml> get(@NotNull final ReleaseFormParams params) {
        return service.get(params.getParams());
    }
}

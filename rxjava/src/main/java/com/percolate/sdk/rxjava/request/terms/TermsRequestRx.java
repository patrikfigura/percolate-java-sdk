package com.percolate.sdk.rxjava.request.terms;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.terms.TermsParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.SingleTerm;
import com.percolate.sdk.dto.Term;
import com.percolate.sdk.dto.Terms;

import org.jetbrains.annotations.NotNull;

import io.reactivex.Observable;

/**
 * Terms request proxy.
 */
@SuppressWarnings("unused")
public class TermsRequestRx {

    private TermsServiceRx service;

    public TermsRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(TermsServiceRx.class);
    }

    /**
     * Query terms endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Terms> get(@NotNull final TermsParams params) {
        return service.get(params.getParams());
    }

    /**
     * Create term.
     *
     * @param term {@link Term} object.
     * @return {@link SingleTerm} object.
     */
    public Observable<SingleTerm> create(@NotNull final Term term) {
        return service.create(term);
    }
}

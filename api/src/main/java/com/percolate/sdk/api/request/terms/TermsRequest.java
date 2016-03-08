package com.percolate.sdk.api.request.terms;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.SingleTerm;
import com.percolate.sdk.dto.Term;
import com.percolate.sdk.dto.Terms;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Terms request proxy.
 */
@SuppressWarnings("unused")
public class TermsRequest {

    private TermsService service;

    public TermsRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(TermsService.class);
    }

    /**
     * Query terms endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Terms> get(@NotNull final TermsParams params) {
        return service.get(params.getParams());
    }

    /**
     * Create term.
     *
     * @param term {@link Term} object.
     * @return {@link SingleTerm} object.
     */
    public Call<SingleTerm> create(@NotNull final Term term) {
        return service.create(term);
    }
}

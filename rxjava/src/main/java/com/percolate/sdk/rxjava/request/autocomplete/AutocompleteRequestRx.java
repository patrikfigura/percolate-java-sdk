package com.percolate.sdk.rxjava.request.autocomplete;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.autocomplete.AutocompleteParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.AutocompleteResponse;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

/**
 * Autocomplete request proxy.
 */
@SuppressWarnings("unused")
public class AutocompleteRequestRx {

    private AutocompleteServiceRx service;

    public AutocompleteRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(AutocompleteServiceRx.class);
    }

    /**
     * Query autocomplete endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<AutocompleteResponse> get(@NotNull final AutocompleteParams params) {
        return service.get(params.getParams());
    }
}

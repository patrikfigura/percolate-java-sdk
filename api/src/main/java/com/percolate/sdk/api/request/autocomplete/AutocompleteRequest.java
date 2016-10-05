package com.percolate.sdk.api.request.autocomplete;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.AutocompleteResponse;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Autocomplete request proxy.
 */
@SuppressWarnings("unused")
public class AutocompleteRequest {

    private AutocompleteService service;

    public AutocompleteRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(AutocompleteService.class);
    }

    /**
     * Query autocomplete endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<AutocompleteResponse> get(@NotNull final AutocompleteParams params) {
        return service.get(params.getParams());
    }
}

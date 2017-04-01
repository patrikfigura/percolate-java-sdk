package com.percolate.sdk.rxjava.request.autocomplete;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.AutocompleteResponse;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Percolate v5/autocomplete/ API definition.
 */
interface AutocompleteServiceRx {

    @GET(Endpoints.API_V5_PATH + "/autocomplete/")
    Observable<AutocompleteResponse> get(@QueryMap Map<String, Object> params);
}

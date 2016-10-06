package com.percolate.sdk.api.request.autocomplete;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.AutocompleteResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v5/autocomplete/ API definition.
 */
interface AutocompleteService {

    @GET(Endpoints.API_V5_PATH + "/autocomplete/")
    Call<AutocompleteResponse> get(@QueryMap Map<String, Object> params);
}

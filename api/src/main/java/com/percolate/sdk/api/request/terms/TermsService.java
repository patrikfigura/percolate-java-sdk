package com.percolate.sdk.api.request.terms;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.SingleTerm;
import com.percolate.sdk.dto.Term;
import com.percolate.sdk.dto.Terms;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v5/terms API definition.
 */
interface TermsService {

    @GET(PercolateApi.API_V5_PATH + "/term/")
    Call<Terms> get(@QueryMap Map<String, Object> params);

    @POST(PercolateApi.API_V5_PATH + "/term/")
    Call<SingleTerm> create(@Body Term term);
}

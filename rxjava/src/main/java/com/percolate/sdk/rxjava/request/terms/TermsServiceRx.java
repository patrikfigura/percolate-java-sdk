package com.percolate.sdk.rxjava.request.terms;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.SingleTerm;
import com.percolate.sdk.dto.Term;
import com.percolate.sdk.dto.Terms;

import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v5/terms API definition.
 */
interface TermsServiceRx {

    @GET(Endpoints.API_V5_PATH + "/term/")
    Observable<Terms> get(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V5_PATH + "/term/")
    Observable<SingleTerm> create(@Body Term term);
}

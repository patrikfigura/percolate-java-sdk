package com.percolate.sdk.rxjava.request.brief;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Brief;
import com.percolate.sdk.dto.BriefData;
import com.percolate.sdk.dto.Briefs;

import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v4/brief API definition.
 */
interface BriefServiceRx {

    @GET(Endpoints.API_V4_PATH + "/brief/")
    Observable<Briefs> list(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/brief/{brief_id}")
    Observable<BriefData> get(@Path("brief_id") String briefId);

    @POST(Endpoints.API_V4_PATH + "/brief/")
    Observable<BriefData> create(@Body Brief brief);

}

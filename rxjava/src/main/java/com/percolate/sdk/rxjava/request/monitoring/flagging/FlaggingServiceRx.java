package com.percolate.sdk.rxjava.request.monitoring.flagging;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Flag;
import com.percolate.sdk.dto.Flags;
import com.percolate.sdk.dto.SingleFlag;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/**
 * Percolate v4/monitoring/flag API definition.
 */
interface FlaggingServiceRx {

    @GET(Endpoints.API_V4_PATH + "/monitoring/flag/")
    Observable<Flags> list(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/monitoring/flag/{flag_id}")
    Observable<SingleFlag> get(@Path("flag_id") String flagId, @QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V4_PATH + "/monitoring/flag/")
    Observable<SingleFlag> create(@Body Flag flag);

    @PUT(Endpoints.API_V4_PATH + "/monitoring/flag/{flag_id}")
    Observable<SingleFlag> update(@Path("flag_id") String flagId, @Body Flag flag);

    @DELETE(Endpoints.API_V4_PATH + "/monitoring/flag/{flag_id}")
    Observable<ResponseBody> delete(@Path("flag_id") String flagId, @QueryMap Map<String, Object> params);
}

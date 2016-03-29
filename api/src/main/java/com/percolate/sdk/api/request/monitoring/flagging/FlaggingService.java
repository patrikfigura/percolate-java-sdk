package com.percolate.sdk.api.request.monitoring.flagging;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * Percolate v4/monitoring/flag API definition.
 */
interface FlaggingService {

    @GET(Endpoints.API_V4_PATH + "/monitoring/flag/")
    Call<Flags> list(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/monitoring/flag/{flag_id}")
    Call<SingleFlag> get(@Path("flag_id") String flagId, @QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V4_PATH + "/monitoring/flag/")
    Call<SingleFlag> create(@Body Flag flag);

    @PUT(Endpoints.API_V4_PATH + "/monitoring/flag/{flag_id}")
    Call<SingleFlag> update(@Path("flag_id") String flagId, @Body Flag flag);

    @DELETE(Endpoints.API_V4_PATH + "/monitoring/flag/{flag_id}")
    Call<ResponseBody> delete(@Path("flag_id") String flagId, @QueryMap Map<String, Object> params);
}

package com.percolate.sdk.rxjava.request.task;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.SingleTask;
import com.percolate.sdk.dto.Task;
import com.percolate.sdk.dto.Tasks;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v5/task API definition.
 */
interface TasksServiceRx {

    @GET(Endpoints.API_V5_PATH + "/task/")
    Observable<Tasks> get(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V5_PATH + "/task/")
    Observable<SingleTask> create(@Body Task task);

    @PUT(Endpoints.API_V5_PATH + "/task/{id}")
    Observable<SingleTask> update(@Path("id") String id, @Body Task task);

    @DELETE(Endpoints.API_V5_PATH + "/task/{id}")
    Observable<ResponseBody> delete(@Path("id") String id, @QueryMap Map<String, Object> params);
}

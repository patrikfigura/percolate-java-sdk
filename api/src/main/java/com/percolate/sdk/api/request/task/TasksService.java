package com.percolate.sdk.api.request.task;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.SingleTask;
import com.percolate.sdk.dto.Task;
import com.percolate.sdk.dto.Tasks;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * Percolate v5/task API definition.
 */
interface TasksService {

    @GET(PercolateApi.API_V5_PATH + "/task/")
    Call<Tasks> get(@QueryMap Map<String, Object> params);

    @POST(PercolateApi.API_V5_PATH + "/task/")
    Call<SingleTask> create(@Body Task task);

    @PUT(PercolateApi.API_V5_PATH + "/task/{id}")
    Call<SingleTask> update(@Path("id") String id, @Body Task task);

    @DELETE(PercolateApi.API_V5_PATH + "/task/{id}")
    Call<ResponseBody> delete(@Path("id") String id, @QueryMap Map<String, Object> params);
}

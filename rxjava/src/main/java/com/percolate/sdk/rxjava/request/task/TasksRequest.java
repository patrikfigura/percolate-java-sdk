package com.percolate.sdk.rxjava.request.task;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.task.TasksDeleteParams;
import com.percolate.sdk.api.request.task.TasksParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.SingleTask;
import com.percolate.sdk.dto.Task;
import com.percolate.sdk.dto.Tasks;

import org.jetbrains.annotations.NotNull;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import rx.Observable;

/**
 * Task request proxy.
 */
@SuppressWarnings("unused")
public class TasksRequest {

    private TasksService service;

    public TasksRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(TasksService.class);
    }

    /**
     * Query tasks endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Tasks> get(@NotNull final TasksParams params) {
        return service.get(params.getParams());
    }

    /**
     * Create task.
     *
     * @param task {@link Task} object.
     * @return {@link SingleTask} object.
     */
    public Observable<SingleTask> create(@NotNull final Task task) {
        return service.create(task);
    }

    /**
     * Update task.
     *
     * @param task {@link Task} object.
     * @return {@link SingleTask} object.
     */
    public Observable<SingleTask> update(@NotNull final Task task) {
        return service.update(task.getId(), task);
    }

    /**
     * Delete task.
     *
     * @param params API params.
     * @return {@link RequestBody} object.
     */
    public Observable<ResponseBody> delete(@NotNull final TasksDeleteParams params) {
        return service.delete(params.getTaskId(), params.getParams());
    }
}

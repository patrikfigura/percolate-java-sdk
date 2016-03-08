package com.percolate.sdk.api.request.task;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Task delete request.
 */
@SuppressWarnings("unused")
public class TasksDeleteParams {
    private Map<String, Object> params = new HashMap<>();
    private String taskId;

    public TasksDeleteParams(String taskId) {
        this.taskId = taskId;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getTaskId() {
        return taskId;
    }
}

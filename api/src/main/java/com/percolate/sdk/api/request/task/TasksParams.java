package com.percolate.sdk.api.request.task;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Task get request.
 */
@SuppressWarnings("unused")
public class TasksParams {
    private Map<String, Object> params = new HashMap<>();

    public TasksParams() {
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public TasksParams ids(List<String> ids) {
        params.put("ids", StringUtils.join(ids, ","));
        return this;
    }

    public TasksParams scopeIds(List<String> scopeIds) {
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public TasksParams assigneeIds(List<String> assigneeIds) {
        params.put("assignee_ids", StringUtils.join(assigneeIds, ","));
        return this;
    }

    public TasksParams hasAssigneeId(Boolean hasAssigneeId) {
        params.put("has_assignee_id", hasAssigneeId);
        return this;
    }

    public TasksParams isComplete(Boolean isComplete) {
        params.put("is_complete", isComplete);
        return this;
    }

    public TasksParams subjectIds(List<String> subjectIds) {
        params.put("subject_ids", StringUtils.join(subjectIds, ","));
        return this;
    }

    public TasksParams subjectTypes(List<String> subjectTypes) {
        params.put("subject_types", StringUtils.join(subjectTypes, ","));
        return this;
    }

    public TasksParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public TasksParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public TasksParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public TasksParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public TasksParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }
}

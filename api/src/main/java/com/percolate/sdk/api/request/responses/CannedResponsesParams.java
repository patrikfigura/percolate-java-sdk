package com.percolate.sdk.api.request.responses;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Canned responses request.
 */
@SuppressWarnings("unused")
public class CannedResponsesParams {
    private Map<String, Object> params = new HashMap<>();

    public CannedResponsesParams() {
    }

    public CannedResponsesParams scopeIds(List<String> scopeIds){
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public CannedResponsesParams availableForIds(List<String> availableForIds){
        params.put("available_for_ids", StringUtils.join(availableForIds, ","));
        return this;
    }

    public CannedResponsesParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public CannedResponsesParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public CannedResponsesParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public CannedResponsesParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public CannedResponsesParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

package com.percolate.sdk.api.request.monitoring.twitter;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Twitter Responses request.
 */
@SuppressWarnings("unused")
public class TwitterMonitoringQueryParams {
    private Map<String, Object> params = new HashMap<>();

    public TwitterMonitoringQueryParams() {
    }

    public TwitterMonitoringQueryParams ownerUid(String ownerUid) {
        params.put("owner_uid", ownerUid);
        return this;
    }

    public TwitterMonitoringQueryParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public TwitterMonitoringQueryParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public TwitterMonitoringQueryParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public TwitterMonitoringQueryParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public TwitterMonitoringQueryParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }
    public Map<String, Object> getParams() {
        return params;
    }
}

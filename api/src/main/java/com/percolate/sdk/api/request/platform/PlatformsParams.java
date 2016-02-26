package com.percolate.sdk.api.request.platform;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Platforms request.
 */
@SuppressWarnings("unused")
public class PlatformsParams {
    private Map<String, Object> params = new HashMap<>();

    public PlatformsParams() {
    }

    public PlatformsParams scopeId(String scopeId) {
        params.put("scope_ids", scopeId);
        return this;
    }

    public PlatformsParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public PlatformsParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public PlatformsParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public PlatformsParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public PlatformsParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

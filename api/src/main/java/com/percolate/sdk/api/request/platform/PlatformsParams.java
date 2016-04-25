package com.percolate.sdk.api.request.platform;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Platforms request.
 */
@SuppressWarnings("unused")
public class PlatformsParams {
    private Map<String, Object> params = new HashMap<>();

    public PlatformsParams() {
    }

    public PlatformsParams ids(List<String> ids) {
        params.put("ids", StringUtils.join(ids, ","));
        return this;
    }

    public PlatformsParams scopeIds(List<String> scopeIds) {
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public PlatformsParams types(List<String> types) {
        params.put("types", StringUtils.join(types, ","));
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

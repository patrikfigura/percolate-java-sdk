package com.percolate.sdk.api.request.channel;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Channel request.
 */
@SuppressWarnings("unused")
public class ChannelParams {
    private Map<String, Object> params = new HashMap<>();

    public ChannelParams() {
    }

    public ChannelParams scopeIds(List<String> scopeIds) {
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public ChannelParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public ChannelParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public ChannelParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public ChannelParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public ChannelParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

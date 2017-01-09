package com.percolate.sdk.api.request.features;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Features request.
 */
@SuppressWarnings("unused")
public class FeaturesParams {
    private Map<String, Object> params = new HashMap<>();

    public FeaturesParams() {
    }

    public FeaturesParams scopeId(String scopeId) {
        params.put("scope_id", scopeId);
        return this;
    }

    public FeaturesParams scopeIds(List<String> scopeIds) {
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

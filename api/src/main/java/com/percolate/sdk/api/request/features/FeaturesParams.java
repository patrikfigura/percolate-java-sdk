package com.percolate.sdk.api.request.features;

import java.util.HashMap;
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

    public Map<String, Object> getParams() {
        return params;
    }
}

package com.percolate.sdk.api.request.interaction;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Interaction request.
 */
@SuppressWarnings("unused")
public class InteractionParams {
    private Map<String, Object> params = new HashMap<>();

    public InteractionParams() {
    }

    public InteractionParams scopeIds(List<String> scopeIds) {
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public InteractionParams xids(List<String> xids) {
        params.put("xids", StringUtils.join(xids, ","));
        return this;
    }

    public InteractionParams platform(String platform){
        params.put("platform", platform);
        return this;
    }
    public InteractionParams limit(String limit){
        params.put("limit", limit);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

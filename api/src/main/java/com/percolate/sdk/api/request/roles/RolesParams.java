package com.percolate.sdk.api.request.roles;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Roles request.
 */
@SuppressWarnings("unused")
public class RolesParams {
    private Map<String, Object> params = new HashMap<>();

    public RolesParams() {
    }

    public RolesParams scopeIds(List<String> scopeIds) {
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

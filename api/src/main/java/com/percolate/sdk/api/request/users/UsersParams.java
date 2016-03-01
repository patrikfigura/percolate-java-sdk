package com.percolate.sdk.api.request.users;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Users request.
 */
@SuppressWarnings("unused")
public class UsersParams {
    private Map<String, Object> params = new HashMap<>();

    public UsersParams() {
    }

    public UsersParams ids(List<String> ids) {
        params.put("ids", StringUtils.join(ids, ","));
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

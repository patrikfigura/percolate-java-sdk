package com.percolate.sdk.api.request.authorization;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for UserRoles request.
 */
@SuppressWarnings("unused")
public class UserRolesParams {

    private String userId;
    private Map<String, Object> params = new HashMap<>();

    public UserRolesParams(final String userId) {
        this.userId = userId;
    }

    public UserRolesParams licenseId(String licenseId) {
        params.put("license_id", licenseId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getUserId() {
        return userId;
    }
}

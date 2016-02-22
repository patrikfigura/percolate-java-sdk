package com.percolate.sdk.api.request.license.users;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for LicenseUsers request.
 */
@SuppressWarnings("unused")
public class LicenseUsersParams {
    private String licenseId;
    private Map<String, Object> params = new HashMap<>();

    public LicenseUsersParams(String licenseId) {
        this.licenseId = licenseId;
    }

    public LicenseUsersParams searchQuery(String searchQuery) {
        params.put("search_query", searchQuery);
        return this;
    }

    public LicenseUsersParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public LicenseUsersParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public LicenseUsersParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getLicenseId() {
        return licenseId;
    }
}

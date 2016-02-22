package com.percolate.sdk.api.request.media;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Media request.
 */
@SuppressWarnings("unused")
public class MediaGetParams {
    private Map<String, Object> params = new HashMap<>();

    public MediaGetParams() {
    }

    public MediaGetParams licenseId(String licenseId) {
        params.put("license_id", licenseId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

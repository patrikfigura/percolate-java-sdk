package com.percolate.sdk.api.request.release;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Release Form request.
 */
@SuppressWarnings("unused")
public class ReleaseFormParams {
    private Map<String, Object> params = new HashMap<>();

    public ReleaseFormParams() {
    }

    public ReleaseFormParams licenseId(String licenseId){
        params.put("license_id", licenseId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

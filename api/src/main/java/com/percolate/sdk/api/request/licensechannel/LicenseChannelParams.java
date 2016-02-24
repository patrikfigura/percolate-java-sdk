package com.percolate.sdk.api.request.licensechannel;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for LicenseChannel request.
 */
@SuppressWarnings("unused")
public class LicenseChannelParams {
    private Map<String, Object> params = new HashMap<>();

    public LicenseChannelParams() {
        params.put("limit", "1000");
    }

    public LicenseChannelParams uids(List<String> uids) {
        params.put("uids", StringUtils.join(uids, ","));
        return this;
    }

    public LicenseChannelParams licenseId(String licenseId) {
        params.put("license_id", licenseId);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

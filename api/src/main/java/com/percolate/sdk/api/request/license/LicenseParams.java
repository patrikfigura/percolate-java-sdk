package com.percolate.sdk.api.request.license;

import com.percolate.sdk.enums.LicenseType;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.BooleanUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for License request.
 */
@SuppressWarnings("unused")
public class LicenseParams {
    private Map<String, Object> params = new HashMap<>();

    public LicenseParams() {
        params.put("limit", "1000");
    }

    public LicenseParams userId(String userId) {
        params.put("user_id", userId);
        return this;
    }

    public LicenseParams expandHierarchical(Boolean expandHierarchical) {
        params.put("expand_hierarchical", BooleanUtils.toStringTrueFalse(expandHierarchical));
        return this;
    }

    public LicenseParams types(List<LicenseType> types) {
        params.put("types", StringUtils.join(types, ",").toLowerCase());
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

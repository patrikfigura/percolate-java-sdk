package com.percolate.sdk.api.request.terms;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Terms request.
 */
@SuppressWarnings("unused")
public class TermsParams {
    private Map<String, Object> params = new HashMap<>();

    public TermsParams() {
        params.put("limit", "1000");
    }

    public TermsParams termIds(List<String> termIds) {
        params.put("ids", StringUtils.join(termIds, ","));
        return this;
    }

    public TermsParams scopeId(String scopeId) {
        params.put("scope_ids", scopeId);
        return this;
    }

    public TermsParams search(String search){
        params.put("search", search);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

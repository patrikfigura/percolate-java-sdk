package com.percolate.sdk.api.request.autocomplete;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for Autocomplete request.
 */
@SuppressWarnings("unused")
public class AutocompleteParams {
    private Map<String, Object> params = new HashMap<>();

    public AutocompleteParams() {
    }

    public AutocompleteParams scopeIds(List<String> scopeIds) {
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public AutocompleteParams searchUrl(String searchUrl){
        params.put("search_url", searchUrl);
        return this;
    }

    public AutocompleteParams search(String search){
        params.put("search", search);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

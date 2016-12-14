package com.percolate.sdk.api.request.terms;

import com.percolate.sdk.enums.TermIncludeTypes;
import com.percolate.sdk.enums.TermModeTypes;
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

    public TermsParams scopeIds(List<String> scopeIds) {
        params.put("scope_ids", StringUtils.join(scopeIds, ","));
        return this;
    }

    public TermsParams search(String search){
        params.put("search", search);
        return this;
    }

    public TermsParams parentIds(List<String> parentIds) {
        params.put("parent_ids", StringUtils.join(parentIds, ","));
        return this;
    }

    public TermsParams include(List<TermIncludeTypes> include) {
        params.put("include", StringUtils.join(include, ",").toLowerCase());
        return this;
    }

    public TermsParams mode(TermModeTypes mode){
        params.put("mode", mode.toString().toLowerCase());
        return this;
    }

    public TermsParams depth(String depth){
        params.put("depth", depth);
        return this;
    }

    public TermsParams namespace(String namespace){
        params.put("namespace", namespace);
        return this;
    }

    public TermsParams limit(String limit){
        params.put("limit", limit);
        return this;
    }

    public TermsParams offset(String offset){
        params.put("offset", offset);
        return this;
    }


    public Map<String, Object> getParams() {
        return params;
    }
}

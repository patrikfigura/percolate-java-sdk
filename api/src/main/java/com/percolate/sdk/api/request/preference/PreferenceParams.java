package com.percolate.sdk.api.request.preference;

import com.percolate.sdk.enums.PreferenceNameType;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PreferenceParams {

    private Map<String, Object> params = new HashMap<>();

    public PreferenceParams names(List<PreferenceNameType> names) {
        params.put("names", StringUtils.join(names, ",").toLowerCase());
        return this;
    }

   public PreferenceParams withScopeIds(List<String> scopeIds) {
       params.put("with_scope_ids", StringUtils.join(scopeIds, ","));
       return this;
   }

    public Map<String, Object> getParams() {
        return params;
    }

}


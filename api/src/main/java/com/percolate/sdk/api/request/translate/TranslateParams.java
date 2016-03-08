package com.percolate.sdk.api.request.translate;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Translate request.
 */
@SuppressWarnings("unused")
public class TranslateParams {
    private Map<String, Object> params = new HashMap<>();

    public TranslateParams() {
    }

    public TranslateParams scopeId(String scopeId) {
        params.put("scope_id", scopeId);
        return this;
    }

    public TranslateParams text(String text){
        params.put("text", text);
        return this;
    }

    public TranslateParams target(String target){
        params.put("target", target);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

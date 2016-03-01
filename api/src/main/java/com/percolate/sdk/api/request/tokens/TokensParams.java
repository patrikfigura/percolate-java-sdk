package com.percolate.sdk.api.request.tokens;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Tokens request.
 */
@SuppressWarnings("unused")
public class TokensParams {
    private Map<String, Object> params = new HashMap<>();

    public TokensParams() {
    }

    public TokensParams licenseId(String licenseId){
        params.put("license_id", licenseId);
        return this;
    }

    public TokensParams page(Integer page) {
        params.put("page", page);
        return this;
    }

    public TokensParams offset(Integer offset) {
        params.put("offset", offset);
        return this;
    }

    public TokensParams limit(Integer limit) {
        params.put("limit", limit);
        return this;
    }

    public TokensParams orderBy(String orderBy) {
        params.put("order_by", orderBy);
        return this;
    }

    public TokensParams orderDirection(String orderDirection) {
        params.put("order_direction", orderDirection);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

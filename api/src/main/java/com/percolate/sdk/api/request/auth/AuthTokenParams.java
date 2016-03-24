package com.percolate.sdk.api.request.auth;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Auth Token request.
 */
@SuppressWarnings("unused")
public class AuthTokenParams {
    private Map<String, Object> params = new HashMap<>();

    public AuthTokenParams() {
    }

    public AuthTokenParams userId(String userId) {
        params.put("user_id", userId);
        return this;
    }

    public AuthTokenParams code(String code) {
        params.put("code", code);
        return this;
    }

    public AuthTokenParams secret(String secret) {
        params.put("secret", secret);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

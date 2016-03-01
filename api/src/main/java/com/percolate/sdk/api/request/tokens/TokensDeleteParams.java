package com.percolate.sdk.api.request.tokens;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for Token delete request.
 */
@SuppressWarnings("unused")
public class TokensDeleteParams {
    private Map<String, Object> params = new HashMap<>();
    private String tokenId;

    public TokensDeleteParams(String tokenId) {
        this.tokenId = tokenId;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getTokenId() {
        return tokenId;
    }
}

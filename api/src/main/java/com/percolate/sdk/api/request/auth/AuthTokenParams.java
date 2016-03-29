package com.percolate.sdk.api.request.auth;

import net.iharder.Base64;

/**
 * Parameters for Auth Token request.
 */
@SuppressWarnings("unused")
public class AuthTokenParams {

    private String clientId;
    private String clientSecret;

    public AuthTokenParams() {
    }

    public AuthTokenParams clientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public AuthTokenParams clientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    public String tokenAuthHeader() {
        final String clientAndSecret = clientId + ":" + clientSecret;
        final String encoded = Base64.encodeBytes(clientAndSecret.getBytes());
        return "Basic " + encoded;
    }
}

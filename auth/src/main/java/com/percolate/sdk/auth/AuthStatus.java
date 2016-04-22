package com.percolate.sdk.auth;

/**
 * Response status codes returned from OAuth2 attempts.
 */
public enum AuthStatus {
    TWO_FACTOR_AUTH_CODE_REQUIRED,
    SSO_REQUIRED,
    LOGIN_FAILED,
    READY,
    ERROR
}

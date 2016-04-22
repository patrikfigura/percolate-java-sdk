package com.percolate.sdk.auth;

import com.percolate.sdk.dto.AuthorizeData;
import org.apache.commons.lang3.StringUtils;

import java.util.LinkedHashMap;
import java.util.Map;

class AuthErrorChecker {

    /**
     * @return {@code true} if 2FA is required (aka Two Factor Auth / Time-based One-time Password (TOTP)).
     */
    public boolean twoFactorAuthRequired(final AuthorizeData authorizeData) {
        return checkForErrorCode(authorizeData, "authorize.totp_required");
    }

    /**
     * @return {@code true} if Single Sign On (SSO) is required.
     */
    public boolean ssoRequired(AuthorizeData authorizeData) {
        return checkForErrorCode(authorizeData, "authorize.is_sso_user");
    }

    /**
     * @return {@code true} login failed (bad user, password, or 2fa code).
     */
    public boolean loginFailed(AuthorizeData authorizeData) {
        return checkForErrorCode(authorizeData, "authorize.invalid_credentials");
    }

    /**
     * @return true if the given {@code errorCode} can be found in {@link AuthorizeData#errors}.
     */
    private boolean checkForErrorCode(final AuthorizeData authorizeData, final String errorCode) {
        if(authorizeData != null && authorizeData.getErrors() != null && !authorizeData.getErrors().isEmpty()) {
            for (LinkedHashMap<String, Object> error : authorizeData.getErrors()) {
                for (Map.Entry<String, Object> err : error.entrySet()) {
                    if(StringUtils.equalsIgnoreCase("code", err.getKey()) && StringUtils.equalsIgnoreCase(errorCode, err.getValue().toString())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

package com.percolate.sdk.auth;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Pojo class containing data required to perform OAuth2 requests.
 */
class AuthData {

    private final String clientId;
    private final String clientSecret;
    private String username;
    private String password;
    private String twoFactorAuthCode;
    private String ssoPayload;

    public AuthData(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTwoFactorAuthCode() {
        return twoFactorAuthCode;
    }

    public void setTwoFactorAuthCode(String twoFactorAuthCode) {
        this.twoFactorAuthCode = twoFactorAuthCode;
    }

    public String getSsoPayload() {
        return ssoPayload;
    }

    public void setSsoPayload(String ssoPayload) {
        this.ssoPayload = ssoPayload;
    }
}

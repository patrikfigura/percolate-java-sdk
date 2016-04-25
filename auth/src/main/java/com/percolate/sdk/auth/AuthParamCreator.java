package com.percolate.sdk.auth;

import com.percolate.sdk.api.request.auth.AuthTokenParams;
import com.percolate.sdk.dto.AuthTokenPostData;
import com.percolate.sdk.dto.AuthorizeData;
import com.percolate.sdk.dto.AuthorizePostData;
import com.percolate.sdk.dto.AuthorizePostDataExt;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

/**
 * Helper class that creates DTO objects that will be sent to the API.
 */
class AuthParamCreator {

    /**
     * DTO containing data that will be used to construct the various DTO
     * objects provided by this class.
     */
    private AuthData authData;

    public AuthParamCreator(AuthData authData) {
        this.authData = authData;
    }

    /**
     * @return a fully populated instance of {@link AuthorizePostData}.
     */
    @NotNull
    public AuthorizePostData authData() {
        final AuthorizePostData authRequestData = new AuthorizePostData();
        final AuthorizePostDataExt ext = new AuthorizePostDataExt();
        authRequestData.setEmail(authData.getUsername());
        authRequestData.setPassword(authData.getPassword());
        authRequestData.setType("token");
        if(StringUtils.isNotBlank(authData.getTwoFactorAuthCode())) {
            authRequestData.setTwoFactorAuthCode(authData.getTwoFactorAuthCode());
        }
        if(StringUtils.isNotBlank(authData.getSsoPayload())) {
            authRequestData.setSsoPayload(authData.getSsoPayload());
        }
        ext.setClientId(authData.getClientId());
        authRequestData.setExt(ext);
        return authRequestData;
    }

    /**
     * @param authorizeData {@link AuthorizeData} instance.
     * @return a fully populated instance of {@link AuthTokenPostData}.
     */
    @NotNull
    public AuthTokenPostData tokenData(final AuthorizeData authorizeData) {
        final AuthTokenPostData data = new AuthTokenPostData();
        data.setGrantType("authorization_code");
        data.setCode(authorizeData.getExt().getCode());
        return data;
    }

    /**
     * @return a fully populated instance of {@link AuthTokenParams}.
     */
    @NotNull
    public AuthTokenParams tokenParams() {
        return new AuthTokenParams()
                .clientId(authData.getClientId())
                .clientSecret(authData.getClientSecret());
    }
}

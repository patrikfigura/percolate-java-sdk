package com.percolate.sdk.auth;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.auth.AuthTokenParams;
import com.percolate.sdk.dto.AuthTokenData;
import com.percolate.sdk.dto.AuthTokenPostData;
import com.percolate.sdk.dto.AuthorizeData;
import com.percolate.sdk.dto.AuthorizePostData;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

/**
 * Performs network requests to OAuth2 endpoints:
 * {@code /auth/v5/authorize/} and {@code /auth/v5/token/}.
 *
 * Note: <b>Network requests are done as blocking operations.</b>
 */
class AuthNetworkRequests {

    private PercolateApi api;

    /**
     * Helper class used to construct DTOs that will be sent to the API.
     */
    private AuthParamCreator paramCreator;

    /**
     * Helper class that checks response objects for 2FA/SSO errors.
     */
    private AuthErrorChecker errorChecker;

    public AuthNetworkRequests(PercolateApi api, AuthData authData) {
        this.api = api;
        this.paramCreator = new AuthParamCreator(authData);
        this.errorChecker = new AuthErrorChecker();
    }

    /**
     * Call {@code /auth/v5/authorize/} with data stored in {@link AuthParamCreator#authData}.
     */
    public AuthResponse performOAuthRequest() {
        final AuthorizePostData authRequestData = paramCreator.authData();
        final Call<AuthorizeData> authorize = api.auth().authorize(authRequestData);
        try {
            final Response<AuthorizeData> response = authorize.execute();
            return parseAuthResponse(response);
        } catch (Exception ex) {
            return new AuthResponse(AuthStatus.ERROR, ex);
        }
    }

    /**
     * Parse response from {@code authorize} request.  Checks for 2FA / SSO errors.
     */
    private AuthResponse parseAuthResponse(Response<AuthorizeData> response) throws IOException {
        AuthorizeData authorizeData = null;
        if(response.body() != null) {
            authorizeData = response.body();
        } else if(response.errorBody() != null){
            authorizeData = JacksonUtils.jsonToObject(response.errorBody().string(), AuthorizeData.class);
        }

        if(authorizeData == null) {
            return new AuthResponse(AuthStatus.ERROR, response);
        } else if(errorChecker.loginFailed(authorizeData)) {
            return new AuthResponse(AuthStatus.LOGIN_FAILED, response);
        } else if (errorChecker.twoFactorAuthRequired(authorizeData)) {
            return new AuthResponse(AuthStatus.TWO_FACTOR_AUTH_CODE_REQUIRED, response);
        } else if (errorChecker.ssoRequired(authorizeData)) {
            return new AuthResponse(AuthStatus.SSO_REQUIRED, response);
        } else {
            return performTokenRequest(authorizeData);
        }
    }

    /**
     * Call {@code /auth/v5/token/} with data stored in {@link AuthParamCreator#authData}.
     */
    private AuthResponse performTokenRequest(final AuthorizeData authorizeData) {
        final AuthTokenPostData authTokenPostData = paramCreator.tokenData(authorizeData);
        final AuthTokenParams authTokenParams = paramCreator.tokenParams();
        final Call<AuthTokenData> tokenRequest = api.auth().token(authTokenParams, authTokenPostData);
        try {
            final Response<AuthTokenData> response = tokenRequest.execute();

            AuthTokenData authTokenData = null;
            if(response.body() != null) {
                authTokenData = response.body();
            } else if(response.errorBody() != null) {
                authTokenData = JacksonUtils.jsonToObject(response.errorBody().string(), AuthTokenData.class);
            }

            if(authTokenData == null) {
                return new AuthResponse(AuthStatus.ERROR, response);
            } else {
                final String tokenKey = authTokenData.getKey();
                api.setOAuthTokenKey(tokenKey);
                return new AuthResponse(AuthStatus.READY, response);
            }
        } catch (Exception ex) {
            return new AuthResponse(AuthStatus.ERROR, ex);
        }
    }
}

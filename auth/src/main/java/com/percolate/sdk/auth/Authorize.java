package com.percolate.sdk.auth;

import com.percolate.sdk.api.PercolateApi;

/**
 * Convenience class used to authenticate to the API using OAuth2.
 *
 * Example:
 * <code>
 *     final PercolateApi api = new PercolateApi();
 *     final Authorize authorize = new Authorize(percolateApi, CLIENT_ID, CLIENT_SECRET);
 *     final AuthResponse response = authorize.authorize(username, password);
 *     if(response.getStatus() == AuthStatus.READY) {
 *         api.posts().get(...);
 *     }
 * </code>
 */
public class Authorize {

    private PercolateApi api;

    /**
     * DTO containing data that will be sent to the auth/token OAuth endpoints.
     */
    private AuthData authData;

    /**
     * Class that performs network request.
     */
    private AuthNetworkRequests requests;

    public Authorize(PercolateApi api, String clientId, String clientSecret) {
        this.api = api;
        this.authData = new AuthData(clientId, clientSecret);
        this.requests = new AuthNetworkRequests(api, authData);
    }

    /**
     * Start OAuth2 flow.  Tries to authenticate using username(email address) and password.
     *
     * If the returned {@link AuthResponse} object has status {@link AuthStatus#READY}, the
     * provided instance of {@link PercolateApi} is ready to use.
     *
     * If the returned {@link AuthResponse} object has status {@link AuthStatus#TWO_FACTOR_AUTH_CODE_REQUIRED},
     * you should request a 2FA code from the user and call {@link #sendTwoFactorAuthCode(String)}.
     *
     * If the returned {@link AuthResponse} object has status {@link AuthStatus#SSO_REQUIRED},
     * you should open the Single Sign On request in a web browser and pass the resulting
     * json to {@link #sendSsoPayload(String)}.
     *
     * @param username OAuth2 username (email address used to sign into percolate.com)
     * @param password OAuth2 password (password used to sign into percolate.com)
     * @return instance of {@link AuthResponse}, with an appropriate {@link AuthResponse#status} set.
     */
    public AuthResponse authorize(final String username, final String password) {
        authData.setUsername(username);
        authData.setPassword(password);
        return requests.performOAuthRequest();
    }

    /**
     * This method Should be called after calling {@link #authorize(String, String)}.  It will send the
     * same username and password as {@link #authorize(String, String)}, along with the provided 2FA code.
     *
     * If the 2FA code expires before the request is send, the returned status will be {@link AuthStatus#LOGIN_FAILED}.
     *
     * @param twoFactorAuthCode 2FA code provided by the user.
     * @return instance of {@link AuthResponse}, with an appropriate {@link AuthResponse#status} set.
     */
    public AuthResponse sendTwoFactorAuthCode(final String twoFactorAuthCode) {
        authData.setTwoFactorAuthCode(twoFactorAuthCode);
        return requests.performOAuthRequest();
    }

    /**
     * This method Should be called after calling {@link #authorize(String, String)}.  It will send the
     * same username and password as {@link #authorize(String, String)}, along with the provided SSO payload.
     *
     * @param ssoPayload SSO Json payload provided by the SSO provider after a successful authentication.
     * @return instance of {@link AuthResponse}, with an appropriate {@link AuthResponse#status} set.
     */
    public AuthResponse sendSsoPayload(final String ssoPayload) {
        authData.setSsoPayload(ssoPayload);
        return requests.performOAuthRequest();
    }
}

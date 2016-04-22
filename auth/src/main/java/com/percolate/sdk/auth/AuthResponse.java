package com.percolate.sdk.auth;

import com.percolate.sdk.api.PercolateApi;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/**
 * This class is returned from {@link Authorize} method calls.
 * It provides a {@code status} that should be used to check the status of the
 * OAuth2 authorization request.
 *
 * This class also contains {@link #response} and {@link #error} data that can be
 * used for troubleshooting.
 */
public class AuthResponse {

    /**
     * Response status.
     * {@link AuthStatus#READY} signifies that the provided {@link PercolateApi} is now ready to use.
     */
    private AuthStatus status;

    /**
     * Nullable.  The network response.
     */
    private Response response;

    /**
     * Nullable.  Exception that occurred if {@link #status} is {@link AuthStatus#ERROR}.
     */
    private Throwable error;

    public AuthResponse(AuthStatus status, Response response) {
        this.status = status;
        this.response = response;
    }

    public AuthResponse(AuthStatus status, Throwable error) {
        this.status = status;
        this.error = error;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    /**
     * OAuth2 request status.
     * {@link AuthStatus#READY} signifies that the provided {@link PercolateApi} is now ready to use.
     * {@link AuthStatus#TWO_FACTOR_AUTH_CODE_REQUIRED} signifies that a 2FA code must be provided.
     * {@link AuthStatus#SSO_REQUIRED} signifies that a SSO must be performed.
     * {@link AuthStatus#LOGIN_FAILED} signifies that either the username, password, or 2FA was invalid.
     * {@link AuthStatus#ERROR} signifies an error occurred.  Check {@link #response} and {@link #error} for details.
     * Will never return {@code null}.
     * @return Response status.
     */
    @NotNull
    public AuthStatus getStatus() {
        return status;
    }

    /**
     * @return The network response.  <b>Can be null.</b>
     */
    @Nullable
    public Response getResponse() {
        return response;
    }

    /**
     * @return The {@code Exception} that occurred if {@link #status} is {@link AuthStatus#ERROR}.  <b>Can be null.</b>
     */
    @Nullable
    public Throwable getError() {
        return error;
    }
}

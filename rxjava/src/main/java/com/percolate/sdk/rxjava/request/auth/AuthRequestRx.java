package com.percolate.sdk.rxjava.request.auth;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.auth.AuthTokenParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.AuthTokenData;
import com.percolate.sdk.dto.AuthTokenPostData;
import com.percolate.sdk.dto.AuthorizeData;
import com.percolate.sdk.dto.AuthorizePostData;

import org.jetbrains.annotations.NotNull;

import rx.Observable;

/**
 * Auth/Login request proxy.
 */
@SuppressWarnings("unused")
public class AuthRequestRx {

    private AuthServiceRx service;

    public AuthRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(AuthServiceRx.class);
    }

    /**
     * Authorization request.
     *
     * @param authorizePostData Authorization data.
     * @return {@link Observable} object.
     */
    public Observable<AuthorizeData> authorize(@NotNull final AuthorizePostData authorizePostData) {
        return service.authorize("Client-ID " + authorizePostData.getExt().getClientId(), authorizePostData);
    }

    /**
     * Authorization token request
     *
     * @param params API params.
     * @param data Auth data.
     * @return {@link Observable} object.
     */
    public Observable<AuthTokenData> token(@NotNull final AuthTokenParams params, @NotNull final AuthTokenPostData data) {
        return service.token(params.tokenAuthHeader(), data);
    }

    /**
     * Authorization token request
     *
     * @param data Auth data.
     * @return {@link Observable} object.
     */
    public Observable<AuthTokenData> token(@NotNull final AuthTokenPostData data) {
        return service.token(data);
    }
}

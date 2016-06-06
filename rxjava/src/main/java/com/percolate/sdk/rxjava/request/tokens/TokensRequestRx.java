package com.percolate.sdk.rxjava.request.tokens;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.tokens.TokensDeleteParams;
import com.percolate.sdk.api.request.tokens.TokensParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Tokens;

import org.jetbrains.annotations.NotNull;

import okhttp3.ResponseBody;
import rx.Observable;

/**
 * Tokens request proxy.
 */
@SuppressWarnings("unused")
public class TokensRequestRx {

    private TokensServiceRx service;

    public TokensRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(TokensServiceRx.class);
    }

    /**
     * Query tokens endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Tokens> get(@NotNull final TokensParams params) {
        return service.get(params.getParams());
    }

    /**
     * Delete token.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<ResponseBody> delete(@NotNull final TokensDeleteParams params) {
        return service.delete(params.getTokenId(), params.getParams());
    }
}

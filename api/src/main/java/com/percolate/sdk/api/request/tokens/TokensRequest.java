package com.percolate.sdk.api.request.tokens;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Tokens;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Tokens request proxy.
 */
@SuppressWarnings("unused")
public class TokensRequest {

    private TokensService service;

    public TokensRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(TokensService.class);
    }

    /**
     * Query tokens endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Tokens> get(@NotNull final TokensParams params) {
        return service.get(params.getParams());
    }

    /**
     * Delete token.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<ResponseBody> delete(@NotNull final TokensDeleteParams params) {
        return service.delete(params.getTokenId(), params.getParams());
    }
}

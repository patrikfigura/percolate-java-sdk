package com.percolate.sdk.api.request.push;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.MobileAppPushToken;
import com.percolate.sdk.dto.MobileAppPushTokenData;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Push Token request proxy.
 */
@SuppressWarnings("unused")
public class PushTokenRequest {

    private PushTokenService service;

    public PushTokenRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(PushTokenService.class);
    }

    /**
     * Create push token.
     *
     * @param token {@link MobileAppPushTokenData} object.
     * @return {@link MobileAppPushToken} object.
     */
    public Call<MobileAppPushToken> create(@NotNull final MobileAppPushTokenData token) {
        return service.create(token);
    }

    /**
     * Delete push token.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<ResponseBody> delete(@NotNull final PushTokenDeleteParams params) {
        return service.delete(params.getPushTokenUID(), params.getParams());
    }
}

package com.percolate.sdk.api.request.push;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.MobileAppPushToken;
import com.percolate.sdk.dto.MobileAppPushTokenData;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * Percolate v5/mobile_app_push_token API definition.
 */
interface PushTokenService {

    @POST(Endpoints.API_V5_PATH + "/mobile_app_push_token/")
    Call<MobileAppPushToken> create(@Body MobileAppPushTokenData token);

    @DELETE(Endpoints.API_V5_PATH + "/mobile_app_push_token/{push_token_uid}")
    Call<ResponseBody> delete(@Path("push_token_uid") String pushTokenUID, @QueryMap Map<String, Object> params);
}

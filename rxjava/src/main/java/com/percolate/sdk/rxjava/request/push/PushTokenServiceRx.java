package com.percolate.sdk.rxjava.request.push;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.MobileAppPushToken;
import com.percolate.sdk.dto.MobileAppPushTokenData;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v5/mobile_app_push_token API definition.
 */
interface PushTokenServiceRx {

    @POST(Endpoints.API_V5_PATH + "/mobile_app_push_token/")
    Observable<MobileAppPushToken> create(@Body MobileAppPushTokenData token);

    @DELETE(Endpoints.API_V5_PATH + "/mobile_app_push_token/{push_token_uid}")
    Observable<ResponseBody> delete(@Path("push_token_uid") String pushTokenUID, @QueryMap Map<String, Object> params);
}

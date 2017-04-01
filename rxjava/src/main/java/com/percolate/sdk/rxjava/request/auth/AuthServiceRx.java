package com.percolate.sdk.rxjava.request.auth;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.AuthTokenData;
import com.percolate.sdk.dto.AuthTokenPostData;
import com.percolate.sdk.dto.AuthorizeData;
import com.percolate.sdk.dto.AuthorizePostData;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Percolate auth/v5/authorize/ API definition.
 */
interface AuthServiceRx {

    @POST(Endpoints.AUTH_V5_PATH + "/authorize/")
    Observable<AuthorizeData> authorize(@Header("Authorization") String authHeader, @Body AuthorizePostData authorizePostData);

    @POST(Endpoints.AUTH_V5_PATH + "/token/")
    Observable<AuthTokenData> token(@Header("Authorization") String authHeader, @Body AuthTokenPostData authTokenData);

    @POST(Endpoints.AUTH_V5_PATH + "/token/")
    Observable<AuthTokenData> token(@Body AuthTokenPostData authTokenData);
}

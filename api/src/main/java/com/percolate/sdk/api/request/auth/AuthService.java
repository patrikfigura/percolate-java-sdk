package com.percolate.sdk.api.request.auth;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.AuthTokenData;
import com.percolate.sdk.dto.AuthTokenPostData;
import com.percolate.sdk.dto.AuthorizeData;
import com.percolate.sdk.dto.AuthorizePostData;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Percolate auth/v5/authorize/ API definition.
 */
interface AuthService {

    @POST(Endpoints.AUTH_V5_PATH + "/authorize/")
    Call<AuthorizeData> authorize(@Header("Authorization") String authHeader, @Body AuthorizePostData authorizePostData);

    @POST(Endpoints.AUTH_V5_PATH + "/token/")
    Call<AuthTokenData> token(@Header("Authorization") String authHeader, @Body AuthTokenPostData authTokenData);

    @POST(Endpoints.AUTH_V5_PATH + "/token/")
    Call<AuthTokenData> token(@Body AuthTokenPostData authTokenData);
}

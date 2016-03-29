package com.percolate.sdk.api.request.auth;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.AuthTokenData;
import com.percolate.sdk.dto.AuthorizeData;
import com.percolate.sdk.dto.AuthorizePostData;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.POST;

import java.util.Map;

/**
 * Percolate auth/v5/authorize/ API definition.
 */
interface AuthService {

    @POST(PercolateApi.AUTH_V5_PATH + "/authorize/")
    Call<AuthorizeData> authorize(@Body AuthorizePostData authorizePostData);

    @POST(PercolateApi.AUTH_V5_PATH + "/token/")
    Call<AuthTokenData> token(@FieldMap Map<String, Object> params);

}

package com.percolate.sdk.api.request.vendor.facebook;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * Percolate v4/vendor/facebook and v5/vendor/facebook API definition.
 */
interface FacebookVendorService {

    @DELETE(PercolateApi.API_V4_PATH + "/vendor/facebook/likes")
    Call<SuccessStatus> unlike(@QueryMap Map<String, Object> params);

    @GET(PercolateApi.API_V5_PATH + "/vendor/facebook/v2.3/{conversation_id}")
    Call<FacebookConversationListData> conversation(@Path("conversation_id") String conversationId, @QueryMap Map<String, Object> params);

    @GET(PercolateApi.API_V5_PATH + "/vendor/facebook/v2.3/search")
    Call<FacebookMentions> mentions(@QueryMap Map<String, Object> params);

    @GET(PercolateApi.API_V5_PATH + "/vendor/facebook/v2.3/{message_id}")
    Call<FacebookMessageExtendedData> message(@Path("message_id") String conversationId, @QueryMap Map<String, Object> params);

    @GET(PercolateApi.API_V4_PATH + "/vendor/facebook/users/show")
    Call<FacebookUser> user(@QueryMap Map<String, Object> params);

    @POST(PercolateApi.API_V4_PATH + "/vendor/facebook/{conversation_id}/messages")
    Call<FacebookConversationMessageIdData> conversationMessage(@Path("conversation_id") String conversationId, @QueryMap Map<String, Object> params);

    @POST(PercolateApi.API_V4_PATH + "/vendor/facebook/likes")
    Call<SuccessStatus> like(@QueryMap Map<String, Object> params);
}

package com.percolate.sdk.rxjava.request.vendor.facebook;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.FacebookConversationListData;
import com.percolate.sdk.dto.FacebookConversationMessageIdData;
import com.percolate.sdk.dto.FacebookMentions;
import com.percolate.sdk.dto.FacebookMessageExtendedData;
import com.percolate.sdk.dto.FacebookUser;
import com.percolate.sdk.dto.SuccessStatus;

import java.util.Map;

import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v4/vendor/facebook and v5/vendor/facebook API definition.
 */
interface FacebookVendorService {

    @DELETE(Endpoints.API_V4_PATH + "/vendor/facebook/likes")
    Observable<SuccessStatus> unlike(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/vendor/facebook/v2.3/{conversation_id}")
    Observable<FacebookConversationListData> conversation(@Path("conversation_id") String conversationId, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/vendor/facebook/v2.3/search")
    Observable<FacebookMentions> mentions(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/vendor/facebook/v2.3/{message_id}")
    Observable<FacebookMessageExtendedData> message(@Path("message_id") String conversationId, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V4_PATH + "/vendor/facebook/users/show")
    Observable<FacebookUser> user(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V4_PATH + "/vendor/facebook/{conversation_id}/messages")
    Observable<FacebookConversationMessageIdData> conversationMessage(@Path("conversation_id") String conversationId, @QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V4_PATH + "/vendor/facebook/likes")
    Observable<SuccessStatus> like(@QueryMap Map<String, Object> params);
}

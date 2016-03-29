package com.percolate.sdk.api.request.vendor.instagram;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.InstagramMedia;
import com.percolate.sdk.dto.InstagramMediaComments;
import com.percolate.sdk.dto.InstagramRecentMedia;
import com.percolate.sdk.dto.InstagramUser;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v5/vendor/instagram API definition.
 */
interface InstagramVendorService {

    @GET(Endpoints.API_V5_PATH + "/vendor/instagram/v1/media/{media_id}")
    Call<InstagramMedia> media(@Path("media_id") String mediaId, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/vendor/instagram/v1/media/{media_id}/comments")
    Call<InstagramMediaComments> comments(@Path("media_id") String mediaId, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/vendor/instagram/v1/users/{instagram_user_id}/media/recent")
    Call<InstagramRecentMedia> recent(@Path("instagram_user_id") String instagramUserId, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/vendor/instagram/v1/users/{instagram_user_id}")
    Call<InstagramUser> user(@Path("instagram_user_id") String instagramUserId, @QueryMap Map<String, Object> params);
}

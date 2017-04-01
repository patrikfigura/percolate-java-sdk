package com.percolate.sdk.rxjava.request.vendor.instagram;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.InstagramMedia;
import com.percolate.sdk.dto.InstagramMediaComments;
import com.percolate.sdk.dto.InstagramRecentMedia;
import com.percolate.sdk.dto.InstagramUser;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/**
 * Percolate v5/vendor/instagram API definition.
 */
interface InstagramVendorServiceRx {

    @GET(Endpoints.API_V5_PATH + "/vendor/instagram/v1/media/{media_id}")
    Observable<InstagramMedia> media(@Path("media_id") String mediaId, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/vendor/instagram/v1/media/{media_id}/comments")
    Observable<InstagramMediaComments> comments(@Path("media_id") String mediaId, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/vendor/instagram/v1/users/{instagram_user_id}/media/recent")
    Observable<InstagramRecentMedia> recent(@Path("instagram_user_id") String instagramUserId, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/vendor/instagram/v1/users/{instagram_user_id}")
    Observable<InstagramUser> user(@Path("instagram_user_id") String instagramUserId, @QueryMap Map<String, Object> params);
}

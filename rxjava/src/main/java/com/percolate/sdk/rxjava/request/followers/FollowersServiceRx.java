package com.percolate.sdk.rxjava.request.followers;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Follower;
import com.percolate.sdk.dto.Followers;
import com.percolate.sdk.dto.SingleFollower;

import java.util.List;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v4/followers API definition.
 */
interface FollowersServiceRx {

    @GET(Endpoints.API_V4_PATH + "/follower/")
    Observable<Followers> get(@QueryMap Map<String, Object> params);

    @POST(Endpoints.API_V4_PATH + "/follower/")
    Observable<SingleFollower> create(@Body List<Follower> followers);

    @DELETE(Endpoints.API_V4_PATH + "/follower/{follower_id}")
    Observable<ResponseBody> delete(@Path("follower_id") String followerId);
}

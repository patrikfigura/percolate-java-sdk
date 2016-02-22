package com.percolate.sdk.api.request.media;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.Media;
import com.percolate.sdk.dto.MediaItems;
import com.percolate.sdk.dto.MediaList;
import com.percolate.sdk.dto.MediaMetaDataHolder;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v3/media API definition.
 */
interface MediaService {

    @GET(PercolateApi.API_V3_PATH + "/media/{uid}")
    Call<Media> get(@Path("uid") String uid, @QueryMap Map<String, Object> params);

    @GET(PercolateApi.API_V3_PATH + "/media")
    Call<MediaList> list(@QueryMap Map<String, Object> params);

    @GET(PercolateApi.API_V3_PATH + "/media/{library_uid}")
    Call<MediaList> list(@Path("library_uid") String libraryUid, @QueryMap Map<String, Object> params);

    @GET(PercolateApi.API_V3_PATH + "/media")
    Call<MediaItems> items(@QueryMap Map<String, Object> params);

    @GET(PercolateApi.API_V3_PATH + "/media/{uid}/metadata")
    Call<MediaMetaDataHolder> meta(@Path("uid") String uid, @QueryMap Map<String, Object> params);
}

package com.percolate.sdk.rxjava.request.media;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Media;
import com.percolate.sdk.dto.MediaItems;
import com.percolate.sdk.dto.MediaList;
import com.percolate.sdk.dto.MediaMetaDataHolder;

import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Percolate v3/media API definition.
 */
interface MediaService {

    @GET(Endpoints.API_V3_PATH + "/media/{uid}")
    Observable<Media> get(@Path("uid") String uid, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V3_PATH + "/media")
    Observable<MediaList> list(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V3_PATH + "/media/{library_uid}")
    Observable<MediaList> list(@Path("library_uid") String libraryUid, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V3_PATH + "/media")
    Observable<MediaItems> items(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V3_PATH + "/media/{uid}/metadata")
    Observable<MediaMetaDataHolder> meta(@Path("uid") String uid, @QueryMap Map<String, Object> params);

    @Multipart
    @POST(Endpoints.API_V3_PATH + "/media")
    Observable<Media> create(@PartMap Map<String, RequestBody> params);
}

package com.percolate.sdk.rxjava.request.media;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.*;
import okhttp3.RequestBody;
import retrofit2.http.*;
import rx.Observable;

import java.util.Map;

/**
 * Percolate v3/media API definition.
 */
interface MediaServiceRx {

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

    @PUT(Endpoints.API_V3_PATH + "/media/{uid}/metadata")
    Observable<MediaMetaData> updateMeta(@Path("uid") String uid, @Body MediaMetaData metaData);

    @Multipart
    @POST(Endpoints.API_V3_PATH + "/media")
    Observable<Media> create(@PartMap Map<String, RequestBody> params);
}

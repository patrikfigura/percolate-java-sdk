package com.percolate.sdk.api.request.media;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.*;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * Percolate v3/media API definition.
 */
interface MediaService {

    @GET(Endpoints.API_V3_PATH + "/media/{uid}")
    Call<Media> get(@Path("uid") String uid, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V3_PATH + "/media")
    Call<MediaList> list(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V3_PATH + "/media/{library_uid}")
    Call<MediaList> list(@Path("library_uid") String libraryUid, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V3_PATH + "/media")
    Call<MediaItems> items(@QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V3_PATH + "/media/{uid}/metadata")
    Call<MediaMetaDataHolder> meta(@Path("uid") String uid, @QueryMap Map<String, Object> params);

    @PUT(Endpoints.API_V3_PATH + "/media/{uid}/metadata")
    Call<MediaMetaData> updateMeta(@Path("uid") String uid, @Body MediaMetaData metaData);

    @Multipart
    @POST(Endpoints.API_V3_PATH + "/media")
    Call<Media> create(@PartMap Map<String, RequestBody> params);
}

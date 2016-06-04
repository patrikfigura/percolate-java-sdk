package com.percolate.sdk.rxjava.request.media.release;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.MediaReleaseResponse;

import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PartMap;
import rx.Observable;

/**
 * Percolate v4/release API definition.
 */
interface MediaReleaseService {

    @Multipart
    @POST(Endpoints.API_V4_PATH + "/release/")
    Observable<MediaReleaseResponse> create(@PartMap Map<String, RequestBody> params);
}

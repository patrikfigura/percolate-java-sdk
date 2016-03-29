package com.percolate.sdk.api.request.media.release;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.MediaReleaseResponse;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PartMap;

import java.util.Map;

/**
 * Percolate v4/release API definition.
 */
interface MediaReleaseService {

    @Multipart
    @POST(Endpoints.API_V4_PATH + "/release/")
    Call<MediaReleaseResponse> create(@PartMap Map<String, RequestBody> params);
}

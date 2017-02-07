package com.percolate.sdk.api.request.folders;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Folders;
import com.percolate.sdk.dto.SingleFolder;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Percolate v5/folder API definitions.
 */
interface FoldersService {

    @GET(Endpoints.API_V5_PATH + "/folder/{folder_id}")
    Call<SingleFolder> get(@Path("folder_id") String folderId, @QueryMap Map<String, Object> params);

    @GET(Endpoints.API_V5_PATH + "/folder")
    Call<Folders> list(@QueryMap Map<String, Object> params);
}

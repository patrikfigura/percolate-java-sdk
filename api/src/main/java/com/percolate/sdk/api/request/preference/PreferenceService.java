package com.percolate.sdk.api.request.preference;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Preference;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface PreferenceService {

    @GET(Endpoints.API_V5_PATH + "/preference/")
    Call<Preference> get(@QueryMap Map<String, Object> params);

}

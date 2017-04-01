package com.percolate.sdk.rxjava.request.preference;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Preference;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface PreferenceServiceRx {

    @GET(Endpoints.API_V5_PATH + "/preference/")
    Observable<Preference> get(@QueryMap Map<String, Object> params);

}

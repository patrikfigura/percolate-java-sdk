package com.percolate.sdk.api.request.preference;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Preference;

import org.jetbrains.annotations.NotNull;

import retrofit2.Call;

public class PreferenceRequest {

    private PreferenceService service;

    public PreferenceRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(PreferenceService.class);
    }

    /**
     * Query preference endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Preference> get(@NotNull final PreferenceParams params) {
        return service.get(params.getParams());
    }
}

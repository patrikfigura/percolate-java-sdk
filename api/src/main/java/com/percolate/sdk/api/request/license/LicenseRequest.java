package com.percolate.sdk.api.request.license;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Licenses;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * License request proxy.
 */
@SuppressWarnings("unused")
public class LicenseRequest {

    private LicenseService service;

    public LicenseRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(LicenseService.class);
    }

    /**
     * Query license endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Licenses> get(@NotNull final LicenseParams params) {
        return service.get(params.getParams());
    }
}

package com.percolate.sdk.api.request.license.users;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.LicenseUsers;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * LicenseUsers request proxy.
 */
@SuppressWarnings("unused")
public class LicenseUsersRequest {

    private LicenseUsersService service;

    public LicenseUsersRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(LicenseUsersService.class);
    }

    /**
     * Query license users endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<LicenseUsers> get(@NotNull final LicenseUsersParams params) {
        return service.get(params.getLicenseId(), params.getParams());
    }
}

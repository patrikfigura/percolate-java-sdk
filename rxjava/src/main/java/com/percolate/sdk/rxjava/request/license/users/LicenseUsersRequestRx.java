package com.percolate.sdk.rxjava.request.license.users;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.license.users.LicenseUsersParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.LicenseUsers;

import org.jetbrains.annotations.NotNull;

import io.reactivex.Observable;

/**
 * LicenseUsers request proxy.
 */
@SuppressWarnings("unused")
public class LicenseUsersRequestRx {

    private LicenseUsersServiceRx service;

    public LicenseUsersRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(LicenseUsersServiceRx.class);
    }

    /**
     * Query license users endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<LicenseUsers> get(@NotNull final LicenseUsersParams params) {
        return service.get(params.getLicenseId(), params.getParams());
    }
}

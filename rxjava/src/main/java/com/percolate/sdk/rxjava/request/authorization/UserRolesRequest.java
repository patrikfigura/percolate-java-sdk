package com.percolate.sdk.rxjava.request.authorization;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.authorization.UserRolesParams;
import com.percolate.sdk.api.request.authorization.UserRolesV5Params;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.UserRoles;
import com.percolate.sdk.dto.UserRolesV5;

import org.jetbrains.annotations.NotNull;

import rx.Observable;

/**
 * User roles request proxy.
 */
@SuppressWarnings("unused")
public class UserRolesRequest {

    private UserRolesService service;

    public UserRolesRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(UserRolesService.class);
    }

    /**
     * Query user roles endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<UserRoles> get(@NotNull final UserRolesParams params) {
        return service.get(params.getUserId(), params.getParams());
    }

    /**
     * Query user roles endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<UserRolesV5> get(@NotNull final UserRolesV5Params params) {
        return service.get(params.getParams());
    }
}

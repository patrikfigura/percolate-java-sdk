package com.percolate.sdk.rxjava.request.users;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.users.UsersParams;
import com.percolate.sdk.api.request.users.UsersUpdatePasswordParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.ChangePasswordError;
import com.percolate.sdk.dto.SingleUser;
import com.percolate.sdk.dto.Users;

import org.jetbrains.annotations.NotNull;

import rx.Observable;

/**
 * Users request proxy.
 */
@SuppressWarnings("unused")
public class UsersRequest {

    private UsersService service;

    public UsersRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(UsersService.class);
    }

    /**
     * Query "me" endpoint.
     *
     * @return {@link Observable} object.
     */
    public Observable<SingleUser> me() {
        return service.me();
    }

    /**
     * Query users endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Users> get(@NotNull final UsersParams params) {
        return service.get(params.getParams());
    }

    /**
     * Update user password.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<ChangePasswordError> changePassword(@NotNull final UsersUpdatePasswordParams params) {
        return service.changePassword(params.getUserId(), params.getParams());
    }
}

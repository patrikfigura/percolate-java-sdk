package com.percolate.sdk.api.request.users;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Users;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

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
     * Query users endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Users> get(@NotNull final UsersParams params) {
        return service.get(params.getParams());
    }
}

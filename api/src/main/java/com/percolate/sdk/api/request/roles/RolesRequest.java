package com.percolate.sdk.api.request.roles;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Roles;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Roles request proxy.
 */
@SuppressWarnings("unused")
public class RolesRequest {

    private RolesService service;

    public RolesRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(RolesService.class);
    }

    /**
     * Query roles endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Roles> get(@NotNull final RolesParams params) {
        return service.get(params.getParams());
    }
}

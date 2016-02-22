package com.percolate.sdk.api.request.links;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Link;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Link request proxy.
 */
@SuppressWarnings("unused")
public class LinksRequest {

    private LinksService service;

    public LinksRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(LinksService.class);
    }

    /**
     * Query link endpoint.
     *
     * @param id Link id.
     * @return {@link Call} object.
     */
    public Call<Link> get(@NotNull final String id) {
        return service.get(id);
    }

    /**
     * Create link.
     *
     * @param url Link url.
     * @return {@link Link} object.
     */
    public Call<Link> create(@NotNull final String url) {
        return service.create(url);
    }
}

package com.percolate.sdk.rxjava.request.links;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Link;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import rx.Observable;

/**
 * Link request proxy.
 */
@SuppressWarnings("unused")
public class LinksRequestRx {

    private LinksServiceRx service;

    public LinksRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(LinksServiceRx.class);
    }

    /**
     * Query link endpoint.
     *
     * @param id Link id.
     * @return {@link Observable} object.
     */
    public Observable<Link> get(@NotNull final String id) {
        return service.get(id);
    }

    /**
     * Create link.
     *
     * @param url Link url.
     * @return {@link Link} object.
     */
    public Observable<Link> create(@NotNull final String url) {
        final Map<String, String> body = new HashMap<>();
        body.put("url", url);
        return service.create(body);
    }
}

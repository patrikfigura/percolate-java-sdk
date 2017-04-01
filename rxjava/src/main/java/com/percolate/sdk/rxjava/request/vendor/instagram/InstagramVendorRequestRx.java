package com.percolate.sdk.rxjava.request.vendor.instagram;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.vendor.instagram.params.InstagramMediaVendorParams;
import com.percolate.sdk.api.request.vendor.instagram.params.InstagramUserVendorParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.InstagramMedia;
import com.percolate.sdk.dto.InstagramMediaComments;
import com.percolate.sdk.dto.InstagramRecentMedia;
import com.percolate.sdk.dto.InstagramUser;

import org.jetbrains.annotations.NotNull;

import io.reactivex.Observable;

/**
 * Instagram vendor request proxy.
 */
@SuppressWarnings("unused")
public class InstagramVendorRequestRx {

    private InstagramVendorServiceRx service;

    public InstagramVendorRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(InstagramVendorServiceRx.class);
    }

    /**
     * Query Instagram media endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<InstagramMedia> media(@NotNull final InstagramMediaVendorParams params) {
        return service.media(params.getMediaId(), params.getParams());
    }

    /**
     * Query Instagram comments endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<InstagramMediaComments> comments(@NotNull final InstagramMediaVendorParams params) {
        return service.comments(params.getMediaId(), params.getParams());
    }

    /**
     * Query Instagram recent media endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<InstagramRecentMedia> recent(@NotNull final InstagramUserVendorParams params) {
        return service.recent(params.getInstagramUserId(), params.getParams());
    }

    /**
     * Query Instagram user endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<InstagramUser> user(@NotNull final InstagramUserVendorParams params) {
        return service.user(params.getInstagramUserId(), params.getParams());
    }
}

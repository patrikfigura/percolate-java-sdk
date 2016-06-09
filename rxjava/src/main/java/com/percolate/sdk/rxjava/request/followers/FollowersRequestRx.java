package com.percolate.sdk.rxjava.request.followers;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.followers.FollowersParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Follower;
import com.percolate.sdk.dto.Followers;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import okhttp3.ResponseBody;
import rx.Observable;

/**
 * Followers request proxy.
 */
@SuppressWarnings("unused")
public class FollowersRequestRx {

    private FollowersServiceRx service;

    public FollowersRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(FollowersServiceRx.class);
    }

    /**
     * Query followers endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Followers> get(@NotNull final FollowersParams params) {
        return service.get(params.getParams());
    }

    /**
     * Create followers.
     *
     * @param followers list of {@link Follower} objects.
     * @return {@link Followers} object.
     */
    public Observable<Followers> create(@NotNull final List<Follower> followers) {
        return service.create(followers);
    }

    /**
     * Delete follower.
     *
     * @param followerId Follower to delete.
     * @return {@link ResponseBody} object.
     */
    public Observable<ResponseBody> delete(@NotNull final String followerId) {
        return service.delete(followerId);
    }
}

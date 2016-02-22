package com.percolate.sdk.api.request.followers;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Follower;
import com.percolate.sdk.dto.Followers;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

import java.util.List;

/**
 * Followers request proxy.
 */
@SuppressWarnings("unused")
public class FollowersRequest {

    private FollowersService service;

    public FollowersRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(FollowersService.class);
    }

    /**
     * Query followers endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Followers> get(@NotNull final FollowersParams params) {
        return service.get(params.getParams());
    }

    /**
     * Create followers.
     *
     * @param followers list of {@link Follower} objects.
     * @return {@link Followers} object.
     */
    public Call<Followers> create(@NotNull final List<Follower> followers) {
        return service.create(followers);
    }

    /**
     * Delete follower.
     *
     * @param followerId Follower to delete.
     * @return {@link ResponseBody} object.
     */
    public Call<ResponseBody> delete(@NotNull final String followerId) {
        return service.delete(followerId);
    }
}

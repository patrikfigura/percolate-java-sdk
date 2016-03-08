package com.percolate.sdk.api.request.postset;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.PostSet;
import com.percolate.sdk.dto.PostSetData;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Post Set request proxy.
 */
@SuppressWarnings("unused")
public class PostSetRequest {

    private PostSetService service;

    public PostSetRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(PostSetService.class);
    }

    /**
     * Query post set endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<PostSet> get(@NotNull final PostSetParams params) {
        return service.get(params.getParams());
    }

    /**
     * Create post set.
     *
     * @param postSetData {@link PostSetData} object.
     * @return {@link PostSetData} object.
     */
    public Call<PostSetData> create(@NotNull final PostSetData postSetData) {
        return service.create(postSetData);
    }

    /**
     * Update post set.
     *
     * @param postSetData {@link PostSetData} object.
     * @return {@link PostSetData} object.
     */
    public Call<PostSetData> update(@NotNull final PostSetData postSetData) {
        return service.update(postSetData.getId().toString(), postSetData);
    }
}

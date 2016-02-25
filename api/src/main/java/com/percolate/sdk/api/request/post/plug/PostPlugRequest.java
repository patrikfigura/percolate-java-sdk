package com.percolate.sdk.api.request.post.plug;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Plugs;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Post plug request proxy.
 */
@SuppressWarnings("unused")
public class PostPlugRequest {

    private PostPlugService service;

    public PostPlugRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(PostPlugService.class);
    }

    /**
     * Query post plug endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Plugs> get(@NotNull final PostPlugParams params) {
        return service.get(params.getParams());
    }

}

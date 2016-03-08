package com.percolate.sdk.api.request.topics;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Topics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Topics request proxy.
 */
@SuppressWarnings("unused")
public class TopicsRequest {

    private TopicsService service;

    public TopicsRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(TopicsService.class);
    }

    /**
     * Query topics endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Topics> get(@NotNull final TopicsParams params) {
        return service.get(params.getParams());
    }
}

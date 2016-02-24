package com.percolate.sdk.api.request.streams;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Streams;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Streams request proxy.
 */
@SuppressWarnings("unused")
public class StreamsRequest {

    private StreamsService service;

    public StreamsRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(StreamsService.class);
    }

    /**
     * Query streams endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Streams> get(@NotNull final StreamsParams params) {
        return service.get(params.getParams());
    }
}

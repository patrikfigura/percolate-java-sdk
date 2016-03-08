package com.percolate.sdk.api.request.channel;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Channels;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Channel request proxy.
 */
@SuppressWarnings("unused")
public class ChannelRequest {

    private ChannelService service;

    public ChannelRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(ChannelService.class);
    }

    /**
     * Query channel endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Channels> get(@NotNull final ChannelParams params) {
        return service.get(params.getParams());
    }
}

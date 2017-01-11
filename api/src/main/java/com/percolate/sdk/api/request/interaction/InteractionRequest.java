package com.percolate.sdk.api.request.interaction;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.InteractionData;
import com.percolate.sdk.dto.Interactions;
import com.percolate.sdk.dto.SingleInteraction;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Interactions request proxy.
 */
@SuppressWarnings("unused")
public class InteractionRequest {

    private InteractionService service;

    public InteractionRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(InteractionService.class);
    }

    /**
     * Query interaction endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<SingleInteraction> get(@NotNull final InteractionParams params) {
        return service.get(params.getParams());
    }

    /**
     * Create interaction.
     *
     * @param interaction {@link InteractionData} object.
     * @return {@link InteractionData} object.
     */
    public Call<InteractionData> create(@NotNull final InteractionData interaction) {
        return service.create(interaction);
    }
}

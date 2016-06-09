package com.percolate.sdk.rxjava.request.interaction;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.interaction.InteractionParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.InteractionData;
import com.percolate.sdk.dto.Interactions;

import org.jetbrains.annotations.NotNull;

import rx.Observable;

/**
 * Interactions request proxy.
 */
@SuppressWarnings("unused")
public class InteractionRequestRx {

    private InteractionServiceRx service;

    public InteractionRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(InteractionServiceRx.class);
    }

    /**
     * Query interaction endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Interactions> get(@NotNull final InteractionParams params) {
        return service.get(params.getParams());
    }

    /**
     * Create interaction.
     *
     * @param interaction {@link InteractionData} object.
     * @return {@link InteractionData} object.
     */
    public Observable<InteractionData> create(@NotNull final InteractionData interaction) {
        return service.create(interaction);
    }
}

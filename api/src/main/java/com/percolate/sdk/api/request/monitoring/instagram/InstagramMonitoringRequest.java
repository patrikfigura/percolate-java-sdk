package com.percolate.sdk.api.request.monitoring.instagram;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.InstagramMonitoringObjects;
import com.percolate.sdk.dto.InstagramSingleMonitoringObject;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Instagram monitoring request proxy.
 */
@SuppressWarnings("unused")
public class InstagramMonitoringRequest {

    private InstagramMonitoringService service;

    public InstagramMonitoringRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(InstagramMonitoringService.class);
    }

    /**
     * Query instagram monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<InstagramMonitoringObjects> interactions(@NotNull final InstagramMonitoringInteractionsParams params) {
        return service.interactions(params.getParams());
    }

    /**
     * Query instagram monitoring endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<InstagramSingleMonitoringObject> interaction(@NotNull final InstagramMonitoringInteractionParams params) {
        return service.interaction(params.getCommentId(), params.getParams());
    }
}

package com.percolate.sdk.api.request.schema;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.*;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Schemas request proxy.
 */
@SuppressWarnings("unused")
public class SchemasRequest {

    private SchemasService service;

    public SchemasRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(SchemasService.class);
    }

    /**
     * Query schemas endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Schemas> list(@NotNull final SchemasListParams params) {
        return service.list(params.getParams());
    }

    /**
     * Query schemas endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<SingleSchema> get(@NotNull final SchemasGetParams params) {
        return service.get(params.getSchemaId(), params.getParams());
    }
}

package com.percolate.sdk.api.request.monitoring.flagging;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Flag;
import com.percolate.sdk.dto.Flags;
import com.percolate.sdk.dto.SingleFlag;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Flags request proxy.
 */
@SuppressWarnings("unused")
public class FlaggingRequest {

    private FlaggingService service;

    public FlaggingRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(FlaggingService.class);
    }

    /**
     * Query flags endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Flags> list(@NotNull final FlaggingListParams params) {
        return service.list(params.getParams());
    }

    /**
     * Query flags endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<SingleFlag> get(@NotNull final FlaggingGetParams params) {
        return service.get(params.getFlagId(), params.getParams());
    }

    /**
     * Create flag.
     *
     * @param flag {@link Flag} object.
     * @return {@link SingleFlag} object.
     */
    public Call<SingleFlag> create(@NotNull final Flag flag) {
        return service.create(flag);
    }

    /**
     * Update flag
     *
     * @param flag {@link Flag} object.
     * @return {@link SingleFlag} object.
     */
    public Call<SingleFlag> update(@NotNull final Flag flag) {
        return service.update(flag.getId().toString(), flag);
    }

    /**
     * Delete flag.
     *
     * @param params API params.
     * @return {@link RequestBody} object.
     */
    public Call<ResponseBody> delete(@NotNull final FlaggingDeleteParams params) {
        return service.delete(params.getFlagId(), params.getParams());
    }
}

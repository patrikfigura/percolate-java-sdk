package com.percolate.sdk.rxjava.request.monitoring.flagging;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.monitoring.flagging.FlaggingDeleteParams;
import com.percolate.sdk.api.request.monitoring.flagging.FlaggingGetParams;
import com.percolate.sdk.api.request.monitoring.flagging.FlaggingListParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Flag;
import com.percolate.sdk.dto.Flags;
import com.percolate.sdk.dto.SingleFlag;

import org.jetbrains.annotations.NotNull;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import rx.Observable;

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
     * @return {@link Observable} object.
     */
    public Observable<Flags> list(@NotNull final FlaggingListParams params) {
        return service.list(params.getParams());
    }

    /**
     * Query flags endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<SingleFlag> get(@NotNull final FlaggingGetParams params) {
        return service.get(params.getFlagId(), params.getParams());
    }

    /**
     * Create flag.
     *
     * @param flag {@link Flag} object.
     * @return {@link SingleFlag} object.
     */
    public Observable<SingleFlag> create(@NotNull final Flag flag) {
        return service.create(flag);
    }

    /**
     * Update flag
     *
     * @param flag {@link Flag} object.
     * @return {@link SingleFlag} object.
     */
    public Observable<SingleFlag> update(@NotNull final Flag flag) {
        return service.update(flag.getId().toString(), flag);
    }

    /**
     * Delete flag.
     *
     * @param params API params.
     * @return {@link RequestBody} object.
     */
    public Observable<ResponseBody> delete(@NotNull final FlaggingDeleteParams params) {
        return service.delete(params.getFlagId(), params.getParams());
    }
}

package com.percolate.sdk.rxjava.request.variants;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.variants.VariantsGetParams;
import com.percolate.sdk.api.request.variants.VariantsListParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.SingleVariant;
import com.percolate.sdk.dto.Variants;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

/**
 * Asset variant request proxy.
 */
@SuppressWarnings("unused")
public class VariantsRequestRx {

    private VariantsServiceRx service;

    public VariantsRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(VariantsServiceRx.class);
    }

    /**
     * Query assets variant endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<SingleVariant> get(@NotNull final VariantsGetParams params) {
        return service.get(params.getVariantId(), params.getParams());
    }

    /**
     * Query assets variant endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Variants> list(@NotNull final VariantsListParams params) {
        return service.list(params.getParams());
    }

    /**
     * Query assets variant endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<ResponseBody> download(@NotNull final VariantsGetParams params) {
        return service.download(params.getVariantId(), params.getParams());
    }
}

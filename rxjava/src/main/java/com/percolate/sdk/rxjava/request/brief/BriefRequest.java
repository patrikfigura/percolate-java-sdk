package com.percolate.sdk.rxjava.request.brief;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.brief.BriefListParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Brief;
import com.percolate.sdk.dto.BriefData;
import com.percolate.sdk.dto.Briefs;

import org.jetbrains.annotations.NotNull;

import rx.Observable;

/**
 * Brief request proxy.
 */
@SuppressWarnings("unused")
public class BriefRequest {

    private BriefService service;

    public BriefRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(BriefService.class);
    }

    /**
     * Query brief endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Briefs> list(@NotNull final BriefListParams params) {
        return service.list(params.getParams());
    }

    /**
     * Query brief endpoint.
     *
     * @param id brief id.
     * @return {@link Observable} object.
     */
    public Observable<BriefData> get(@NotNull final String id) {
        return service.get(id);
    }

    /**
     * Create brief.
     *
     * @param brief {@link Brief} object.
     * @return {@link Observable} object.
     */
    public Observable<BriefData> create(@NotNull final Brief brief) {
        return service.create(brief);
    }
}

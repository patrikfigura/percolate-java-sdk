package com.percolate.sdk.api.request.folders;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Folders;
import com.percolate.sdk.dto.SingleFolder;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Folders request proxy.
 */
@SuppressWarnings("unused")
public class FoldersRequest {

    private FoldersService service;

    public FoldersRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(FoldersService.class);
    }

    /**
     * Query folder endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<SingleFolder> get(@NotNull final FoldersGetParams params) {
        return service.get(params.getFolderId(), params.getParams());
    }

    /**
     * Query folder endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Folders> list(@NotNull final FoldersListParams params) {
        return service.list(params.getParams());
    }
}

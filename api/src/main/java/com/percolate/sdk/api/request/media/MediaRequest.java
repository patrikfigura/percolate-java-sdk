package com.percolate.sdk.api.request.media;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.*;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Media request proxy.
 */
@SuppressWarnings("unused")
public class MediaRequest {

    private MediaService service;

    public MediaRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(MediaService.class);
    }

    /**
     * Query media endpoint for a single piece of media.
     *
     * @param uid Media item UID.
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<Media> get(@NotNull final String uid, @NotNull final MediaGetParams params) {
        return service.get(uid, params.getParams());
    }

    /**
     * Query media endpoint for a list of media items.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<MediaList> list(@NotNull final MediaListParams params) {
        return service.list(params.getParams());
    }

    /**
     * Query media endpoint for a list of media items within a folder/library.
     *
     * @param libraryUid Folder/library UID.
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<MediaList> list(@NotNull final String libraryUid, @NotNull final MediaListParams params) {
        return service.list(libraryUid, params.getParams());
    }

    /**
     * Query media endpoint for a list of media items by UID.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<MediaItems> items(@NotNull final MediaItemParams params) {
        return service.items(params.getParams());
    }

    /**
     * Query media endpoint for item meta data.
     *
     * @param uid Media item UID.
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<MediaMetaDataHolder> meta(@NotNull String uid, @NotNull final MediaGetParams params) {
        return service.meta(uid, params.getParams());
    }
}

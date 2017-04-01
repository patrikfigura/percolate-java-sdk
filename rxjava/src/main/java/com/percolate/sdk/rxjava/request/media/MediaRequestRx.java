package com.percolate.sdk.rxjava.request.media;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.media.MediaGetParams;
import com.percolate.sdk.api.request.media.MediaItemParams;
import com.percolate.sdk.api.request.media.MediaListParams;
import com.percolate.sdk.api.request.media.MediaUploadParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Media;
import com.percolate.sdk.dto.MediaItems;
import com.percolate.sdk.dto.MediaList;
import com.percolate.sdk.dto.MediaMetaData;
import com.percolate.sdk.dto.MediaMetaDataHolder;

import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import io.reactivex.Observable;
import retrofit2.Call;

/**
 * Media request proxy.
 */
@SuppressWarnings("unused")
public class MediaRequestRx {

    private MediaServiceRx service;

    public MediaRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(MediaServiceRx.class);
    }

    /**
     * Query media endpoint for a single piece of media.
     *
     * @param uid Media item UID.
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Media> get(@NotNull final String uid, @NotNull final MediaGetParams params) {
        return service.get(uid, params.getParams());
    }

    /**
     * Query media endpoint for a list of media items.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<MediaList> list(@NotNull final MediaListParams params) {
        return service.list(params.getParams());
    }

    /**
     * Query media endpoint for a list of media items within a folder/library.
     *
     * @param libraryUid Folder/library UID.  If null/blank, will execute {@link #list(MediaListParams)}.
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<MediaList> list(@Nullable final String libraryUid, @NotNull final MediaListParams params) {
        if(StringUtils.isNotBlank(libraryUid)) {
            return service.list(libraryUid, params.getParams());
        } else {
            return list(params);
        }
    }

    /**
     * Query media endpoint for a list of media items by UID.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<MediaItems> items(@NotNull final MediaItemParams params) {
        return service.items(params.getParams());
    }

    /**
     * Query media endpoint for item meta data.
     *
     * @param uid Media item UID.
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<MediaMetaDataHolder> meta(@NotNull String uid, @NotNull final MediaGetParams params) {
        return service.meta(uid, params.getParams());
    }

    /**
     * Update media metadata.
     *
     * @param uid Media item UID.
     * @param metaData {@link MediaMetaData}.
     * @return {@link Call} object.
     */
    public Observable<MediaMetaData> updateMeta(@NotNull String uid, @NotNull final MediaMetaData metaData) {
        return service.updateMeta(uid, metaData);
    }

    /**
     * Create media item.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Observable<Media> create(@NotNull final MediaUploadParams params) {
        return service.create(params.getParams());
    }
}

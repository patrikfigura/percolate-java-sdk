package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.MediaMetaDataHolder}.  Implements {@link Parcelable}
 */
public class MediaMetaDataHolder extends com.percolate.sdk.dto.MediaMetaDataHolder implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public MediaMetaDataHolder() {
    }

    protected MediaMetaDataHolder(Parcel in) {
        this.data = (com.percolate.sdk.dto.MediaMetaData) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<MediaMetaDataHolder> CREATOR = new Creator<MediaMetaDataHolder>() {
        public MediaMetaDataHolder createFromParcel(Parcel source) {
            return new MediaMetaDataHolder(source);
        }

        public MediaMetaDataHolder[] newArray(int size) {
            return new MediaMetaDataHolder[size];
        }
    };
}

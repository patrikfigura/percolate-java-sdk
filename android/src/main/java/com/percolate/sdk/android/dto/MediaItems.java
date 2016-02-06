package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.MediaItems}.  Implements {@link Parcelable}
 */
public class MediaItems extends com.percolate.sdk.dto.MediaItems implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this);
    }

    public MediaItems() {
    }

    protected MediaItems(Parcel in) {
        in.readList(this, List.class.getClassLoader());
    }

    public static final Creator<MediaItems> CREATOR = new Creator<MediaItems>() {
        public MediaItems createFromParcel(Parcel source) {
            return new MediaItems(source);
        }

        public MediaItems[] newArray(int size) {
            return new MediaItems[size];
        }
    };
}

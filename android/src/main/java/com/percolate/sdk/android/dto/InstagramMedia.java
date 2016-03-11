package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.InstagramMediaData;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.InstagramMedia}.  Implements {@link Parcelable}
 */
public class InstagramMedia extends com.percolate.sdk.dto.InstagramMedia implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.meta);
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public InstagramMedia() {
    }

    protected InstagramMedia(Parcel in) {
        this.meta = (com.percolate.sdk.dto.InstagramRequestMetaData) in.readSerializable();
        this.data = (InstagramMediaData) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<InstagramMedia> CREATOR = new Creator<InstagramMedia>() {
        public InstagramMedia createFromParcel(Parcel source) {
            return new InstagramMedia(source);
        }

        public InstagramMedia[] newArray(int size) {
            return new InstagramMedia[size];
        }
    };
}

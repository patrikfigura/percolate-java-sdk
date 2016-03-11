package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.InstagramMediaData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.InstagramRecentMedia}.  Implements {@link Parcelable}
 */
public class InstagramRecentMedia extends com.percolate.sdk.dto.InstagramRecentMedia implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.meta);
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    public InstagramRecentMedia() {
    }

    protected InstagramRecentMedia(Parcel in) {
        this.meta = (com.percolate.sdk.dto.InstagramRequestMetaData) in.readSerializable();
        this.data = new ArrayList<InstagramMediaData>();
        in.readList(this.data, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<InstagramRecentMedia> CREATOR = new Creator<InstagramRecentMedia>() {
        public InstagramRecentMedia createFromParcel(Parcel source) {
            return new InstagramRecentMedia(source);
        }

        public InstagramRecentMedia[] newArray(int size) {
            return new InstagramRecentMedia[size];
        }
    };
}

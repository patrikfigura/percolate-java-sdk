package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.InstagramMediaUrl}.  Implements {@link Parcelable}
 */
public class InstagramMediaUrl extends com.percolate.sdk.dto.InstagramMediaUrl implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.url);
        dest.writeInt(this.width);
        dest.writeInt(this.height);
        dest.writeMap(this.extraFields);
    }

    public InstagramMediaUrl() {
    }

    protected InstagramMediaUrl(Parcel in) {
        this.url = in.readString();
        this.width = in.readInt();
        this.height = in.readInt();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<InstagramMediaUrl> CREATOR = new Creator<InstagramMediaUrl>() {
        public InstagramMediaUrl createFromParcel(Parcel source) {
            return new InstagramMediaUrl(source);
        }

        public InstagramMediaUrl[] newArray(int size) {
            return new InstagramMediaUrl[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.InstagramMediaUrl;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.InstagramMediaUrls}.  Implements {@link Parcelable}
 */
public class InstagramMediaUrls extends com.percolate.sdk.dto.InstagramMediaUrls implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.standardResolution);
        dest.writeSerializable(this.lowResolution);
        dest.writeSerializable(this.lowBandwidth);
        dest.writeMap(this.extraFields);
    }

    public InstagramMediaUrls() {
    }

    protected InstagramMediaUrls(Parcel in) {
        this.standardResolution = (com.percolate.sdk.dto.InstagramMediaUrl) in.readSerializable();
        this.lowResolution = (InstagramMediaUrl) in.readSerializable();
        this.lowBandwidth = (InstagramMediaUrl) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<InstagramMediaUrls> CREATOR = new Creator<InstagramMediaUrls>() {
        public InstagramMediaUrls createFromParcel(Parcel source) {
            return new InstagramMediaUrls(source);
        }

        public InstagramMediaUrls[] newArray(int size) {
            return new InstagramMediaUrls[size];
        }
    };
}

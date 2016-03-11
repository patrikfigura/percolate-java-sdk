package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.InstagramUserCounts}.  Implements {@link Parcelable}
 */
public class InstagramUserCounts extends com.percolate.sdk.dto.InstagramUserCounts implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.followedBy);
        dest.writeValue(this.follows);
        dest.writeValue(this.media);
        dest.writeMap(this.extraFields);
    }

    public InstagramUserCounts() {
    }

    protected InstagramUserCounts(Parcel in) {
        this.followedBy = (Long) in.readValue(Long.class.getClassLoader());
        this.follows = (Long) in.readValue(Long.class.getClassLoader());
        this.media = (Long) in.readValue(Long.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<InstagramUserCounts> CREATOR = new Creator<InstagramUserCounts>() {
        public InstagramUserCounts createFromParcel(Parcel source) {
            return new InstagramUserCounts(source);
        }

        public InstagramUserCounts[] newArray(int size) {
            return new InstagramUserCounts[size];
        }
    };
}

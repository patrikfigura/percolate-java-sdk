package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.InstagramLikes}.  Implements {@link Parcelable}
 */
public class InstagramLikes extends com.percolate.sdk.dto.InstagramLikes implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.data);
        dest.writeValue(this.count);
        dest.writeMap(this.extraFields);
    }

    public InstagramLikes() {
    }

    protected InstagramLikes(Parcel in) {
        this.data = new ArrayList<com.percolate.sdk.dto.InstagramUser>();
        in.readList(this.data, List.class.getClassLoader());
        this.count = (Long) in.readValue(Long.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<InstagramLikes> CREATOR = new Creator<InstagramLikes>() {
        public InstagramLikes createFromParcel(Parcel source) {
            return new InstagramLikes(source);
        }

        public InstagramLikes[] newArray(int size) {
            return new InstagramLikes[size];
        }
    };
}

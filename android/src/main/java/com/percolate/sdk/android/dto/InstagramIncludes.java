package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.InstagramIncludes}.  Implements {@link Parcelable}
 */
public class InstagramIncludes extends com.percolate.sdk.dto.InstagramIncludes implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.posts);
        dest.writeMap(this.extraFields);
    }

    public InstagramIncludes() {
    }

    protected InstagramIncludes(Parcel in) {
        this.posts = new ArrayList<com.percolate.sdk.dto.InstagramIncludeMediaData>();
        in.readList(this.posts, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<InstagramIncludes> CREATOR = new Creator<InstagramIncludes>() {
        public InstagramIncludes createFromParcel(Parcel source) {
            return new InstagramIncludes(source);
        }

        public InstagramIncludes[] newArray(int size) {
            return new InstagramIncludes[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.InstagramComments}.  Implements {@link Parcelable}
 */
public class InstagramComments extends com.percolate.sdk.dto.InstagramComments implements Parcelable {
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

    public InstagramComments() {
    }

    protected InstagramComments(Parcel in) {
        this.data = new ArrayList<com.percolate.sdk.dto.InstagramComment>();
        in.readList(this.data, List.class.getClassLoader());
        this.count = (Long) in.readValue(Long.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<InstagramComments> CREATOR = new Creator<InstagramComments>() {
        public InstagramComments createFromParcel(Parcel source) {
            return new InstagramComments(source);
        }

        public InstagramComments[] newArray(int size) {
            return new InstagramComments[size];
        }
    };
}

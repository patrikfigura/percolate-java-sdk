package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Followers}.  Implements {@link Parcelable}
 */
public class Followers extends com.percolate.sdk.dto.Followers implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.followers);
    }

    public Followers() {
    }

    protected Followers(Parcel in) {
        this.followers = new ArrayList<com.percolate.sdk.dto.Follower>();
        in.readList(this.followers, List.class.getClassLoader());
    }

    public static final Creator<Followers> CREATOR = new Creator<Followers>() {
        public Followers createFromParcel(Parcel source) {
            return new Followers(source);
        }

        public Followers[] newArray(int size) {
            return new Followers[size];
        }
    };
}

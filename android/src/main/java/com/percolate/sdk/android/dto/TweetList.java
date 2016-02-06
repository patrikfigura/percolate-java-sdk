package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.TweetList}.  Implements {@link Parcelable}
 */
public class TweetList extends com.percolate.sdk.dto.TweetList implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this);
    }

    public TweetList() {
    }

    protected TweetList(Parcel in) {
        in.readList(this, List.class.getClassLoader());
    }

    public static final Creator<TweetList> CREATOR = new Creator<TweetList>() {
        public TweetList createFromParcel(Parcel source) {
            return new TweetList(source);
        }

        public TweetList[] newArray(int size) {
            return new TweetList[size];
        }
    };
}

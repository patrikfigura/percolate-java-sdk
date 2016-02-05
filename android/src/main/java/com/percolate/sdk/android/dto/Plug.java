package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.Plug}.  Implements {@link Parcelable}
 */
public class Plug extends com.percolate.sdk.dto.Plug implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeValue(this.postId);
        dest.writeValue(this.budget);
        dest.writeString(this.createdAt);
        dest.writeString(this.startAt);
        dest.writeString(this.endAt);
    }

    public Plug() {
    }

    protected Plug(Parcel in) {
        this.id = (Integer) in.readValue(Integer.class.getClassLoader());
        this.postId = (Integer) in.readValue(Integer.class.getClassLoader());
        this.budget = (Double) in.readValue(Double.class.getClassLoader());
        this.createdAt = in.readString();
        this.startAt = in.readString();
        this.endAt = in.readString();
    }

    public static final Creator<Plug> CREATOR = new Creator<Plug>() {
        public Plug createFromParcel(Parcel source) {
            return new Plug(source);
        }

        public Plug[] newArray(int size) {
            return new Plug[size];
        }
    };
}

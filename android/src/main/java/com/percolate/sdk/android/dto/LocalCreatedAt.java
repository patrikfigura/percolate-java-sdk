package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.LocalCreatedAt}.  Implements {@link Parcelable}
 */
public class LocalCreatedAt extends com.percolate.sdk.dto.LocalCreatedAt implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.datetime);
        dest.writeString(this.timezone);
    }

    public LocalCreatedAt() {
    }

    protected LocalCreatedAt(Parcel in) {
        this.datetime = in.readString();
        this.timezone = in.readString();
    }

    public static final Creator<LocalCreatedAt> CREATOR = new Creator<LocalCreatedAt>() {
        public LocalCreatedAt createFromParcel(Parcel source) {
            return new LocalCreatedAt(source);
        }

        public LocalCreatedAt[] newArray(int size) {
            return new LocalCreatedAt[size];
        }
    };
}

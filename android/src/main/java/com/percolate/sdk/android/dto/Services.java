package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.LinkedHashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.Services}.  Implements {@link Parcelable}
 */
public class Services extends com.percolate.sdk.dto.Services implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeMap(this.analytics);
        dest.writeString(this.type);
    }

    public Services() {
    }

    protected Services(Parcel in) {
        in.readMap(this.analytics, LinkedHashMap.class.getClassLoader());
        this.type = in.readString();
    }

    public static final Creator<Services> CREATOR = new Creator<Services>() {
        public Services createFromParcel(Parcel source) {
            return new Services(source);
        }

        public Services[] newArray(int size) {
            return new Services[size];
        }
    };
}

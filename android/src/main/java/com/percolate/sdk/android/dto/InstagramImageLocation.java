package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.InstagramImageLocation}.  Implements {@link Parcelable}
 */
public class InstagramImageLocation extends com.percolate.sdk.dto.InstagramImageLocation implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeValue(this.latitude);
        dest.writeValue(this.longitude);
    }

    public InstagramImageLocation() {
    }

    protected InstagramImageLocation(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        this.latitude = (Double) in.readValue(Double.class.getClassLoader());
        this.longitude = (Double) in.readValue(Double.class.getClassLoader());
    }

    public static final Creator<InstagramImageLocation> CREATOR = new Creator<InstagramImageLocation>() {
        public InstagramImageLocation createFromParcel(Parcel source) {
            return new InstagramImageLocation(source);
        }

        public InstagramImageLocation[] newArray(int size) {
            return new InstagramImageLocation[size];
        }
    };
}

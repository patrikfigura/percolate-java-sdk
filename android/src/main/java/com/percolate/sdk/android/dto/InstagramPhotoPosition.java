package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.InstagramPhotoPosition}.  Implements {@link Parcelable}
 */
public class InstagramPhotoPosition extends com.percolate.sdk.dto.InstagramPhotoPosition implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.x);
        dest.writeValue(this.y);
    }

    public InstagramPhotoPosition() {
    }

    protected InstagramPhotoPosition(Parcel in) {
        this.x = (Double) in.readValue(Double.class.getClassLoader());
        this.y = (Double) in.readValue(Double.class.getClassLoader());
    }

    public static final Creator<InstagramPhotoPosition> CREATOR = new Creator<InstagramPhotoPosition>() {
        public InstagramPhotoPosition createFromParcel(Parcel source) {
            return new InstagramPhotoPosition(source);
        }

        public InstagramPhotoPosition[] newArray(int size) {
            return new InstagramPhotoPosition[size];
        }
    };
}

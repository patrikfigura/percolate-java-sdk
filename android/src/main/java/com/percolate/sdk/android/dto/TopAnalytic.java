package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.TopAnalytic}.  Implements {@link Parcelable}
 */
public class TopAnalytic extends com.percolate.sdk.dto.TopAnalytic implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.serviceType);
        dest.writeString(this.analyticLabel);
        dest.writeValue(this.score);
    }

    public TopAnalytic() {
    }

    protected TopAnalytic(Parcel in) {
        this.serviceType = in.readString();
        this.analyticLabel = in.readString();
        this.score = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Creator<TopAnalytic> CREATOR = new Creator<TopAnalytic>() {
        public TopAnalytic createFromParcel(Parcel source) {
            return new TopAnalytic(source);
        }

        public TopAnalytic[] newArray(int size) {
            return new TopAnalytic[size];
        }
    };
}

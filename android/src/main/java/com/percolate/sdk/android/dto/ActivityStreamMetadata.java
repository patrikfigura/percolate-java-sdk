package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.ActivityStreamMetadata}.  Implements {@link Parcelable}
 */
public class ActivityStreamMetadata extends com.percolate.sdk.dto.ActivityStreamMetadata implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.key);
    }

    public ActivityStreamMetadata() {
    }

    protected ActivityStreamMetadata(Parcel in) {
        this.key = in.readString();
    }

    public static final Creator<ActivityStreamMetadata> CREATOR = new Creator<ActivityStreamMetadata>() {
        public ActivityStreamMetadata createFromParcel(Parcel source) {
            return new ActivityStreamMetadata(source);
        }

        public ActivityStreamMetadata[] newArray(int size) {
            return new ActivityStreamMetadata[size];
        }
    };
}

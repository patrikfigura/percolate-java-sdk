package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.InstagramRequestMetaData}.  Implements {@link Parcelable}
 */
public class InstagramRequestMetaData extends com.percolate.sdk.dto.InstagramRequestMetaData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.code);
    }

    public InstagramRequestMetaData() {
    }

    protected InstagramRequestMetaData(Parcel in) {
        this.code = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Creator<InstagramRequestMetaData> CREATOR = new Creator<InstagramRequestMetaData>() {
        public InstagramRequestMetaData createFromParcel(Parcel source) {
            return new InstagramRequestMetaData(source);
        }

        public InstagramRequestMetaData[] newArray(int size) {
            return new InstagramRequestMetaData[size];
        }
    };
}

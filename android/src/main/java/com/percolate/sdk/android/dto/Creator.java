package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.Creator}.  Implements {@link Parcelable}
 */
public class Creator extends com.percolate.sdk.dto.Creator implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.licenseId);
        dest.writeValue(this.userId);
        dest.writeValue(this.brandId);
        dest.writeMap(this.extraFields);
    }

    public Creator() {
    }

    protected Creator(Parcel in) {
        this.licenseId = (Long) in.readValue(Long.class.getClassLoader());
        this.userId = (Long) in.readValue(Long.class.getClassLoader());
        this.brandId = (Long) in.readValue(Long.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final android.os.Parcelable.Creator<com.percolate.sdk.android.dto.Creator> CREATOR = new android.os.Parcelable.Creator<com.percolate.sdk.android.dto.Creator>() {
        public com.percolate.sdk.android.dto.Creator createFromParcel(Parcel source) {
            return new com.percolate.sdk.android.dto.Creator(source);
        }

        public com.percolate.sdk.android.dto.Creator[] newArray(int size) {
            return new com.percolate.sdk.android.dto.Creator[size];
        }
    };
}

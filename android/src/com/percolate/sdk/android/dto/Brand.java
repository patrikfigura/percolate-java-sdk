package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.Brand}.  Implements {@link Parcelable}
 */
public class Brand extends com.percolate.sdk.dto.Brand implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.name);
    }

    public Brand() {
    }

    protected Brand(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
    }

    public static final Creator<Brand> CREATOR = new Creator<Brand>() {
        public Brand createFromParcel(Parcel source) {
            return new Brand(source);
        }

        public Brand[] newArray(int size) {
            return new Brand[size];
        }
    };
}

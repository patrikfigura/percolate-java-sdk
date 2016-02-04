package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.SuccessProperty}.  Implements {@link Parcelable}
 */
public class SuccessProperty extends com.percolate.sdk.dto.SuccessProperty implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.success);
    }

    public SuccessProperty() {
    }

    protected SuccessProperty(Parcel in) {
        this.success = in.readString();
    }

    public static final Creator<SuccessProperty> CREATOR = new Creator<SuccessProperty>() {
        public SuccessProperty createFromParcel(Parcel source) {
            return new SuccessProperty(source);
        }

        public SuccessProperty[] newArray(int size) {
            return new SuccessProperty[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.EnabledProperty}.  Implements {@link Parcelable}
 */
public class EnabledProperty extends com.percolate.sdk.dto.EnabledProperty implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.enabled);
    }

    public EnabledProperty() {
    }

    protected EnabledProperty(Parcel in) {
        this.enabled = (Boolean) in.readValue(Boolean.class.getClassLoader());
    }

    public static final Creator<EnabledProperty> CREATOR = new Creator<EnabledProperty>() {
        public EnabledProperty createFromParcel(Parcel source) {
            return new EnabledProperty(source);
        }

        public EnabledProperty[] newArray(int size) {
            return new EnabledProperty[size];
        }
    };
}

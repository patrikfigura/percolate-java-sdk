package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.SingleLicenseChannel}.  Implements {@link Parcelable}
 */
public class SingleLicenseChannel extends com.percolate.sdk.dto.SingleLicenseChannel implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public SingleLicenseChannel() {
    }

    protected SingleLicenseChannel(Parcel in) {
        this.data = (com.percolate.sdk.dto.LicenseChannel) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<SingleLicenseChannel> CREATOR = new Creator<SingleLicenseChannel>() {
        public SingleLicenseChannel createFromParcel(Parcel source) {
            return new SingleLicenseChannel(source);
        }

        public SingleLicenseChannel[] newArray(int size) {
            return new SingleLicenseChannel[size];
        }
    };
}

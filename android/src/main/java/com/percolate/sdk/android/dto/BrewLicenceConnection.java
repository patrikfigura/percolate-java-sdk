package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.BrewLicenceConnection}.  Implements {@link Parcelable}
 */
public class BrewLicenceConnection extends com.percolate.sdk.dto.BrewLicenceConnection implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeValue(this.totalChannels);
        dest.writeString(this.name);
        dest.writeByte(primary ? (byte) 1 : (byte) 0);
        dest.writeByte(approved ? (byte) 1 : (byte) 0);
        dest.writeValue(this.priority);
        dest.writeValue(this.licenseId);
        dest.writeString(this.type);
        dest.writeValue(this.order);
        dest.writeMap(this.extraFields);
    }

    public BrewLicenceConnection() {
    }

    protected BrewLicenceConnection(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.totalChannels = (Integer) in.readValue(Integer.class.getClassLoader());
        this.name = in.readString();
        this.primary = in.readByte() != 0;
        this.approved = in.readByte() != 0;
        this.priority = (Integer) in.readValue(Integer.class.getClassLoader());
        this.licenseId = (Integer) in.readValue(Integer.class.getClassLoader());
        this.type = in.readString();
        this.order = (Integer) in.readValue(Integer.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<BrewLicenceConnection> CREATOR = new Creator<BrewLicenceConnection>() {
        public BrewLicenceConnection createFromParcel(Parcel source) {
            return new BrewLicenceConnection(source);
        }

        public BrewLicenceConnection[] newArray(int size) {
            return new BrewLicenceConnection[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.ConfigData}.  Implements {@link Parcelable}
 */
public class ConfigData extends com.percolate.sdk.dto.ConfigData implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.value);
        dest.writeString(this.updatedAt);
        dest.writeMap(this.extraFields);
    }

    public ConfigData() {
    }

    protected ConfigData(Parcel in) {
        this.id = in.readString();
        this.value = in.readString();
        this.updatedAt = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<ConfigData> CREATOR = new Creator<ConfigData>() {
        public ConfigData createFromParcel(Parcel source) {
            return new ConfigData(source);
        }

        public ConfigData[] newArray(int size) {
            return new ConfigData[size];
        }
    };
}

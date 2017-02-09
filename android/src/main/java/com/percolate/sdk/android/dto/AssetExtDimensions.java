package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.AssetExtDimensions}.  Implements {@link Parcelable}
 */
public class AssetExtDimensions extends com.percolate.sdk.dto.AssetExtDimensions implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.height);
        dest.writeValue(this.width);
        dest.writeString(this.unit);
        dest.writeMap(this.extraFields);
    }

    public AssetExtDimensions() {
    }

    protected AssetExtDimensions(Parcel in) {
        this.height = (Integer) in.readValue(Integer.class.getClassLoader());
        this.width = (Integer) in.readValue(Integer.class.getClassLoader());
        this.unit = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<AssetExtDimensions> CREATOR = new Creator<AssetExtDimensions>() {
        @Override
        public AssetExtDimensions createFromParcel(Parcel source) {
            return new AssetExtDimensions(source);
        }

        @Override
        public AssetExtDimensions[] newArray(int size) {
            return new AssetExtDimensions[size];
        }
    };
}

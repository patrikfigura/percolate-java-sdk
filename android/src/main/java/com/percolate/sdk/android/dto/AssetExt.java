package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.AssetExt}.  Implements {@link Parcelable}
 */
public class AssetExt extends com.percolate.sdk.dto.AssetExt implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.dimensions);
        dest.writeMap(this.extraFields);
    }

    public AssetExt() {
    }

    protected AssetExt(Parcel in) {
        this.dimensions = (com.percolate.sdk.dto.AssetExtDimensions) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<AssetExt> CREATOR = new Creator<AssetExt>() {
        @Override
        public AssetExt createFromParcel(Parcel source) {
            return new AssetExt(source);
        }

        @Override
        public AssetExt[] newArray(int size) {
            return new AssetExt[size];
        }
    };
}

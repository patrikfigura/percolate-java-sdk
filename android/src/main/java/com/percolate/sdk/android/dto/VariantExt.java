package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.VariantExt}.  Implements {@link Parcelable}
 */
public class VariantExt extends com.percolate.sdk.dto.VariantExt implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.dimensions);
        dest.writeString(this.orientation);
        dest.writeMap(this.extraFields);
    }

    public VariantExt() {
    }

    protected VariantExt(Parcel in) {
        this.dimensions = (com.percolate.sdk.dto.AssetExtDimensions) in.readSerializable();
        this.orientation = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<VariantExt> CREATOR = new Creator<VariantExt>() {
        @Override
        public VariantExt createFromParcel(Parcel source) {
            return new VariantExt(source);
        }

        @Override
        public VariantExt[] newArray(int size) {
            return new VariantExt[size];
        }
    };
}

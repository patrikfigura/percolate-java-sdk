package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.Asset;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.SingleAsset}.  Implements {@link Parcelable}
 */
public class SingleAsset extends com.percolate.sdk.dto.SingleAsset implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.include);
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public SingleAsset() {
    }

    protected SingleAsset(Parcel in) {
        this.include = (com.percolate.sdk.dto.AssetInclude) in.readSerializable();
        this.data = (Asset) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<SingleAsset> CREATOR = new Creator<SingleAsset>() {
        @Override
        public SingleAsset createFromParcel(Parcel source) {
            return new SingleAsset(source);
        }

        @Override
        public SingleAsset[] newArray(int size) {
            return new SingleAsset[size];
        }
    };
}

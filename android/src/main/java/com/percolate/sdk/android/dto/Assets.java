package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.Asset;
import com.percolate.sdk.dto.V5Meta;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.Assets}.  Implements {@link Parcelable}
 */
public class Assets extends com.percolate.sdk.dto.Assets implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.include);
        dest.writeSerializable(this.meta);
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    public Assets() {
    }

    protected Assets(Parcel in) {
        this.include = (com.percolate.sdk.dto.AssetInclude) in.readSerializable();
        this.meta = (V5Meta) in.readSerializable();
        this.data = new ArrayList<>();
        in.readList(this.data, Asset.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Assets> CREATOR = new Creator<Assets>() {
        @Override
        public Assets createFromParcel(Parcel source) {
            return new Assets(source);
        }

        @Override
        public Assets[] newArray(int size) {
            return new Assets[size];
        }
    };
}

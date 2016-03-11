package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Features}.  Implements {@link Parcelable}
 */
public class Features extends com.percolate.sdk.dto.Features implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeMap(this.meta);
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    public Features() {
    }

    protected Features(Parcel in) {
        this.meta = new LinkedHashMap<>();
        in.readMap(this.meta, LinkedHashMap.class.getClassLoader());
        this.data = new ArrayList<>();
        in.readList(this.data, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Features> CREATOR = new Creator<Features>() {
        public Features createFromParcel(Parcel source) {
            return new Features(source);
        }

        public Features[] newArray(int size) {
            return new Features[size];
        }
    };
}

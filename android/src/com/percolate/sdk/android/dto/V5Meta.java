package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.LinkedHashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.V5Meta}.  Implements {@link Parcelable}
 */
public class V5Meta extends com.percolate.sdk.dto.V5Meta implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeMap(this.query);
        dest.writeValue(this.total);
    }

    public V5Meta() {
    }

    protected V5Meta(Parcel in) {
        in.readMap(this.query, LinkedHashMap.class.getClassLoader());
        this.total = (Long) in.readValue(Long.class.getClassLoader());
    }

    public static final Creator<V5Meta> CREATOR = new Creator<V5Meta>() {
        public V5Meta createFromParcel(Parcel source) {
            return new V5Meta(source);
        }

        public V5Meta[] newArray(int size) {
            return new V5Meta[size];
        }
    };
}

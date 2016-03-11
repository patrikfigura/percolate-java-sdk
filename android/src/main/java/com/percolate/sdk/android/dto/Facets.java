package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.Facets}.  Implements {@link Parcelable}
 */
public class Facets extends com.percolate.sdk.dto.Facets implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeMap(this.tags);
        dest.writeMap(this.extraFields);
    }

    public Facets() {
    }

    protected Facets(Parcel in) {
        in.readMap(this.tags, LinkedHashMap.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Facets> CREATOR = new Creator<Facets>() {
        public Facets createFromParcel(Parcel source) {
            return new Facets(source);
        }

        public Facets[] newArray(int size) {
            return new Facets[size];
        }
    };
}

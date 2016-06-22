package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.MetadataList}.  Implements {@link Parcelable}
 */
public class MetadataList extends com.percolate.sdk.dto.MetadataList implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.meta);
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    public MetadataList() {
    }

    protected MetadataList(Parcel in) {
        this.meta = (com.percolate.sdk.dto.V5Meta) in.readSerializable();
        this.data = new ArrayList<>();
        in.readList(this.data, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<MetadataList> CREATOR = new Creator<MetadataList>() {
        public MetadataList createFromParcel(Parcel source) {
            return new MetadataList(source);
        }

        public MetadataList[] newArray(int size) {
            return new MetadataList[size];
        }
    };
}

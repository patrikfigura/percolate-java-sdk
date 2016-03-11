package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.PaginationData}.  Implements {@link Parcelable}
 */
public class PaginationData extends com.percolate.sdk.dto.PaginationData implements android.os.Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.total);
        dest.writeValue(this.limit);
        dest.writeValue(this.offset);
        dest.writeString(this.orderBy);
        dest.writeString(this.orderDirection);
        dest.writeString(this.startKey);
        dest.writeString(this.endKey);
        dest.writeMap(this.extraFields);
    }

    public PaginationData() {
    }

    protected PaginationData(Parcel in) {
        this.total = (Integer) in.readValue(Integer.class.getClassLoader());
        this.limit = (Integer) in.readValue(Integer.class.getClassLoader());
        this.offset = (Integer) in.readValue(Integer.class.getClassLoader());
        this.orderBy = in.readString();
        this.orderDirection = in.readString();
        this.startKey = in.readString();
        this.endKey = in.readString();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<PaginationData> CREATOR = new Creator<PaginationData>() {
        public PaginationData createFromParcel(Parcel source) {
            return new PaginationData(source);
        }

        public PaginationData[] newArray(int size) {
            return new PaginationData[size];
        }
    };
}

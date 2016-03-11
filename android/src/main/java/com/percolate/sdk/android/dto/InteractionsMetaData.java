package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.InteractionsMetaData}.  Implements {@link Parcelable}
 */
public class InteractionsMetaData extends com.percolate.sdk.dto.InteractionsMetaData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.query);
        dest.writeValue(this.total);
        dest.writeMap(this.extraFields);
    }

    public InteractionsMetaData() {
    }

    protected InteractionsMetaData(Parcel in) {
        this.query = (com.percolate.sdk.dto.InteractionsMetaDataQuery) in.readSerializable();
        this.total = (Long) in.readValue(Long.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<InteractionsMetaData> CREATOR = new Creator<InteractionsMetaData>() {
        public InteractionsMetaData createFromParcel(Parcel source) {
            return new InteractionsMetaData(source);
        }

        public InteractionsMetaData[] newArray(int size) {
            return new InteractionsMetaData[size];
        }
    };
}

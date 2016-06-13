package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.SinglePreviewFormat}.  Implements {@link Parcelable}
 */
public class SinglePreviewFormat extends com.percolate.sdk.dto.SinglePreviewFormat implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public SinglePreviewFormat() {
    }

    protected SinglePreviewFormat(Parcel in) {
        this.data = (com.percolate.sdk.dto.PreviewFormat) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<SinglePreviewFormat> CREATOR = new Creator<SinglePreviewFormat>() {
        @Override
        public SinglePreviewFormat createFromParcel(Parcel source) {
            return new SinglePreviewFormat(source);
        }

        @Override
        public SinglePreviewFormat[] newArray(int size) {
            return new SinglePreviewFormat[size];
        }
    };
}

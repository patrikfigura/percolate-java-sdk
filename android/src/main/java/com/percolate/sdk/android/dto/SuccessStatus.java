package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.SuccessStatus}.  Implements {@link Parcelable}
 */
public class SuccessStatus extends com.percolate.sdk.dto.SuccessStatus implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.success);
        dest.writeMap(this.extraFields);
    }

    public SuccessStatus() {
    }

    protected SuccessStatus(Parcel in) {
        this.success = (com.percolate.sdk.dto.SuccessProperty) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<SuccessStatus> CREATOR = new Creator<SuccessStatus>() {
        public SuccessStatus createFromParcel(Parcel source) {
            return new SuccessStatus(source);
        }

        public SuccessStatus[] newArray(int size) {
            return new SuccessStatus[size];
        }
    };
}

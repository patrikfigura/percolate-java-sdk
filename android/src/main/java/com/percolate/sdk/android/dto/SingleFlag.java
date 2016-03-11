package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.SingleFlag}.  Implements {@link Parcelable}
 */
public class SingleFlag extends com.percolate.sdk.dto.SingleFlag implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public SingleFlag() {
    }

    protected SingleFlag(Parcel in) {
        this.data = (com.percolate.sdk.dto.Flag) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<SingleFlag> CREATOR = new Creator<SingleFlag>() {
        public SingleFlag createFromParcel(Parcel source) {
            return new SingleFlag(source);
        }

        public SingleFlag[] newArray(int size) {
            return new SingleFlag[size];
        }
    };
}

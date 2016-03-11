package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.SingleShare}.  Implements {@link Parcelable}
 */
public class SingleShare extends com.percolate.sdk.dto.SingleShare implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public SingleShare() {
    }

    protected SingleShare(Parcel in) {
        this.data = (com.percolate.sdk.dto.ShareData) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<SingleShare> CREATOR = new Creator<SingleShare>() {
        public SingleShare createFromParcel(Parcel source) {
            return new SingleShare(source);
        }

        public SingleShare[] newArray(int size) {
            return new SingleShare[size];
        }
    };
}

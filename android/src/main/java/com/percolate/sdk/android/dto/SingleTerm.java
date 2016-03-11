package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.SingleTerm}.  Implements {@link Parcelable}
 */
public class SingleTerm extends com.percolate.sdk.dto.SingleTerm implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public SingleTerm() {
    }

    protected SingleTerm(Parcel in) {
        this.data = (com.percolate.sdk.dto.Term) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<SingleTerm> CREATOR = new Creator<SingleTerm>() {
        public SingleTerm createFromParcel(Parcel source) {
            return new SingleTerm(source);
        }

        public SingleTerm[] newArray(int size) {
            return new SingleTerm[size];
        }
    };
}

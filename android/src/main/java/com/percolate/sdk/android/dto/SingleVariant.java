package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.SingleVariant}.  Implements {@link Parcelable}
 */
public class SingleVariant extends com.percolate.sdk.dto.SingleVariant implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public SingleVariant() {
    }

    protected SingleVariant(Parcel in) {
        this.data = (com.percolate.sdk.dto.Variant) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<SingleVariant> CREATOR = new Creator<SingleVariant>() {
        @Override
        public SingleVariant createFromParcel(Parcel source) {
            return new SingleVariant(source);
        }

        @Override
        public SingleVariant[] newArray(int size) {
            return new SingleVariant[size];
        }
    };
}

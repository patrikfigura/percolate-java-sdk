package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.Error}.  Implements {@link Parcelable}
 */
public class Error extends com.percolate.sdk.dto.Error implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.message);
        dest.writeString(this.code);
        dest.writeMap(this.extraFields);
    }

    public Error() {
    }

    protected Error(Parcel in) {
        this.message = in.readString();
        this.code = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Parcelable.Creator<com.percolate.sdk.android.dto.Error> CREATOR = new Parcelable.Creator<com.percolate.sdk.android.dto.Error>() {
        public com.percolate.sdk.android.dto.Error createFromParcel(Parcel source) {
            return new com.percolate.sdk.android.dto.Error(source);
        }

        public com.percolate.sdk.android.dto.Error[] newArray(int size) {
            return new com.percolate.sdk.android.dto.Error[size];
        }
    };
}

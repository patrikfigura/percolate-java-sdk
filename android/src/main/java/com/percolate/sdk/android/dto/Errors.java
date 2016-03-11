package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Errors}.  Implements {@link Parcelable}
 */
public class Errors extends com.percolate.sdk.dto.Errors implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.errors);
        dest.writeMap(this.extraFields);
    }

    public Errors() {
    }

    protected Errors(Parcel in) {
        this.errors = new ArrayList<>();
        in.readList(this.errors, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Errors> CREATOR = new Creator<Errors>() {
        public Errors createFromParcel(Parcel source) {
            return new Errors(source);
        }

        public Errors[] newArray(int size) {
            return new Errors[size];
        }
    };
}

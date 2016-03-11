package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Tasks}.  Implements {@link Parcelable}
 */
public class Tasks extends com.percolate.sdk.dto.Tasks implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.meta);
        dest.writeList(this.data);
        dest.writeList(this.errors);
        dest.writeMap(this.extraFields);
    }

    public Tasks() {
    }

    protected Tasks(Parcel in) {
        this.meta = (com.percolate.sdk.dto.V5Meta) in.readSerializable();
        this.data = new ArrayList<>();
        in.readList(this.data, List.class.getClassLoader());
        this.errors = new ArrayList<>();
        in.readList(this.errors, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<Tasks> CREATOR = new Creator<Tasks>() {
        public Tasks createFromParcel(Parcel source) {
            return new Tasks(source);
        }

        public Tasks[] newArray(int size) {
            return new Tasks[size];
        }
    };
}

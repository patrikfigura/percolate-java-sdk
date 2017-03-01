package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.V5Meta;
import com.percolate.sdk.dto.Variant;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.Variants}.  Implements {@link Parcelable}
 */
public class Variants extends com.percolate.sdk.dto.Variants implements Parcelable {

    public Variants() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.meta);
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    protected Variants(Parcel in) {
        this.meta = (V5Meta) in.readSerializable();
        this.data = new ArrayList<>();
        in.readList(this.data, Variant.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Variants> CREATOR = new Creator<Variants>() {
        @Override
        public Variants createFromParcel(Parcel source) {
            return new Variants(source);
        }

        @Override
        public Variants[] newArray(int size) {
            return new Variants[size];
        }
    };
}

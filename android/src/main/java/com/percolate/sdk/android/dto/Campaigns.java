package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Campaigns}.  Implements {@link Parcelable}
 */
public class Campaigns extends com.percolate.sdk.dto.Campaigns implements Parcelable {

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

    public Campaigns() {
    }

    protected Campaigns(Parcel in) {
        this.meta = (com.percolate.sdk.dto.V5Meta) in.readSerializable();
        this.data = new ArrayList<>();
        in.readList(this.data, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Campaigns> CREATOR = new Creator<Campaigns>() {
        public Campaigns createFromParcel(Parcel source) {
            return new Campaigns(source);
        }

        public Campaigns[] newArray(int size) {
            return new Campaigns[size];
        }
    };
}

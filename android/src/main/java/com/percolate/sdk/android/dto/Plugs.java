package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Plugs}.  Implements {@link Parcelable}
 */
public class Plugs extends com.percolate.sdk.dto.Plugs implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.plugs);
        dest.writeMap(this.extraFields);
    }

    public Plugs() {
    }

    protected Plugs(Parcel in) {
        this.plugs = new ArrayList<com.percolate.sdk.dto.Plug>();
        in.readList(this.plugs, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Plugs> CREATOR = new Creator<Plugs>() {
        public Plugs createFromParcel(Parcel source) {
            return new Plugs(source);
        }

        public Plugs[] newArray(int size) {
            return new Plugs[size];
        }
    };
}

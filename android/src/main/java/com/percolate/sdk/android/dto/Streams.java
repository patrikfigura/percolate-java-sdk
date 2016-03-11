package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.StreamData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Streams}.  Implements {@link Parcelable}
 */
public class Streams extends com.percolate.sdk.dto.Streams implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.include);
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    public Streams() {
    }

    protected Streams(Parcel in) {
        this.include = (com.percolate.sdk.dto.StreamsInclude) in.readSerializable();
        this.data = new ArrayList<StreamData>();
        in.readList(this.data, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<Streams> CREATOR = new Creator<Streams>() {
        public Streams createFromParcel(Parcel source) {
            return new Streams(source);
        }

        public Streams[] newArray(int size) {
            return new Streams[size];
        }
    };
}

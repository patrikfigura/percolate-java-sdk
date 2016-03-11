package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.StreamsInclude}.  Implements {@link Parcelable}
 */
public class StreamsInclude extends com.percolate.sdk.dto.StreamsInclude implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.channels);
        dest.writeMap(this.extraFields);
    }

    public StreamsInclude() {
    }

    protected StreamsInclude(Parcel in) {
        this.channels = new ArrayList<com.percolate.sdk.dto.StreamChannelData>();
        in.readList(this.channels, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<StreamsInclude> CREATOR = new Creator<StreamsInclude>() {
        public StreamsInclude createFromParcel(Parcel source) {
            return new StreamsInclude(source);
        }

        public StreamsInclude[] newArray(int size) {
            return new StreamsInclude[size];
        }
    };
}

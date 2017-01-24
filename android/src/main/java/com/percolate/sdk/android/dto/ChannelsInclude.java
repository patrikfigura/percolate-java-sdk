package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.ChannelsInclude}.  Implements {@link Parcelable}
 */
public class ChannelsInclude extends com.percolate.sdk.dto.ChannelsInclude implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.platforms);
        dest.writeMap(this.extraFields);
    }

    public ChannelsInclude() {
    }

    protected ChannelsInclude(Parcel in) {
        this.platforms = new ArrayList<com.percolate.sdk.dto.Platform>();
        in.readList(this.platforms, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<ChannelsInclude> CREATOR = new Creator<ChannelsInclude>() {
        public ChannelsInclude createFromParcel(Parcel source) {
            return new ChannelsInclude(source);
        }

        public ChannelsInclude[] newArray(int size) {
            return new ChannelsInclude[size];
        }
    };
}

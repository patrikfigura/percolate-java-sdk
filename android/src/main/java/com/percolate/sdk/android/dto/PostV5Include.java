package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.PostV5Include}.  Implements {@link Parcelable}
 */
public class PostV5Include extends com.percolate.sdk.dto.PostV5Include implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.platform);
        dest.writeList(this.channel);
        dest.writeList(this.schema);
        dest.writeMap(this.extraFields);
    }

    public PostV5Include() {
    }

    protected PostV5Include(Parcel in) {
        this.platform = new ArrayList<>();
        in.readList(this.platform, List.class.getClassLoader());
        this.channel = new ArrayList<>();
        in.readList(this.channel, List.class.getClassLoader());
        this.schema = new ArrayList<>();
        in.readList(this.schema, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<PostV5Include> CREATOR = new Creator<PostV5Include>() {
        public PostV5Include createFromParcel(Parcel source) {
            return new PostV5Include(source);
        }

        public PostV5Include[] newArray(int size) {
            return new PostV5Include[size];
        }
    };
}

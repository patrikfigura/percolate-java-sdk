package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.Schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Platform}.  Implements {@link Parcelable}
 */
public class Platform extends com.percolate.sdk.dto.Platform implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.channels);
        dest.writeList(this.schemas);
        dest.writeString(this.iconUrl);
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.type);
        dest.writeString(this.scopeId);
        dest.writeString(this.color);
        dest.writeString(this.avatarId);
        dest.writeString(this.updatedAt);
        dest.writeMap(this.extraFields);
    }

    public Platform() {
    }

    protected Platform(Parcel in) {
        this.channels = new ArrayList<com.percolate.sdk.dto.ChannelV5>();
        in.readList(this.channels, List.class.getClassLoader());
        this.schemas = new ArrayList<Schema>();
        in.readList(this.schemas, List.class.getClassLoader());
        this.iconUrl = in.readString();
        this.id = in.readString();
        this.name = in.readString();
        this.type = in.readString();
        this.scopeId = in.readString();
        this.color = in.readString();
        this.avatarId = in.readString();
        this.updatedAt = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Platform> CREATOR = new Creator<Platform>() {
        public Platform createFromParcel(Parcel source) {
            return new Platform(source);
        }

        public Platform[] newArray(int size) {
            return new Platform[size];
        }
    };
}

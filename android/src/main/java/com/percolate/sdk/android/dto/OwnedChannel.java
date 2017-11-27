package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.OwnedChannel}.  Implements {@link Parcelable}
 */
public class OwnedChannel extends com.percolate.sdk.dto.OwnedChannel implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.rssUrl);
        dest.writeString(this.description);
        dest.writeString(this.url);
        dest.writeString(this.pageId);
        dest.writeString(this.name);
        dest.writeValue(this.totalSubscribers);
        dest.writeString(this.type);
        dest.writeString(this.photoUrl);
        dest.writeMap(this.extraFields);
    }

    public OwnedChannel() {
    }

    protected OwnedChannel(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.rssUrl = in.readString();
        this.description = in.readString();
        this.url = in.readString();
        this.pageId = in.readString();
        this.name = in.readString();
        this.totalSubscribers = (Integer) in.readValue(Integer.class.getClassLoader());
        this.type = in.readString();
        this.photoUrl = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<OwnedChannel> CREATOR = new Creator<OwnedChannel>() {
        public OwnedChannel createFromParcel(Parcel source) {
            return new OwnedChannel(source);
        }

        public OwnedChannel[] newArray(int size) {
            return new OwnedChannel[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.Channel}.  Implements {@link Parcelable}
 */
public class Channel extends com.percolate.sdk.dto.Channel implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeString(this.photoUrl);
        dest.writeValue(this.totalSubscribers);
        dest.writeString(this.type);
        dest.writeString(this.url);
        dest.writeString(this.pageId);
        dest.writeMap(this.extraFields);
    }

    public Channel() {
    }

    protected Channel(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        this.photoUrl = in.readString();
        this.totalSubscribers = (Integer) in.readValue(Integer.class.getClassLoader());
        this.type = in.readString();
        this.url = in.readString();
        this.pageId = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Channel> CREATOR = new Creator<Channel>() {
        public Channel createFromParcel(Parcel source) {
            return new Channel(source);
        }

        public Channel[] newArray(int size) {
            return new Channel[size];
        }
    };
}

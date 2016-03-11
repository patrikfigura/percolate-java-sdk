package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;
import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.Entry}.  Implements {@link Parcelable}
 */
public class Entry extends com.percolate.sdk.dto.Entry implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.channel);
        dest.writeLong(createdAt != null ? createdAt.getTime() : -1);
        dest.writeString(this.description);
        dest.writeString(this.url);
        dest.writeMap(this.extraFields);
    }

    public Entry() {
    }

    protected Entry(Parcel in) {
        this.channel = (com.percolate.sdk.dto.Channel) in.readSerializable();
        long tmpCreatedAt = in.readLong();
        this.createdAt = tmpCreatedAt == -1 ? null : new Date(tmpCreatedAt);
        this.description = in.readString();
        this.url = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Entry> CREATOR = new Creator<Entry>() {
        public Entry createFromParcel(Parcel source) {
            return new Entry(source);
        }

        public Entry[] newArray(int size) {
            return new Entry[size];
        }
    };
}

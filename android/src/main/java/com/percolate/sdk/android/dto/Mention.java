package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.Mention}.  Implements {@link Parcelable}
 */
public class Mention extends com.percolate.sdk.dto.Mention implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.objectId);
        dest.writeValue(this.offset);
        dest.writeValue(this.length);
        dest.writeMap(this.extraFields);
    }

    public Mention() {
    }

    protected Mention(Parcel in) {
        this.objectId = in.readString();
        this.offset = (Integer) in.readValue(Integer.class.getClassLoader());
        this.length = (Integer) in.readValue(Integer.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<Mention> CREATOR = new Creator<Mention>() {
        public Mention createFromParcel(Parcel source) {
            return new Mention(source);
        }

        public Mention[] newArray(int size) {
            return new Mention[size];
        }
    };
}

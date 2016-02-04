package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.Brew}.  Implements {@link Parcelable}
 */
public class Brew extends com.percolate.sdk.dto.Brew implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeValue(this.totalChannels);
        dest.writeValue(this.priority);
        dest.writeString(this.type);
        dest.writeByte(approved ? (byte) 1 : (byte) 0);
    }

    public Brew() {
    }

    protected Brew(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        this.totalChannels = (Integer) in.readValue(Integer.class.getClassLoader());
        this.priority = (Integer) in.readValue(Integer.class.getClassLoader());
        this.type = in.readString();
        this.approved = in.readByte() != 0;
    }

    public static final Creator<Brew> CREATOR = new Creator<Brew>() {
        public Brew createFromParcel(Parcel source) {
            return new Brew(source);
        }

        public Brew[] newArray(int size) {
            return new Brew[size];
        }
    };
}

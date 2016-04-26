package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.FacebookMentionV5Data}.  Implements {@link Parcelable}
 */
public class FacebookMentionV5Data extends com.percolate.sdk.dto.FacebookMentionV5Data implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.value);
        dest.writeValue(this.length);
        dest.writeValue(this.offset);
        dest.writeMap(this.extraFields);
    }

    public FacebookMentionV5Data() {
    }

    protected FacebookMentionV5Data(Parcel in) {
        this.value = in.readString();
        this.length = (Integer) in.readValue(Integer.class.getClassLoader());
        this.offset = (Integer) in.readValue(Integer.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<FacebookMentionV5Data> CREATOR = new Creator<FacebookMentionV5Data>() {
        public FacebookMentionV5Data createFromParcel(Parcel source) {
            return new FacebookMentionV5Data(source);
        }

        public FacebookMentionV5Data[] newArray(int size) {
            return new FacebookMentionV5Data[size];
        }
    };
}

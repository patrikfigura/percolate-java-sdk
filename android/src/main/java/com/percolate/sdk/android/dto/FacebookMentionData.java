package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.FacebookMentionData}.  Implements {@link Parcelable}
 */
public class FacebookMentionData extends com.percolate.sdk.dto.FacebookMentionData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.text);
        dest.writeString(this.xid);
        dest.writeValue(this.length);
        dest.writeValue(this.offset);
        dest.writeMap(this.extraFields);
    }

    public FacebookMentionData() {
    }

    protected FacebookMentionData(Parcel in) {
        this.text = in.readString();
        this.xid = in.readString();
        this.length = (Integer) in.readValue(Integer.class.getClassLoader());
        this.offset = (Integer) in.readValue(Integer.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<FacebookMentionData> CREATOR = new Creator<FacebookMentionData>() {
        public FacebookMentionData createFromParcel(Parcel source) {
            return new FacebookMentionData(source);
        }

        public FacebookMentionData[] newArray(int size) {
            return new FacebookMentionData[size];
        }
    };
}

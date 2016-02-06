package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;
import com.percolate.sdk.dto.TwitterQuery;

import java.util.Map;

/**
 * Android version of {@link com.percolate.sdk.dto.StreamData}.  Implements {@link Parcelable}
 */
public class StreamData extends com.percolate.sdk.dto.StreamData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.channelData);
        dest.writeSerializable(this.twitterQuery);
        dest.writeString(this.id);
        dest.writeString(this.type);
        dest.writeString(this.scopeId);
        dest.writeString(this.channelId);
        dest.writeString(this.updatedAt);
        dest.writeMap(this.ext);
    }

    public StreamData() {
    }

    protected StreamData(Parcel in) {
        this.channelData = (com.percolate.sdk.dto.StreamChannelData) in.readSerializable();
        this.twitterQuery = (TwitterQuery) in.readSerializable();
        this.id = in.readString();
        this.type = in.readString();
        this.scopeId = in.readString();
        this.channelId = in.readString();
        this.updatedAt = in.readString();
        in.readMap(this.ext, Map.class.getClassLoader());
    }

    public static final Creator<StreamData> CREATOR = new Creator<StreamData>() {
        public StreamData createFromParcel(Parcel source) {
            return new StreamData(source);
        }

        public StreamData[] newArray(int size) {
            return new StreamData[size];
        }
    };
}

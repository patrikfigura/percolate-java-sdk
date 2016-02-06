package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.FacebookMentionPictureData}.  Implements {@link Parcelable}
 */
public class FacebookMentionPictureData extends com.percolate.sdk.dto.FacebookMentionPictureData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.url);
        dest.writeByte(silhouette ? (byte) 1 : (byte) 0);
    }

    public FacebookMentionPictureData() {
    }

    protected FacebookMentionPictureData(Parcel in) {
        this.url = in.readString();
        this.silhouette = in.readByte() != 0;
    }

    public static final Creator<FacebookMentionPictureData> CREATOR = new Creator<FacebookMentionPictureData>() {
        public FacebookMentionPictureData createFromParcel(Parcel source) {
            return new FacebookMentionPictureData(source);
        }

        public FacebookMentionPictureData[] newArray(int size) {
            return new FacebookMentionPictureData[size];
        }
    };
}

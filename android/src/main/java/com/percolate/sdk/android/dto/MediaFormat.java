package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;

/**
 * Android version of {@link com.percolate.sdk.dto.MediaFormat}.  Implements {@link Parcelable}
 */
public class MediaFormat extends com.percolate.sdk.dto.MediaFormat implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.profile);
        dest.writeString(this.url);
        dest.writeSerializable(this.metaData);
        dest.writeString(this.contentType);
        dest.writeString(this.fileSize);
    }

    public MediaFormat() {
    }

    protected MediaFormat(Parcel in) {
        this.profile = in.readString();
        this.url = in.readString();
        this.metaData = (com.percolate.sdk.dto.VideoFormatMetaData) in.readSerializable();
        this.contentType = in.readString();
        this.fileSize = in.readString();
    }

    public static final Creator<MediaFormat> CREATOR = new Creator<MediaFormat>() {
        public MediaFormat createFromParcel(Parcel source) {
            return new MediaFormat(source);
        }

        public MediaFormat[] newArray(int size) {
            return new MediaFormat[size];
        }
    };
}

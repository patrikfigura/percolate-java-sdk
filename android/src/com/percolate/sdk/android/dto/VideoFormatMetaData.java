package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.VideoFormatMetaData}.  Implements {@link Parcelable}
 */
public class VideoFormatMetaData extends com.percolate.sdk.dto.VideoFormatMetaData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.duration);
        dest.writeValue(this.width);
        dest.writeValue(this.height);
    }

    public VideoFormatMetaData() {
    }

    protected VideoFormatMetaData(Parcel in) {
        this.duration = (Integer) in.readValue(Integer.class.getClassLoader());
        this.width = (Integer) in.readValue(Integer.class.getClassLoader());
        this.height = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Creator<VideoFormatMetaData> CREATOR = new Creator<VideoFormatMetaData>() {
        public VideoFormatMetaData createFromParcel(Parcel source) {
            return new VideoFormatMetaData(source);
        }

        public VideoFormatMetaData[] newArray(int size) {
            return new VideoFormatMetaData[size];
        }
    };
}

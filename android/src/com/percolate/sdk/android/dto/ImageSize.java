package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.ImageSize}.  Implements {@link Parcelable}
 */
public class ImageSize extends com.percolate.sdk.dto.ImageSize implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.url);
        dest.writeString(this.width);
        dest.writeString(this.length);
        dest.writeString(this.height);
    }

    public ImageSize() {
    }

    protected ImageSize(Parcel in) {
        this.url = in.readString();
        this.width = in.readString();
        this.length = in.readString();
        this.height = in.readString();
    }

    public static final Creator<ImageSize> CREATOR = new Creator<ImageSize>() {
        public ImageSize createFromParcel(Parcel source) {
            return new ImageSize(source);
        }

        public ImageSize[] newArray(int size) {
            return new ImageSize[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.ImageLicense}.  Implements {@link Parcelable}
 */
public class ImageLicense extends com.percolate.sdk.dto.ImageLicense implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.owner_url);
        dest.writeMap(this.extraFields);
    }

    public ImageLicense() {
    }

    protected ImageLicense(Parcel in) {
        this.owner_url = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<ImageLicense> CREATOR = new Creator<ImageLicense>() {
        public ImageLicense createFromParcel(Parcel source) {
            return new ImageLicense(source);
        }

        public ImageLicense[] newArray(int size) {
            return new ImageLicense[size];
        }
    };
}

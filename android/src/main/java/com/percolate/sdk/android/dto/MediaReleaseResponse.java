package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.MediaReleaseResponse}.  Implements {@link Parcelable}
 */
public class MediaReleaseResponse extends com.percolate.sdk.dto.MediaReleaseResponse implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public MediaReleaseResponse() {
    }

    protected MediaReleaseResponse(Parcel in) {
        this.data = (com.percolate.sdk.dto.MediaReleaseResponseData) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<MediaReleaseResponse> CREATOR = new Creator<MediaReleaseResponse>() {
        public MediaReleaseResponse createFromParcel(Parcel source) {
            return new MediaReleaseResponse(source);
        }

        public MediaReleaseResponse[] newArray(int size) {
            return new MediaReleaseResponse[size];
        }
    };
}

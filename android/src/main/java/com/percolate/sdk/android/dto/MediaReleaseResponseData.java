package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.MediaReleaseResponseData}.  Implements {@link Parcelable}
 */
public class MediaReleaseResponseData extends com.percolate.sdk.dto.MediaReleaseResponseData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeValue(this.urlExpiration);
        dest.writeString(this.referenceUID);
        dest.writeString(this.createdAt);
        dest.writeString(this.signatureImageId);
        dest.writeString(this.birthdate);
        dest.writeString(this.email);
        dest.writeString(this.signatureImageUrl);
    }

    public MediaReleaseResponseData() {
    }

    protected MediaReleaseResponseData(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        this.urlExpiration = (Long) in.readValue(Long.class.getClassLoader());
        this.referenceUID = in.readString();
        this.createdAt = in.readString();
        this.signatureImageId = in.readString();
        this.birthdate = in.readString();
        this.email = in.readString();
        this.signatureImageUrl = in.readString();
    }

    public static final Creator<MediaReleaseResponseData> CREATOR = new Creator<MediaReleaseResponseData>() {
        public MediaReleaseResponseData createFromParcel(Parcel source) {
            return new MediaReleaseResponseData(source);
        }

        public MediaReleaseResponseData[] newArray(int size) {
            return new MediaReleaseResponseData[size];
        }
    };
}

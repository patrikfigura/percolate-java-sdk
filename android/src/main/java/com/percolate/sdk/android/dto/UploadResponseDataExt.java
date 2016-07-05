package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.UploadResponseDataExt}.  Implements {@link Parcelable}
 */
public class UploadResponseDataExt extends com.percolate.sdk.dto.UploadResponseDataExt implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.filename);
        dest.writeString(this.contentType);
        dest.writeString(this.fileHash);
        dest.writeValue(this.fileSize);
        dest.writeValue(this.multipart);
        dest.writeMap(this.extraFields);
    }

    public UploadResponseDataExt() {
    }

    protected UploadResponseDataExt(Parcel in) {
        this.filename = in.readString();
        this.contentType = in.readString();
        this.fileHash = in.readString();
        this.fileSize = (Long) in.readValue(Long.class.getClassLoader());
        this.multipart = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<UploadResponseDataExt> CREATOR = new Creator<UploadResponseDataExt>() {
        public UploadResponseDataExt createFromParcel(Parcel source) {
            return new UploadResponseDataExt(source);
        }

        public UploadResponseDataExt[] newArray(int size) {
            return new UploadResponseDataExt[size];
        }
    };
}

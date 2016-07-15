package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.UploadRequestDataExt}.  Implements {@link Parcelable}
 */
public class UploadRequestDataExt extends com.percolate.sdk.dto.UploadRequestDataExt implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.url);
        dest.writeString(this.filename);
        dest.writeString(this.contentType);
        dest.writeString(this.fileHash);
        dest.writeValue(this.fileSize);
        dest.writeValue(this.multipart);
        dest.writeMap(this.extraFields);
    }

    public UploadRequestDataExt() {
    }

    protected UploadRequestDataExt(Parcel in) {
        this.url = in.readString();
        this.filename = in.readString();
        this.contentType = in.readString();
        this.fileHash = in.readString();
        this.fileSize = (Long) in.readValue(Long.class.getClassLoader());
        this.multipart = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<UploadRequestDataExt> CREATOR = new Creator<UploadRequestDataExt>() {
        public UploadRequestDataExt createFromParcel(Parcel source) {
            return new UploadRequestDataExt(source);
        }

        public UploadRequestDataExt[] newArray(int size) {
            return new UploadRequestDataExt[size];
        }
    };
}

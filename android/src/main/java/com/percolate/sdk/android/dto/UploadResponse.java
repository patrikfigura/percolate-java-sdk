package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.UploadResponse}.  Implements {@link Parcelable}
 */
public class UploadResponse extends com.percolate.sdk.dto.UploadResponse implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public UploadResponse() {
    }

    protected UploadResponse(Parcel in) {
        this.data = (com.percolate.sdk.dto.UploadResponseData) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<UploadResponse> CREATOR = new Creator<UploadResponse>() {
        public UploadResponse createFromParcel(Parcel source) {
            return new UploadResponse(source);
        }

        public UploadResponse[] newArray(int size) {
            return new UploadResponse[size];
        }
    };
}

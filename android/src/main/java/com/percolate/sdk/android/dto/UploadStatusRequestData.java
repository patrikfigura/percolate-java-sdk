package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.UploadStatusRequestData}.  Implements {@link Parcelable}
 */
public class UploadStatusRequestData extends com.percolate.sdk.dto.UploadStatusRequestData implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.scopeId);
        dest.writeString(this.status);
        dest.writeMap(this.extraFields);
    }

    public UploadStatusRequestData() {
    }

    protected UploadStatusRequestData(Parcel in) {
        this.scopeId = in.readString();
        this.status = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<UploadStatusRequestData> CREATOR = new Creator<UploadStatusRequestData>() {
        public UploadStatusRequestData createFromParcel(Parcel source) {
            return new UploadStatusRequestData(source);
        }

        public UploadStatusRequestData[] newArray(int size) {
            return new UploadStatusRequestData[size];
        }
    };
}

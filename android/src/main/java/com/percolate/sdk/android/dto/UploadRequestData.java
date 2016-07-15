package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.UploadRequestData}.  Implements {@link Parcelable}
 */
public class UploadRequestData extends com.percolate.sdk.dto.UploadRequestData implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.scopeId);
        dest.writeString(this.type);
        dest.writeString(this.destinationId);
        dest.writeString(this.approvalGroupId);
        dest.writeString(this.uploadState);
        dest.writeValue(this.progress);
        dest.writeSerializable(this.ext);
        dest.writeMap(this.extraFields);
    }

    public UploadRequestData() {
    }

    protected UploadRequestData(Parcel in) {
        this.scopeId = in.readString();
        this.type = in.readString();
        this.destinationId = in.readString();
        this.approvalGroupId = in.readString();
        this.uploadState = in.readString();
        this.progress = (Integer) in.readValue(Integer.class.getClassLoader());
        this.ext = (com.percolate.sdk.dto.UploadRequestDataExt) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<UploadRequestData> CREATOR = new Creator<UploadRequestData>() {
        public UploadRequestData createFromParcel(Parcel source) {
            return new UploadRequestData(source);
        }

        public UploadRequestData[] newArray(int size) {
            return new UploadRequestData[size];
        }
    };
}

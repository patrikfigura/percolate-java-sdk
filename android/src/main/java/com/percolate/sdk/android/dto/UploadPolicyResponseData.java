package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.UploadPolicyResponseData}.  Implements {@link Parcelable}
 */
public class UploadPolicyResponseData extends com.percolate.sdk.dto.UploadPolicyResponseData implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.type);
        dest.writeString(this.uploadId);
        dest.writeString(this.url);
        dest.writeString(this.updatedAt);
        dest.writeSerializable(this.ext);
        dest.writeMap(this.extraFields);
    }

    public UploadPolicyResponseData() {
    }

    protected UploadPolicyResponseData(Parcel in) {
        this.id = in.readString();
        this.type = in.readString();
        this.uploadId = in.readString();
        this.url = in.readString();
        this.updatedAt = in.readString();
        this.ext = (com.percolate.sdk.dto.UploadPolicyResponseDataExt) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<UploadPolicyResponseData> CREATOR = new Creator<UploadPolicyResponseData>() {
        public UploadPolicyResponseData createFromParcel(Parcel source) {
            return new UploadPolicyResponseData(source);
        }

        public UploadPolicyResponseData[] newArray(int size) {
            return new UploadPolicyResponseData[size];
        }
    };
}

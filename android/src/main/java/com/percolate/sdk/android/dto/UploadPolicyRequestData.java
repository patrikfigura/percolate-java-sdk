package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.UploadPolicyRequestData}.  Implements {@link Parcelable}
 */
public class UploadPolicyRequestData extends com.percolate.sdk.dto.UploadPolicyRequestData implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.uploadId);
        dest.writeString(this.type);
        dest.writeString(this.ext);
        dest.writeMap(this.extraFields);
    }

    public UploadPolicyRequestData() {
    }

    protected UploadPolicyRequestData(Parcel in) {
        this.uploadId = in.readString();
        this.type = in.readString();
        this.ext = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<UploadPolicyRequestData> CREATOR = new Creator<UploadPolicyRequestData>() {
        public UploadPolicyRequestData createFromParcel(Parcel source) {
            return new UploadPolicyRequestData(source);
        }

        public UploadPolicyRequestData[] newArray(int size) {
            return new UploadPolicyRequestData[size];
        }
    };
}

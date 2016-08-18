package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.UploadPolicyRequestDataExt}.  Implements {@link Parcelable}
 */
public class UploadPolicyRequestDataExt extends com.percolate.sdk.dto.UploadPolicyRequestDataExt implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.partNumber);
        dest.writeValue(this.contentLength);
        dest.writeString(this.sha256);
        dest.writeMap(this.extraFields);
    }

    public UploadPolicyRequestDataExt() {
    }

    protected UploadPolicyRequestDataExt(Parcel in) {
        this.partNumber = (Integer) in.readValue(Integer.class.getClassLoader());
        this.contentLength = (Long) in.readValue(Long.class.getClassLoader());
        this.sha256 = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<UploadPolicyRequestDataExt> CREATOR = new Creator<UploadPolicyRequestDataExt>() {
        public UploadPolicyRequestDataExt createFromParcel(Parcel source) {
            return new UploadPolicyRequestDataExt(source);
        }

        public UploadPolicyRequestDataExt[] newArray(int size) {
            return new UploadPolicyRequestDataExt[size];
        }
    };
}

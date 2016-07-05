package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.UploadPolicyResponseDataExt}.  Implements {@link Parcelable}
 */
public class UploadPolicyResponseDataExt extends com.percolate.sdk.dto.UploadPolicyResponseDataExt implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.awsAccessKeyId);
        dest.writeString(this.keyName);
        dest.writeString(this.bucket);
        dest.writeString(this.acl);
        dest.writeString(this.signature);
        dest.writeString(this.policy);
        dest.writeMap(this.extraFields);
    }

    public UploadPolicyResponseDataExt() {
    }

    protected UploadPolicyResponseDataExt(Parcel in) {
        this.awsAccessKeyId = in.readString();
        this.keyName = in.readString();
        this.bucket = in.readString();
        this.acl = in.readString();
        this.signature = in.readString();
        this.policy = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<UploadPolicyResponseDataExt> CREATOR = new Creator<UploadPolicyResponseDataExt>() {
        public UploadPolicyResponseDataExt createFromParcel(Parcel source) {
            return new UploadPolicyResponseDataExt(source);
        }

        public UploadPolicyResponseDataExt[] newArray(int size) {
            return new UploadPolicyResponseDataExt[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.UploadPolicyResponse}.  Implements {@link Parcelable}
 */
public class UploadPolicyResponse extends com.percolate.sdk.dto.UploadPolicyResponse implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public UploadPolicyResponse() {
    }

    protected UploadPolicyResponse(Parcel in) {
        this.data = (com.percolate.sdk.dto.UploadPolicyResponseData) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<UploadPolicyResponse> CREATOR = new Creator<UploadPolicyResponse>() {
        public UploadPolicyResponse createFromParcel(Parcel source) {
            return new UploadPolicyResponse(source);
        }

        public UploadPolicyResponse[] newArray(int size) {
            return new UploadPolicyResponse[size];
        }
    };
}

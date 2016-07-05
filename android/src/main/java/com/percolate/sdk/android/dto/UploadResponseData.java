package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.UploadResponseData}.  Implements {@link Parcelable}
 */
public class UploadResponseData extends com.percolate.sdk.dto.UploadResponseData implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.scopeId);
        dest.writeString(this.status);
        dest.writeString(this.type);
        dest.writeString(this.assetId);
        dest.writeString(this.destinationId);
        dest.writeString(this.approvalGroupId);
        dest.writeString(this.updatedAt);
        dest.writeSerializable(this.ext);
        dest.writeMap(this.extraFields);
    }

    public UploadResponseData() {
    }

    protected UploadResponseData(Parcel in) {
        this.id = in.readString();
        this.scopeId = in.readString();
        this.status = in.readString();
        this.type = in.readString();
        this.assetId = in.readString();
        this.destinationId = in.readString();
        this.approvalGroupId = in.readString();
        this.updatedAt = in.readString();
        this.ext = (com.percolate.sdk.dto.UploadResponseDataExt) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<UploadResponseData> CREATOR = new Creator<UploadResponseData>() {
        public UploadResponseData createFromParcel(Parcel source) {
            return new UploadResponseData(source);
        }

        public UploadResponseData[] newArray(int size) {
            return new UploadResponseData[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.CannedResponseData}.  Implements {@link Parcelable}
 */
public class CannedResponseData extends com.percolate.sdk.dto.CannedResponseData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.title);
        dest.writeString(this.body);
        dest.writeString(this.scopeId);
        dest.writeStringList(this.topicIds);
        dest.writeStringList(this.availableForIds);
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
    }

    public CannedResponseData() {
    }

    protected CannedResponseData(Parcel in) {
        this.id = in.readString();
        this.title = in.readString();
        this.body = in.readString();
        this.scopeId = in.readString();
        this.topicIds = in.createStringArrayList();
        this.availableForIds = in.createStringArrayList();
        this.createdAt = in.readString();
        this.updatedAt = in.readString();
    }

    public static final Creator<CannedResponseData> CREATOR = new Creator<CannedResponseData>() {
        public CannedResponseData createFromParcel(Parcel source) {
            return new CannedResponseData(source);
        }

        public CannedResponseData[] newArray(int size) {
            return new CannedResponseData[size];
        }
    };
}

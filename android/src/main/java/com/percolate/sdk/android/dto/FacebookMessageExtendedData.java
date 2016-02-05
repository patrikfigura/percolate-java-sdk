package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;
import com.percolate.sdk.dto.FacebookMessageAttachments;
import com.percolate.sdk.dto.FacebookMessageKeyValueList;
import com.percolate.sdk.dto.FacebookUserDataList;

/**
 * Android version of {@link com.percolate.sdk.dto.FacebookMessageExtendedData}.  Implements {@link Parcelable}
 */
public class FacebookMessageExtendedData extends com.percolate.sdk.dto.FacebookMessageExtendedData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.createdTime);
        dest.writeSerializable(this.from);
        dest.writeSerializable(this.to);
        dest.writeString(this.message);
        dest.writeSerializable(this.shares);
        dest.writeSerializable(this.tags);
        dest.writeSerializable(this.attachments);
    }

    public FacebookMessageExtendedData() {
    }

    protected FacebookMessageExtendedData(Parcel in) {
        this.id = in.readString();
        this.createdTime = in.readString();
        this.from = (com.percolate.sdk.dto.FacebookUser) in.readSerializable();
        this.to = (FacebookUserDataList) in.readSerializable();
        this.message = in.readString();
        this.shares = (FacebookMessageKeyValueList) in.readSerializable();
        this.tags = (FacebookMessageKeyValueList) in.readSerializable();
        this.attachments = (FacebookMessageAttachments) in.readSerializable();
    }

    public static final Creator<FacebookMessageExtendedData> CREATOR = new Creator<FacebookMessageExtendedData>() {
        public FacebookMessageExtendedData createFromParcel(Parcel source) {
            return new FacebookMessageExtendedData(source);
        }

        public FacebookMessageExtendedData[] newArray(int size) {
            return new FacebookMessageExtendedData[size];
        }
    };
}

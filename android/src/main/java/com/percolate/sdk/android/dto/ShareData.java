package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;
import com.percolate.sdk.dto.ShareObject;
import com.percolate.sdk.dto.ShareUser;

/**
 * Android version of {@link com.percolate.sdk.dto.ShareData}.  Implements {@link Parcelable}
 */
public class ShareData extends com.percolate.sdk.dto.ShareData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(loaded ? (byte) 1 : (byte) 0);
        dest.writeInt(this.itemViewType);
        dest.writeValue(this.id);
        dest.writeString(this.body);
        dest.writeString(this.createdAt);
        dest.writeSerializable(this.localCreatedAt);
        dest.writeSerializable(this.object);
        dest.writeString(this.objectUID);
        dest.writeSerializable(this.owner);
        dest.writeString(this.ownerUID);
        dest.writeSerializable(this.recipient);
        dest.writeString(this.recipientUID);
    }

    public ShareData() {
    }

    protected ShareData(Parcel in) {
        this.loaded = in.readByte() != 0;
        this.itemViewType = in.readInt();
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.body = in.readString();
        this.createdAt = in.readString();
        this.localCreatedAt = (com.percolate.sdk.dto.LocalCreatedAt) in.readSerializable();
        this.object = (ShareObject) in.readSerializable();
        this.objectUID = in.readString();
        this.owner = (ShareUser) in.readSerializable();
        this.ownerUID = in.readString();
        this.recipient = (ShareUser) in.readSerializable();
        this.recipientUID = in.readString();
    }

    public static final Creator<ShareData> CREATOR = new Creator<ShareData>() {
        public ShareData createFromParcel(Parcel source) {
            return new ShareData(source);
        }

        public ShareData[] newArray(int size) {
            return new ShareData[size];
        }
    };
}

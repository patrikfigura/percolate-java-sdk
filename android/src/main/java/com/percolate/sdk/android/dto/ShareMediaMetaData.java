package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;

import java.util.Date;

/**
 * Android version of {@link com.percolate.sdk.dto.ShareMediaMetaData}.  Implements {@link Parcelable}
 */
public class ShareMediaMetaData extends com.percolate.sdk.dto.ShareMediaMetaData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.uid);
        dest.writeStringList(this.tags);
        dest.writeValue(this.ownerId);
        dest.writeString(this.ownerType);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeLong(createAt != null ? createAt.getTime() : -1);
        dest.writeString(this.originalFilename);
        dest.writeLong(modifiedAt != null ? modifiedAt.getTime() : -1);
        dest.writeSerializable(this.creator);
    }

    public ShareMediaMetaData() {
    }

    protected ShareMediaMetaData(Parcel in) {
        this.uid = in.readString();
        this.tags = in.createStringArrayList();
        this.ownerId = (Long) in.readValue(Long.class.getClassLoader());
        this.ownerType = in.readString();
        this.title = in.readString();
        this.description = in.readString();
        long tmpCreateAt = in.readLong();
        this.createAt = tmpCreateAt == -1 ? null : new Date(tmpCreateAt);
        this.originalFilename = in.readString();
        long tmpModifiedAt = in.readLong();
        this.modifiedAt = tmpModifiedAt == -1 ? null : new Date(tmpModifiedAt);
        this.creator = (com.percolate.sdk.dto.Creator) in.readSerializable();
    }

    public static final Creator<ShareMediaMetaData> CREATOR = new Creator<ShareMediaMetaData>() {
        public ShareMediaMetaData createFromParcel(Parcel source) {
            return new ShareMediaMetaData(source);
        }

        public ShareMediaMetaData[] newArray(int size) {
            return new ShareMediaMetaData[size];
        }
    };
}

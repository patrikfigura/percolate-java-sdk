package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;
import com.percolate.sdk.dto.Media;
import com.percolate.sdk.dto.ShareLink;
import com.percolate.sdk.dto.ShareUgcMeta;
import com.percolate.sdk.dto.ShareUser;

import java.util.Date;

/**
 * Android version of {@link com.percolate.sdk.dto.ShareObject}.  Implements {@link Parcelable}
 */
public class ShareObject extends com.percolate.sdk.dto.ShareObject implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.UID);
        dest.writeLong(createdAt != null ? createdAt.getTime() : -1);
        dest.writeSerializable(this.localCreatedAt);
        dest.writeSerializable(this.link);
        dest.writeSerializable(this.owner);
        dest.writeString(this.ownerUID);
        dest.writeString(this.type);
        dest.writeSerializable(this.image);
        dest.writeSerializable(this.ugcMeta);
    }

    public ShareObject() {
    }

    protected ShareObject(Parcel in) {
        this.UID = in.readString();
        long tmpCreatedAt = in.readLong();
        this.createdAt = tmpCreatedAt == -1 ? null : new Date(tmpCreatedAt);
        this.localCreatedAt = (com.percolate.sdk.dto.LocalCreatedAt) in.readSerializable();
        this.link = (ShareLink) in.readSerializable();
        this.owner = (ShareUser) in.readSerializable();
        this.ownerUID = in.readString();
        this.type = in.readString();
        this.image = (Media) in.readSerializable();
        this.ugcMeta = (ShareUgcMeta) in.readSerializable();
    }

    public static final Creator<ShareObject> CREATOR = new Creator<ShareObject>() {
        public ShareObject createFromParcel(Parcel source) {
            return new ShareObject(source);
        }

        public ShareObject[] newArray(int size) {
            return new ShareObject[size];
        }
    };
}

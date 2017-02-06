package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.Asset}.  Implements {@link Parcelable}
 */
public class Asset extends com.percolate.sdk.dto.Asset implements Parcelable {
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
        dest.writeString(this.contentType);
        dest.writeString(this.folderId);
        dest.writeString(this.filename);
        dest.writeString(this.creatorId);
        dest.writeValue(this.size);
        dest.writeValue(this.deleted);
        dest.writeString(this.createdThrough);
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
        dest.writeSerializable(this.ext);
        dest.writeMap(this.extraFields);
    }

    public Asset() {
    }

    protected Asset(Parcel in) {
        this.id = in.readString();
        this.scopeId = in.readString();
        this.status = in.readString();
        this.type = in.readString();
        this.contentType = in.readString();
        this.folderId = in.readString();
        this.filename = in.readString();
        this.creatorId = in.readString();
        this.size = (Long) in.readValue(Long.class.getClassLoader());
        this.deleted = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.createdThrough = in.readString();
        this.createdAt = in.readString();
        this.updatedAt = in.readString();
        this.ext = (com.percolate.sdk.dto.AssetExt) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Asset> CREATOR = new Creator<Asset>() {
        @Override
        public Asset createFromParcel(Parcel source) {
            return new Asset(source);
        }

        @Override
        public Asset[] newArray(int size) {
            return new Asset[size];
        }
    };
}

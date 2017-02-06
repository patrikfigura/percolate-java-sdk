package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.Folder}.  Implements {@link Parcelable}
 */
public class Folder extends com.percolate.sdk.dto.Folder implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.scopeId);
        dest.writeString(this.parentId);
        dest.writeStringList(this.pathIds);
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeValue(this.deleted);
        dest.writeValue(this.childCount);
        dest.writeValue(this.assetCount);
        dest.writeString(this.creatorId);
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
        dest.writeMap(this.extraFields);
    }

    public Folder() {
    }

    protected Folder(Parcel in) {
        this.id = in.readString();
        this.scopeId = in.readString();
        this.parentId = in.readString();
        this.pathIds = in.createStringArrayList();
        this.name = in.readString();
        this.description = in.readString();
        this.deleted = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.childCount = (Integer) in.readValue(Integer.class.getClassLoader());
        this.assetCount = (Integer) in.readValue(Integer.class.getClassLoader());
        this.creatorId = in.readString();
        this.createdAt = in.readString();
        this.updatedAt = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Folder> CREATOR = new Creator<Folder>() {
        @Override
        public Folder createFromParcel(Parcel source) {
            return new Folder(source);
        }

        @Override
        public Folder[] newArray(int size) {
            return new Folder[size];
        }
    };
}

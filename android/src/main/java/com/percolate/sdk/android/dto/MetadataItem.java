package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.MetadataItem}.  Implements {@link Parcelable}
 */
public class MetadataItem extends com.percolate.sdk.dto.MetadataItem implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.objectId);
        dest.writeString(this.schemaId);
        this.ext = new LinkedHashMap<>();
        dest.writeMap(this.ext);
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
        dest.writeMap(this.extraFields);
    }

    public MetadataItem() {
    }

    protected MetadataItem(Parcel in) {
        this.id = in.readString();
        this.objectId = in.readString();
        this.schemaId = in.readString();
        in.readMap(this.ext, LinkedHashMap.class.getClassLoader());
        this.createdAt = in.readString();
        this.updatedAt = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<MetadataItem> CREATOR = new Creator<MetadataItem>() {
        public MetadataItem createFromParcel(Parcel source) {
            return new MetadataItem(source);
        }

        public MetadataItem[] newArray(int size) {
            return new MetadataItem[size];
        }
    };
}

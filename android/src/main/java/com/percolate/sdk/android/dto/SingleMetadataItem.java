package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.SingleMetadataItem}.  Implements {@link Parcelable}
 */
public class SingleMetadataItem extends com.percolate.sdk.dto.SingleMetadataItem implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.meta);
        dest.writeSerializable(this.MetadataItem);
        dest.writeMap(this.extraFields);
    }

    public SingleMetadataItem() {
    }

    protected SingleMetadataItem(Parcel in) {
        this.meta = (com.percolate.sdk.dto.V5Meta) in.readSerializable();
        this.MetadataItem = (com.percolate.sdk.dto.MetadataItem) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<SingleMetadataItem> CREATOR = new Creator<SingleMetadataItem>() {
        public SingleMetadataItem createFromParcel(Parcel source) {
            return new SingleMetadataItem(source);
        }

        public SingleMetadataItem[] newArray(int size) {
            return new SingleMetadataItem[size];
        }
    };
}

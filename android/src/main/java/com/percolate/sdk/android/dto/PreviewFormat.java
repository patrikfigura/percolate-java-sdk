package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.PreviewFormat}.  Implements {@link Parcelable}
 */
public class PreviewFormat extends com.percolate.sdk.dto.PreviewFormat implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.activePreviewTemplateId);
        dest.writeString(this.disabledAt);
        dest.writeString(this.label);
        dest.writeString(this.schemaId);
        dest.writeString(this.updatedAt);
        dest.writeMap(this.extraFields);
    }

    public PreviewFormat() {
    }

    protected PreviewFormat(Parcel in) {
        this.id = in.readString();
        this.activePreviewTemplateId = in.readString();
        this.disabledAt = in.readString();
        this.label = in.readString();
        this.schemaId = in.readString();
        this.updatedAt = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<PreviewFormat> CREATOR = new Creator<PreviewFormat>() {
        @Override
        public PreviewFormat createFromParcel(Parcel source) {
            return new PreviewFormat(source);
        }

        @Override
        public PreviewFormat[] newArray(int size) {
            return new PreviewFormat[size];
        }
    };
}

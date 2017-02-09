package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.Variant}.  Implements {@link Parcelable}
 */
public class Variant extends com.percolate.sdk.dto.Variant implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.type);
        dest.writeString(this.contentType);
        dest.writeValue(this.size);
        dest.writeSerializable(this.ext);
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
        dest.writeMap(this.extraFields);
    }

    public Variant() {
    }

    protected Variant(Parcel in) {
        this.id = in.readString();
        this.type = in.readString();
        this.contentType = in.readString();
        this.size = (Long) in.readValue(Long.class.getClassLoader());
        this.ext = (com.percolate.sdk.dto.VariantExt) in.readSerializable();
        this.createdAt = in.readString();
        this.updatedAt = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Variant> CREATOR = new Creator<Variant>() {
        @Override
        public Variant createFromParcel(Parcel source) {
            return new Variant(source);
        }

        @Override
        public Variant[] newArray(int size) {
            return new Variant[size];
        }
    };
}

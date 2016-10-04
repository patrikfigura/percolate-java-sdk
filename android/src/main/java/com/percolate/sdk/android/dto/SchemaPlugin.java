package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

/**
 * Android version of {@link com.percolate.sdk.dto.SchemaPlugin}.  Implements {@link Parcelable}
 */
public class SchemaPlugin extends com.percolate.sdk.dto.SchemaPlugin implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.key);
        dest.writeString(this.type);
        dest.writeString(this.fieldKey);
        this.ext = new LinkedHashMap<>();
        dest.writeMap(this.ext);
        dest.writeMap(this.extraFields);
    }

    public SchemaPlugin() {
    }

    protected SchemaPlugin(Parcel in) {
        this.key = in.readString();
        this.type = in.readString();
        this.fieldKey = in.readString();
        in.readMap(this.ext, LinkedHashMap.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<SchemaPlugin> CREATOR = new Creator<SchemaPlugin>() {
        public SchemaPlugin createFromParcel(Parcel source) {
            return new SchemaPlugin(source);
        }

        public SchemaPlugin[] newArray(int size) {
            return new SchemaPlugin[size];
        }
    };
}

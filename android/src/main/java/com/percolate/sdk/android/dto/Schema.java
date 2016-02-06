package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Schema}.  Implements {@link Parcelable}
 */
public class Schema extends com.percolate.sdk.dto.Schema implements Parcelable {
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
        dest.writeString(this.name);
        dest.writeList(this.fields);
        dest.writeList(this.plugins);
        dest.writeList(this.fieldsets);
        dest.writeMap(this.ext);
        dest.writeString(this.updated_at);
    }

    public Schema() {
    }

    protected Schema(Parcel in) {
        this.id = in.readString();
        this.scopeId = in.readString();
        this.status = in.readString();
        this.type = in.readString();
        this.name = in.readString();
        this.fields = new ArrayList<com.percolate.sdk.dto.SchemaField>();
        in.readList(this.fields, List.class.getClassLoader());
        this.plugins = new ArrayList<Object>();
        in.readList(this.plugins, List.class.getClassLoader());
        this.fieldsets = new ArrayList<Object>();
        in.readList(this.fieldsets, List.class.getClassLoader());
        in.readMap(this.ext, LinkedHashMap.class.getClassLoader());
        this.updated_at = in.readString();
    }

    public static final Creator<Schema> CREATOR = new Creator<Schema>() {
        public Schema createFromParcel(Parcel source) {
            return new Schema(source);
        }

        public Schema[] newArray(int size) {
            return new Schema[size];
        }
    };
}

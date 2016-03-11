package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.SingleSchema}.  Implements {@link Parcelable}
 */
public class SingleSchema extends com.percolate.sdk.dto.SingleSchema implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public SingleSchema() {
    }

    protected SingleSchema(Parcel in) {
        this.data = (com.percolate.sdk.dto.Schema) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<SingleSchema> CREATOR = new Creator<SingleSchema>() {
        public SingleSchema createFromParcel(Parcel source) {
            return new SingleSchema(source);
        }

        public SingleSchema[] newArray(int size) {
            return new SingleSchema[size];
        }
    };
}

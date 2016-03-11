package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.Schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Schemas}.  Implements {@link Parcelable}
 */
public class Schemas extends com.percolate.sdk.dto.Schemas implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.meta);
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    public Schemas() {
    }

    protected Schemas(Parcel in) {
        this.meta = (com.percolate.sdk.dto.V5Meta) in.readSerializable();
        this.data = new ArrayList<Schema>();
        in.readList(this.data, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Schemas> CREATOR = new Creator<Schemas>() {
        public Schemas createFromParcel(Parcel source) {
            return new Schemas(source);
        }

        public Schemas[] newArray(int size) {
            return new Schemas[size];
        }
    };
}

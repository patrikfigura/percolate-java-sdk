package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.License;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Licenses}.  Implements {@link Parcelable}
 */
public class Licenses extends com.percolate.sdk.dto.Licenses implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.paginationData);
        dest.writeList(this.licenses);
        dest.writeMap(this.extraFields);
    }

    public Licenses() {
    }

    protected Licenses(Parcel in) {
        this.paginationData = (com.percolate.sdk.dto.PaginationData) in.readSerializable();
        this.licenses = new ArrayList<License>();
        in.readList(this.licenses, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Licenses> CREATOR = new Creator<Licenses>() {
        public Licenses createFromParcel(Parcel source) {
            return new Licenses(source);
        }

        public Licenses[] newArray(int size) {
            return new Licenses[size];
        }
    };
}

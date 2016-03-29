package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.AuthorizeData}.  Implements {@link Parcelable}
 */
public class AuthorizeData extends com.percolate.sdk.dto.AuthorizeData implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.userId);
        dest.writeString(this.type);
        dest.writeSerializable(this.ext);
        dest.writeString(this.updatedAt);
        dest.writeList(this.errors);
        dest.writeMap(this.extraFields);
    }

    public AuthorizeData() {
    }

    protected AuthorizeData(Parcel in) {
        this.id = in.readString();
        this.userId = in.readString();
        this.type = in.readString();
        this.ext = (com.percolate.sdk.dto.AuthorizeDataExt) in.readSerializable();
        this.updatedAt = in.readString();
        this.errors = new ArrayList<>();
        in.readList(this.errors, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<AuthorizeData> CREATOR = new Creator<AuthorizeData>() {
        public AuthorizeData createFromParcel(Parcel source) {
            return new AuthorizeData(source);
        }

        public AuthorizeData[] newArray(int size) {
            return new AuthorizeData[size];
        }
    };
}

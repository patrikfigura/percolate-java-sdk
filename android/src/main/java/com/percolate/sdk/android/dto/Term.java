package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.Term}.  Implements {@link Parcelable}
 */
public class Term extends com.percolate.sdk.dto.Term implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.namespace);
        dest.writeString(this.scopeId);
        dest.writeString(this.updatedAt);
        dest.writeMap(this.extraFields);
    }

    public Term() {
    }

    protected Term(Parcel in) {
        this.id = in.readString();
        this.name = in.readString();
        this.namespace = in.readString();
        this.scopeId = in.readString();
        this.updatedAt = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Term> CREATOR = new Creator<Term>() {
        public Term createFromParcel(Parcel source) {
            return new Term(source);
        }

        public Term[] newArray(int size) {
            return new Term[size];
        }
    };
}

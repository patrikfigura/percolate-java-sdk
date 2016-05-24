package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.Role}.  Implements {@link Parcelable}
 */
public class Role extends com.percolate.sdk.dto.Role implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.code);
        dest.writeString(this.description);
        dest.writeStringList(this.capabilities);
        dest.writeString(this.scopeId);
        dest.writeString(this.updatedAt);
        dest.writeMap(this.extraFields);
    }

    public Role() {
    }

    protected Role(Parcel in) {
        this.id = in.readString();
        this.name = in.readString();
        this.code = in.readString();
        this.description = in.readString();
        this.capabilities = in.createStringArrayList();
        this.scopeId = in.readString();
        this.updatedAt = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Role> CREATOR = new Creator<Role>() {
        public Role createFromParcel(Parcel source) {
            return new Role(source);
        }

        public Role[] newArray(int size) {
            return new Role[size];
        }
    };
}

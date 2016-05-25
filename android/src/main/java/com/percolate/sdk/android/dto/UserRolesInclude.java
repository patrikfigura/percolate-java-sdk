package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.UserRolesInclude}.  Implements {@link Parcelable}
 */
public class UserRolesInclude extends com.percolate.sdk.dto.UserRolesInclude implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.role);
        dest.writeMap(this.extraFields);
    }

    public UserRolesInclude() {
    }

    protected UserRolesInclude(Parcel in) {
        this.role = new ArrayList<>();
        in.readList(this.role, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<UserRolesInclude> CREATOR = new Creator<UserRolesInclude>() {
        public UserRolesInclude createFromParcel(Parcel source) {
            return new UserRolesInclude(source);
        }

        public UserRolesInclude[] newArray(int size) {
            return new UserRolesInclude[size];
        }
    };
}

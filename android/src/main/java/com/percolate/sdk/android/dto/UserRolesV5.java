package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.UserRolesInclude;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.UserRolesV5}.  Implements {@link Parcelable}
 */
public class UserRolesV5 extends com.percolate.sdk.dto.UserRolesV5 implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.meta);
        dest.writeSerializable(this.include);
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    public UserRolesV5() {
    }

    protected UserRolesV5(Parcel in) {
        this.meta = (com.percolate.sdk.dto.V5Meta) in.readSerializable();
        this.include = (UserRolesInclude) in.readSerializable();
        this.data = new ArrayList<>();
        in.readList(this.data, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<UserRolesV5> CREATOR = new Creator<UserRolesV5>() {
        public UserRolesV5 createFromParcel(Parcel source) {
            return new UserRolesV5(source);
        }

        public UserRolesV5[] newArray(int size) {
            return new UserRolesV5[size];
        }
    };
}

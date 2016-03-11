package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Users}.  Implements {@link Parcelable}
 */
public class Users extends com.percolate.sdk.dto.Users implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.paginationData);
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    public Users() {
    }

    protected Users(Parcel in) {
        this.paginationData = (com.percolate.sdk.dto.PaginationData) in.readSerializable();
        this.data = new ArrayList<User>();
        in.readList(this.data, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<Users> CREATOR = new Creator<Users>() {
        public Users createFromParcel(Parcel source) {
            return new Users(source);
        }

        public Users[] newArray(int size) {
            return new Users[size];
        }
    };
}

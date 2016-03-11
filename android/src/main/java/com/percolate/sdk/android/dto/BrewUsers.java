package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.BrewUsers}.  Implements {@link Parcelable}
 */
public class BrewUsers extends com.percolate.sdk.dto.BrewUsers implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.paginationData);
        dest.writeList(this.users);
        dest.writeMap(this.extraFields);
    }

    public BrewUsers() {
    }

    protected BrewUsers(Parcel in) {
        this.paginationData = (com.percolate.sdk.dto.PaginationData) in.readSerializable();
        this.users = new ArrayList<User>();
        in.readList(this.users, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<BrewUsers> CREATOR = new Creator<BrewUsers>() {
        public BrewUsers createFromParcel(Parcel source) {
            return new BrewUsers(source);
        }

        public BrewUsers[] newArray(int size) {
            return new BrewUsers[size];
        }
    };
}

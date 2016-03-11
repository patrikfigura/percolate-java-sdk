package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.ChangePasswordError}.  Implements {@link Parcelable}
 */
public class ChangePasswordError extends com.percolate.sdk.dto.ChangePasswordError implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.errors);
        dest.writeMap(this.extraFields);
    }

    public ChangePasswordError() {
    }

    protected ChangePasswordError(Parcel in) {
        this.errors = new ArrayList<LinkedHashMap<String, Object>>();
        in.readList(this.errors, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<ChangePasswordError> CREATOR = new Creator<ChangePasswordError>() {
        public ChangePasswordError createFromParcel(Parcel source) {
            return new ChangePasswordError(source);
        }

        public ChangePasswordError[] newArray(int size) {
            return new ChangePasswordError[size];
        }
    };
}

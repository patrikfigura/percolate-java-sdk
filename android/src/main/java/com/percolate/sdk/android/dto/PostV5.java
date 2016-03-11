package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.PostV5Data;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.PostV5}.  Implements {@link Parcelable}
 */
public class PostV5 extends com.percolate.sdk.dto.PostV5 implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.include);
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public PostV5() {
    }

    protected PostV5(Parcel in) {
        this.include = (com.percolate.sdk.dto.PostV5Include) in.readSerializable();
        this.data = (PostV5Data) in.readSerializable();
        this.errors = new ArrayList<>();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<PostV5> CREATOR = new Creator<PostV5>() {
        public PostV5 createFromParcel(Parcel source) {
            return new PostV5(source);
        }

        public PostV5[] newArray(int size) {
            return new PostV5[size];
        }
    };
}

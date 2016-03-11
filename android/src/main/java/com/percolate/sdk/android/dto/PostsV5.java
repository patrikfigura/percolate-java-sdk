package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.PostV5Data;
import com.percolate.sdk.dto.PostV5Include;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.PostsV5}.  Implements {@link Parcelable}
 */
public class PostsV5 extends com.percolate.sdk.dto.PostsV5 implements Parcelable {
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

    public PostsV5() {
    }

    protected PostsV5(Parcel in) {
        this.meta = (com.percolate.sdk.dto.V5Meta) in.readSerializable();
        this.include = (PostV5Include) in.readSerializable();
        this.data = new ArrayList<PostV5Data>();
        in.readList(this.data, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<PostsV5> CREATOR = new Creator<PostsV5>() {
        public PostsV5 createFromParcel(Parcel source) {
            return new PostsV5(source);
        }

        public PostsV5[] newArray(int size) {
            return new PostsV5[size];
        }
    };
}

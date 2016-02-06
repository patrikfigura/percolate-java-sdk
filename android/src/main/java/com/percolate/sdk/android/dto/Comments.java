package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;
import com.percolate.sdk.dto.CommentsInclude;

import java.util.ArrayList;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Comments}.  Implements {@link Parcelable}
 */
public class Comments extends com.percolate.sdk.dto.Comments implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.comments);
        dest.writeSerializable(this.include);
    }

    public Comments() {
    }

    protected Comments(Parcel in) {
        this.comments = new ArrayList<com.percolate.sdk.dto.Comment>();
        in.readList(this.comments, List.class.getClassLoader());
        this.include = (CommentsInclude) in.readSerializable();
    }

    public static final Creator<Comments> CREATOR = new Creator<Comments>() {
        public Comments createFromParcel(Parcel source) {
            return new Comments(source);
        }

        public Comments[] newArray(int size) {
            return new Comments[size];
        }
    };
}

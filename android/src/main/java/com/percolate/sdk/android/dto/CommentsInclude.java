package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.CommentsInclude}.  Implements {@link Parcelable}
 */
public class CommentsInclude extends com.percolate.sdk.dto.CommentsInclude implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.users);
    }

    public CommentsInclude() {
    }

    protected CommentsInclude(Parcel in) {
        this.users = new ArrayList<com.percolate.sdk.dto.User>();
        in.readList(this.users, List.class.getClassLoader());
    }

    public static final Creator<CommentsInclude> CREATOR = new Creator<CommentsInclude>() {
        public CommentsInclude createFromParcel(Parcel source) {
            return new CommentsInclude(source);
        }

        public CommentsInclude[] newArray(int size) {
            return new CommentsInclude[size];
        }
    };
}

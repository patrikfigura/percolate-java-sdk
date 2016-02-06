package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;

/**
 * Android version of {@link com.percolate.sdk.dto.CommentData}.  Implements {@link Parcelable}
 */
public class CommentData extends com.percolate.sdk.dto.CommentData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.comment);
    }

    public CommentData() {
    }

    protected CommentData(Parcel in) {
        this.comment = (com.percolate.sdk.dto.Comment) in.readSerializable();
    }

    public static final Creator<CommentData> CREATOR = new Creator<CommentData>() {
        public CommentData createFromParcel(Parcel source) {
            return new CommentData(source);
        }

        public CommentData[] newArray(int size) {
            return new CommentData[size];
        }
    };
}

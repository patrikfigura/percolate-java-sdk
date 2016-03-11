package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.CommentContextExt}.  Implements {@link Parcelable}
 */
public class CommentContextExt extends com.percolate.sdk.dto.CommentContextExt implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.x);
        dest.writeValue(this.y);
        dest.writeString(this.unit);
        dest.writeMap(this.extraFields);
    }

    public CommentContextExt() {
    }

    protected CommentContextExt(Parcel in) {
        this.x = (Double) in.readValue(Double.class.getClassLoader());
        this.y = (Double) in.readValue(Double.class.getClassLoader());
        this.unit = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<CommentContextExt> CREATOR = new Creator<CommentContextExt>() {
        public CommentContextExt createFromParcel(Parcel source) {
            return new CommentContextExt(source);
        }

        public CommentContextExt[] newArray(int size) {
            return new CommentContextExt[size];
        }
    };
}

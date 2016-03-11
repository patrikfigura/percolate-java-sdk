package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.CommentContextExt;
import com.percolate.sdk.dto.Mention;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Comment}.  Implements {@link Parcelable}
 */
public class Comment extends com.percolate.sdk.dto.Comment implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.user);
        dest.writeString(this.uid);
        dest.writeString(this.objectUID);
        dest.writeString(this.body);
        dest.writeList(this.mentions);
        dest.writeString(this.userUID);
        dest.writeString(this.scopeUID);
        dest.writeString(this.contextType);
        dest.writeSerializable(this.contextExt);
        dest.writeString(this.updatedAt);
        dest.writeMap(this.extraFields);
    }

    public Comment() {
    }

    protected Comment(Parcel in) {
        this.user = (com.percolate.sdk.dto.User) in.readSerializable();
        this.uid = in.readString();
        this.objectUID = in.readString();
        this.body = in.readString();
        this.mentions = new ArrayList<Mention>();
        in.readList(this.mentions, List.class.getClassLoader());
        this.userUID = in.readString();
        this.scopeUID = in.readString();
        this.contextType = in.readString();
        this.contextExt = (CommentContextExt) in.readSerializable();
        this.updatedAt = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Comment> CREATOR = new Creator<Comment>() {
        public Comment createFromParcel(Parcel source) {
            return new Comment(source);
        }

        public Comment[] newArray(int size) {
            return new Comment[size];
        }
    };
}

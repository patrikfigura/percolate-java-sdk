package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.percolate.sdk.dto.PostAttachmentData;
import com.percolate.sdk.dto.V5Meta;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.PostAttachment}.  Implements {@link Parcelable}
 */
public class PostAttachment extends com.percolate.sdk.dto.PostAttachment implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.meta);
        dest.writeList(this.data);
        dest.writeList(this.errors);
        dest.writeMap(this.extraFields);
    }

    public PostAttachment() {
    }

    protected PostAttachment(Parcel in) {
        this.meta = (V5Meta) in.readSerializable();
        this.data = new ArrayList<>();
        in.readList(this.data, PostAttachmentData.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<PostAttachment> CREATOR = new Creator<PostAttachment>() {
        @Override
        public PostAttachment createFromParcel(Parcel source) {
            return new PostAttachment(source);
        }

        @Override
        public PostAttachment[] newArray(int size) {
            return new PostAttachment[size];
        }
    };
}

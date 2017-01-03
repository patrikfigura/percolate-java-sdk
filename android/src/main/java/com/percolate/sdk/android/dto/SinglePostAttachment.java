package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.percolate.sdk.dto.PostAttachmentData;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.SinglePostAttachment}.  Implements {@link Parcelable}
 */
public class SinglePostAttachment extends com.percolate.sdk.dto.SinglePostAttachment implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public SinglePostAttachment() {
    }

    protected SinglePostAttachment(Parcel in) {
        this.data = (PostAttachmentData) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<SinglePostAttachment> CREATOR = new Creator<SinglePostAttachment>() {
        @Override
        public SinglePostAttachment createFromParcel(Parcel source) {
            return new SinglePostAttachment(source);
        }

        @Override
        public SinglePostAttachment[] newArray(int size) {
            return new SinglePostAttachment[size];
        }
    };
}

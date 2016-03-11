package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.FacebookMention}.  Implements {@link Parcelable}
 */
public class FacebookMention extends com.percolate.sdk.dto.FacebookMention implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeSerializable(this.picture);
        dest.writeMap(this.extraFields);
    }

    public FacebookMention() {
    }

    protected FacebookMention(Parcel in) {
        this.id = in.readString();
        this.name = in.readString();
        this.picture = (com.percolate.sdk.dto.FacebookMentionPicture) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<FacebookMention> CREATOR = new Creator<FacebookMention>() {
        public FacebookMention createFromParcel(Parcel source) {
            return new FacebookMention(source);
        }

        public FacebookMention[] newArray(int size) {
            return new FacebookMention[size];
        }
    };
}

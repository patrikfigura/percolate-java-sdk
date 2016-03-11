package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.FacebookMentions}.  Implements {@link Parcelable}
 */
public class FacebookMentions extends com.percolate.sdk.dto.FacebookMentions implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.mentions);
        dest.writeMap(this.extraFields);
    }

    public FacebookMentions() {
    }

    protected FacebookMentions(Parcel in) {
        this.mentions = new ArrayList<com.percolate.sdk.dto.FacebookMention>();
        in.readList(this.mentions, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<FacebookMentions> CREATOR = new Creator<FacebookMentions>() {
        public FacebookMentions createFromParcel(Parcel source) {
            return new FacebookMentions(source);
        }

        public FacebookMentions[] newArray(int size) {
            return new FacebookMentions[size];
        }
    };
}

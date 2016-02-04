package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;

/**
 * Android version of {@link com.percolate.sdk.dto.TwitterRelationships}.  Implements {@link Parcelable}
 */
public class TwitterRelationships extends com.percolate.sdk.dto.TwitterRelationships implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.relationship);
    }

    public TwitterRelationships() {
    }

    protected TwitterRelationships(Parcel in) {
        this.relationship = (com.percolate.sdk.dto.TwitterRelationship) in.readSerializable();
    }

    public static final Creator<TwitterRelationships> CREATOR = new Creator<TwitterRelationships>() {
        public TwitterRelationships createFromParcel(Parcel source) {
            return new TwitterRelationships(source);
        }

        public TwitterRelationships[] newArray(int size) {
            return new TwitterRelationships[size];
        }
    };
}

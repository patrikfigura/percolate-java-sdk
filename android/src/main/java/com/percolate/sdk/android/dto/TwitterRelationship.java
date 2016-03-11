package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.TwitterRelationshipStatus;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.TwitterRelationship}.  Implements {@link Parcelable}
 */
public class TwitterRelationship extends com.percolate.sdk.dto.TwitterRelationship implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.source);
        dest.writeSerializable(this.target);
        dest.writeMap(this.extraFields);
    }

    public TwitterRelationship() {
    }

    protected TwitterRelationship(Parcel in) {
        this.source = (com.percolate.sdk.dto.TwitterRelationshipStatus) in.readSerializable();
        this.target = (TwitterRelationshipStatus) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<TwitterRelationship> CREATOR = new Creator<TwitterRelationship>() {
        public TwitterRelationship createFromParcel(Parcel source) {
            return new TwitterRelationship(source);
        }

        public TwitterRelationship[] newArray(int size) {
            return new TwitterRelationship[size];
        }
    };
}

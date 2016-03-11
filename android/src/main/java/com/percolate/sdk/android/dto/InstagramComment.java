package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.InstagramUserData;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.InstagramComment}.  Implements {@link Parcelable}
 */
public class InstagramComment extends com.percolate.sdk.dto.InstagramComment implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.instagramMonitoringObject);
        dest.writeString(this.id);
        dest.writeString(this.text);
        dest.writeSerializable(this.from);
        dest.writeString(this.createdTime);
        dest.writeMap(this.extraFields);
    }

    public InstagramComment() {
    }

    protected InstagramComment(Parcel in) {
        this.instagramMonitoringObject = (com.percolate.sdk.dto.InstagramMonitoringObject) in.readSerializable();
        this.id = in.readString();
        this.text = in.readString();
        this.from = (InstagramUserData) in.readSerializable();
        this.createdTime = in.readString();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<InstagramComment> CREATOR = new Creator<InstagramComment>() {
        public InstagramComment createFromParcel(Parcel source) {
            return new InstagramComment(source);
        }

        public InstagramComment[] newArray(int size) {
            return new InstagramComment[size];
        }
    };
}

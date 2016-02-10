package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;
import com.percolate.sdk.dto.Tweet;

import java.util.ArrayList;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.TwitterMonitoringObject}.  Implements {@link Parcelable}
 */
public class TwitterMonitoringObject extends com.percolate.sdk.dto.TwitterMonitoringObject implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(fromTwitterSearchQuery ? (byte) 1 : (byte) 0);
        dest.writeSerializable(this.flag);
        dest.writeByte(wasFromMonitoringTab ? (byte) 1 : (byte) 0);
        dest.writeString(this.id);
        this.activity = new ArrayList<>();
        dest.writeList(this.activity);
        dest.writeValue(this.authorInfluencerScore);
        dest.writeSerializable(this.tweet);
    }

    public TwitterMonitoringObject() {
    }

    protected TwitterMonitoringObject(Parcel in) {
        this.fromTwitterSearchQuery = in.readByte() != 0;
        this.flag = (com.percolate.sdk.dto.Flag) in.readSerializable();
        this.wasFromMonitoringTab = in.readByte() != 0;
        this.id = in.readString();
        this.activity = new ArrayList<Object>();
        in.readList(this.activity, List.class.getClassLoader());
        this.authorInfluencerScore = (Long) in.readValue(Long.class.getClassLoader());
        this.tweet = (Tweet) in.readSerializable();
    }

    public static final Creator<TwitterMonitoringObject> CREATOR = new Creator<TwitterMonitoringObject>() {
        public TwitterMonitoringObject createFromParcel(Parcel source) {
            return new TwitterMonitoringObject(source);
        }

        public TwitterMonitoringObject[] newArray(int size) {
            return new TwitterMonitoringObject[size];
        }
    };
}

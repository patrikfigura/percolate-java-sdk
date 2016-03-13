package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.Tweet;

import java.util.ArrayList;
import java.util.HashMap;
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
        dest.writeString(this.id);
        this.activity = new ArrayList<>();
        dest.writeList(this.activity);
        dest.writeValue(this.authorInfluencerScore);
        dest.writeSerializable(this.tweet);
        dest.writeMap(this.extraFields);
    }

    public TwitterMonitoringObject() {
    }

    protected TwitterMonitoringObject(Parcel in) {
        this.id = in.readString();
        this.activity = new ArrayList<Object>();
        in.readList(this.activity, List.class.getClassLoader());
        this.authorInfluencerScore = (Long) in.readValue(Long.class.getClassLoader());
        this.tweet = (Tweet) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
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

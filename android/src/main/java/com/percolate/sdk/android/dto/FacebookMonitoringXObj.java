package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.FacebookMonitoringXObj}.  Implements {@link Parcelable}
 */
public class FacebookMonitoringXObj extends com.percolate.sdk.dto.FacebookMonitoringXObj implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.body);
        dest.writeString(this.createdAt);
        dest.writeValue(this.numChildren);
        dest.writeValue(this.numLikes);
        dest.writeValue(this.numShares);
        dest.writeString(this.parentId);
        dest.writeString(this.permalink);
        dest.writeString(this.picture);
        dest.writeString(this.thumbnail);
        dest.writeString(this.type);
        dest.writeSerializable(this.user);
        dest.writeMap(this.extraFields);
    }

    public FacebookMonitoringXObj() {
    }

    protected FacebookMonitoringXObj(Parcel in) {
        this.id = in.readString();
        this.body = in.readString();
        this.createdAt = in.readString();
        this.numChildren = (Integer) in.readValue(Integer.class.getClassLoader());
        this.numLikes = (Integer) in.readValue(Integer.class.getClassLoader());
        this.numShares = (Integer) in.readValue(Integer.class.getClassLoader());
        this.parentId = in.readString();
        this.permalink = in.readString();
        this.picture = in.readString();
        this.thumbnail = in.readString();
        this.type = in.readString();
        this.user = (com.percolate.sdk.dto.FacebookMonitoringUser) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<FacebookMonitoringXObj> CREATOR = new Creator<FacebookMonitoringXObj>() {
        public FacebookMonitoringXObj createFromParcel(Parcel source) {
            return new FacebookMonitoringXObj(source);
        }

        public FacebookMonitoringXObj[] newArray(int size) {
            return new FacebookMonitoringXObj[size];
        }
    };
}

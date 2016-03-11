package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.FacebookMonitoringXObj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.FacebookMonitoringObject}.  Implements {@link Parcelable}
 */
public class FacebookMonitoringObject extends com.percolate.sdk.dto.FacebookMonitoringObject implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.flag);
        dest.writeByte(wasFromMonitoringTab ? (byte) 1 : (byte) 0);
        dest.writeString(this.id);
        dest.writeList(this.activity);
        dest.writeString(this.relatedPostSetId);
        dest.writeSerializable(this.xobj);
        dest.writeMap(this.extraFields);
    }

    public FacebookMonitoringObject() {
    }

    protected FacebookMonitoringObject(Parcel in) {
        this.flag = (com.percolate.sdk.dto.Flag) in.readSerializable();
        this.wasFromMonitoringTab = in.readByte() != 0;
        this.id = in.readString();
        this.activity = new ArrayList<>();
        in.readList(this.activity, List.class.getClassLoader());
        this.relatedPostSetId = in.readString();
        this.xobj = (FacebookMonitoringXObj) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<FacebookMonitoringObject> CREATOR = new Creator<FacebookMonitoringObject>() {
        public FacebookMonitoringObject createFromParcel(Parcel source) {
            return new FacebookMonitoringObject(source);
        }

        public FacebookMonitoringObject[] newArray(int size) {
            return new FacebookMonitoringObject[size];
        }
    };
}

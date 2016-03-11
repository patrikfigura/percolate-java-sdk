package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.ActivityStreamMetadata;
import com.percolate.sdk.dto.Mention;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Android version of {@link com.percolate.sdk.dto.ActivityStreamData}.  Implements {@link Parcelable}
 */
public class ActivityStreamData extends com.percolate.sdk.dto.ActivityStreamData implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeMap(this.metaDataMap);
        dest.writeString(this.relatedObjectUid);
        dest.writeString(this.relatedObjectPreview);
        dest.writeString(this.objectUid);
        dest.writeSerializable(this.user);
        dest.writeString(this.objectPreview);
        dest.writeValue(this.userId);
        dest.writeString(this.createdAt);
        dest.writeValue(this.licenseId);
        dest.writeString(this.type);
        dest.writeList(this.metadataList);
        dest.writeList(this.mentions);
        dest.writeMap(this.extraFields);
    }

    public ActivityStreamData() {
    }

    protected ActivityStreamData(Parcel in) {
        this.metaDataMap = new HashMap<>();
        in.readMap(this.metaDataMap, Map.class.getClassLoader());
        this.relatedObjectUid = in.readString();
        this.relatedObjectPreview = in.readString();
        this.objectUid = in.readString();
        this.user = (com.percolate.sdk.dto.User) in.readSerializable();
        this.objectPreview = in.readString();
        this.userId = (Integer) in.readValue(Integer.class.getClassLoader());
        this.createdAt = in.readString();
        this.licenseId = (Integer) in.readValue(Integer.class.getClassLoader());
        this.type = in.readString();
        this.metadataList = new ArrayList<ActivityStreamMetadata>();
        in.readList(this.metadataList, List.class.getClassLoader());
        this.mentions = new ArrayList<Mention>();
        in.readList(this.mentions, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<ActivityStreamData> CREATOR = new Creator<ActivityStreamData>() {
        public ActivityStreamData createFromParcel(Parcel source) {
            return new ActivityStreamData(source);
        }

        public ActivityStreamData[] newArray(int size) {
            return new ActivityStreamData[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;
import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.MediaMetaData}.  Implements {@link Parcelable}
 */
public class MediaMetaData extends com.percolate.sdk.dto.MediaMetaData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.licenseId);
        dest.writeString(this.description);
        dest.writeString(this.copyright);
        dest.writeString(this.title);
        dest.writeString(this.createdAt);
        dest.writeStringList(this.tags);
        dest.writeString(this.modifiedAt);
        dest.writeString(this.ingestedFrom);
        dest.writeString(this.originalFilename);
        dest.writeString(this.ownerType);
        dest.writeSerializable(this.creator);
        dest.writeValue(this.ownerId);
        dest.writeLong(subjectDate != null ? subjectDate.getTime() : -1);
        dest.writeValue(isPhoto);
        dest.writeValue(isAdvertising);
        dest.writeValue(hasLogo);
        dest.writeString(this.name);
        dest.writeString(this.parentUID);
        dest.writeString(this.ownerUID);
        dest.writeValue(this.creatorUserId);
        dest.writeValue(this.itemCount);
        dest.writeStringList(this.path);
        dest.writeMap(this.extraFields);
    }

    public MediaMetaData() {
    }

    protected MediaMetaData(Parcel in) {
        this.licenseId = (Long) in.readValue(Long.class.getClassLoader());
        this.description = in.readString();
        this.copyright = in.readString();
        this.title = in.readString();
        this.createdAt = in.readString();
        this.tags = in.createStringArrayList();
        this.modifiedAt = in.readString();
        this.ingestedFrom = in.readString();
        this.originalFilename = in.readString();
        this.ownerType = in.readString();
        this.creator = (com.percolate.sdk.dto.Creator) in.readSerializable();
        this.ownerId = (Long) in.readValue(Long.class.getClassLoader());
        long tmpSubjectDate = in.readLong();
        this.subjectDate = tmpSubjectDate == -1 ? null : new Date(tmpSubjectDate);
        this.isPhoto = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.isAdvertising = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.hasLogo = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.name = in.readString();
        this.parentUID = in.readString();
        this.ownerUID = in.readString();
        this.creatorUserId = (Long) in.readValue(Long.class.getClassLoader());
        this.itemCount = (Integer) in.readValue(Integer.class.getClassLoader());
        this.path = in.createStringArrayList();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<MediaMetaData> CREATOR = new Creator<MediaMetaData>() {
        public MediaMetaData createFromParcel(Parcel source) {
            return new MediaMetaData(source);
        }

        public MediaMetaData[] newArray(int size) {
            return new MediaMetaData[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.Campaign}.  Implements {@link Parcelable}
 */
public class Campaign extends com.percolate.sdk.dto.Campaign implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.startAt);
        dest.writeString(this.endAt);
        dest.writeSerializable(this.budget);
        dest.writeStringList(this.termIds);
        dest.writeString(this.thumbnailAssetId);
        dest.writeStringList(this.topicIds);
        dest.writeStringList(this.platformIds);
        dest.writeString(this.scopeId);
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
        dest.writeMap(this.extraFields);
    }

    public Campaign() {
    }

    protected Campaign(Parcel in) {
        this.id = in.readString();
        this.title = in.readString();
        this.description = in.readString();
        this.startAt = in.readString();
        this.endAt = in.readString();
        this.budget = (com.percolate.sdk.dto.CurrencyValue) in.readSerializable();
        this.termIds = in.createStringArrayList();
        this.thumbnailAssetId = in.readString();
        this.topicIds = in.createStringArrayList();
        this.platformIds = in.createStringArrayList();
        this.scopeId = in.readString();
        this.createdAt = in.readString();
        this.updatedAt = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<Campaign> CREATOR = new Creator<Campaign>() {
        public Campaign createFromParcel(Parcel source) {
            return new Campaign(source);
        }

        public Campaign[] newArray(int size) {
            return new Campaign[size];
        }
    };
}

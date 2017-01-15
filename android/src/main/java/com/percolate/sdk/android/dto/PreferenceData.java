package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.PreferenceData}.  Implements {@link Parcelable}
 */
public class PreferenceData extends com.percolate.sdk.dto.PreferenceData implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.userId);
        dest.writeString(this.name);
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
        this.value = new ArrayList<>();
        dest.writeList(this.value);
        dest.writeString(this.scopeId);
        dest.writeInt(this.extraFields.size());
        dest.writeMap(this.extraFields);
    }

    public PreferenceData() {
    }

    protected PreferenceData(Parcel in) {
        this.id = in.readString();
        this.userId = in.readString();
        this.name = in.readString();
        this.createdAt = in.readString();
        this.updatedAt = in.readString();
        this.value = new ArrayList<>();
        in.readList(this.value, List.class.getClassLoader());
        this.scopeId = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<PreferenceData> CREATOR = new Creator<PreferenceData>() {
        @Override
        public PreferenceData createFromParcel(Parcel source) {
            return new PreferenceData(source);
        }

        @Override
        public PreferenceData[] newArray(int size) {
            return new PreferenceData[size];
        }
    };
}

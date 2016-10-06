package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.AutocompleteResponseData}.  Implements {@link Parcelable}
 */
public class AutocompleteResponseData extends com.percolate.sdk.dto.AutocompleteResponseData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.scopeId);
        dest.writeString(this.label);
        dest.writeString(this.value);
        dest.writeString(this.url);
        dest.writeString(this.avatarUrl);
        dest.writeString(this.updatedAt);
        dest.writeMap(this.extraFields);
    }

    public AutocompleteResponseData() {
    }

    protected AutocompleteResponseData(Parcel in) {
        this.id = in.readString();
        this.scopeId = in.readString();
        this.label = in.readString();
        this.value = in.readString();
        this.url = in.readString();
        this.avatarUrl = in.readString();
        this.updatedAt = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<AutocompleteResponseData> CREATOR = new Creator<AutocompleteResponseData>() {
        public AutocompleteResponseData createFromParcel(Parcel source) {
            return new AutocompleteResponseData(source);
        }

        public AutocompleteResponseData[] newArray(int size) {
            return new AutocompleteResponseData[size];
        }
    };
}

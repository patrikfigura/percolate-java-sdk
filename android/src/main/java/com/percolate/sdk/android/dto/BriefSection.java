package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

public class BriefSection extends com.percolate.sdk.dto.BriefSection implements Parcelable  {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.key);
        dest.writeString(this.title);
        dest.writeString(this.copyHtml);
        dest.writeStringList(this.assetIds);
        dest.writeValue(this.version);
        dest.writeMap(this.extraFields);
    }

    public BriefSection() {
    }

    protected BriefSection(Parcel in) {
        this.key = in.readString();
        this.title = in.readString();
        this.copyHtml = in.readString();
        this.assetIds = in.createStringArrayList();
        this.version = (Integer) in.readValue(Integer.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<BriefSection> CREATOR = new Creator<BriefSection>() {
        @Override
        public BriefSection createFromParcel(Parcel source) {
            return new BriefSection(source);
        }

        @Override
        public BriefSection[] newArray(int size) {
            return new BriefSection[size];
        }
    };
}

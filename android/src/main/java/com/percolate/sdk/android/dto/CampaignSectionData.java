package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.CampaignSectionData}.  Implements {@link Parcelable}
 */
public class CampaignSectionData extends com.percolate.sdk.dto.CampaignSectionData implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.campaignId);
        dest.writeString(this.createdAt);
        dest.writeMap(this.ext);
        dest.writeValue(this.ordinal);
        dest.writeString(this.schemaId);
        dest.writeString(this.scopeId);
        dest.writeString(this.title);
        dest.writeString(this.type);
        dest.writeString(this.updatedAt);
        dest.writeMap(this.extraFields);
    }

    public CampaignSectionData() {
    }

    protected CampaignSectionData(Parcel in) {
        this.id = in.readString();
        this.campaignId = in.readString();
        this.createdAt = in.readString();
        this.ext = new LinkedHashMap<>();
        in.readMap(this.ext, LinkedHashMap.class.getClassLoader());
        this.ordinal = (Double) in.readValue(Integer.class.getClassLoader());
        this.schemaId = in.readString();
        this.scopeId = in.readString();
        this.title = in.readString();
        this.type = in.readString();
        this.updatedAt = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Parcelable.Creator<CampaignSectionData> CREATOR = new Parcelable.Creator<CampaignSectionData>() {
        @Override
        public CampaignSectionData createFromParcel(Parcel source) {
            return new CampaignSectionData(source);
        }

        @Override
        public CampaignSectionData[] newArray(int size) {
            return new CampaignSectionData[size];
        }
    };
}

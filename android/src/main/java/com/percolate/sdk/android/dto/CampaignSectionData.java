package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

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
        dest.writeString(this.uid);
        dest.writeString(this.title);
        dest.writeString(this.copyHtml);
        dest.writeStringList(this.mediaUids);
        dest.writeMap(this.extraFields);
    }

    public CampaignSectionData() {
    }

    protected CampaignSectionData(Parcel in) {
        this.uid = in.readString();
        this.title = in.readString();
        this.copyHtml = in.readString();
        this.mediaUids = in.createStringArrayList();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<CampaignSectionData> CREATOR = new Creator<CampaignSectionData>() {
        public CampaignSectionData createFromParcel(Parcel source) {
            return new CampaignSectionData(source);
        }

        public CampaignSectionData[] newArray(int size) {
            return new CampaignSectionData[size];
        }
    };
}

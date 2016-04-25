package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.CampaignSection}.  Implements {@link Parcelable}
 */
public class CampaignSection extends com.percolate.sdk.dto.CampaignSection implements Parcelable {
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

    public CampaignSection() {
    }

    protected CampaignSection(Parcel in) {
        this.uid = in.readString();
        this.title = in.readString();
        this.copyHtml = in.readString();
        this.mediaUids = in.createStringArrayList();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<CampaignSection> CREATOR = new Creator<CampaignSection>() {
        public CampaignSection createFromParcel(Parcel source) {
            return new CampaignSection(source);
        }

        public CampaignSection[] newArray(int size) {
            return new CampaignSection[size];
        }
    };
}

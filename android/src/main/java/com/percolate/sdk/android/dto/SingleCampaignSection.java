package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.percolate.sdk.dto.CampaignSectionData;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.SingleCampaignSection}.  Implements {@link Parcelable}
 */
public class SingleCampaignSection extends com.percolate.sdk.dto.SingleCampaignSection implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public SingleCampaignSection() {
    }

    protected SingleCampaignSection(Parcel in) {
        this.data = (CampaignSectionData) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Parcelable.Creator<SingleCampaignSection> CREATOR = new Parcelable.Creator<SingleCampaignSection>() {
        @Override
        public SingleCampaignSection createFromParcel(Parcel source) {
            return new SingleCampaignSection(source);
        }

        @Override
        public SingleCampaignSection[] newArray(int size) {
            return new SingleCampaignSection[size];
        }
    };
}

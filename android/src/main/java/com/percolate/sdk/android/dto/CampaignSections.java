package com.percolate.sdk.android.dto;

import android.os.Parcelable;
import com.percolate.sdk.dto.CampaignSectionsData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Android version of {@link com.percolate.sdk.dto.CampaignSections}.  Implements {@link Parcelable}
 */
public class CampaignSections extends com.percolate.sdk.dto.CampaignSections implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeSerializable(this.meta);
        dest.writeList(this.data);
        dest.writeMap(this.extraFields);
    }

    public CampaignSections() {
    }

    protected CampaignSections(android.os.Parcel in) {
        this.meta = (com.percolate.sdk.dto.V5Meta) in.readSerializable();
        this.data = new ArrayList<CampaignSectionsData>();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final android.os.Parcelable.Creator<CampaignSections> CREATOR = new android.os.Parcelable.Creator<CampaignSections>() {
        @Override
        public CampaignSections createFromParcel(android.os.Parcel source) {
            return new CampaignSections(source);
        }

        @Override
        public CampaignSections[] newArray(int size) {
            return new CampaignSections[size];
        }
    };
}

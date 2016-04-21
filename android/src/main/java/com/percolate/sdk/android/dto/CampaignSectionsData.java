package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import com.percolate.sdk.dto.CampaignSection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Android version of {@link com.percolate.sdk.dto.CampaignSectionsData}.  Implements {@link Parcelable}
 */
public class CampaignSectionsData extends com.percolate.sdk.dto.CampaignSectionsData implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.campaignId);
        dest.writeString(this.scopeId);
        dest.writeList(this.sections);
        dest.writeValue(this.version);
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
        dest.writeMap(this.extraFields);
    }

    public CampaignSectionsData() {
    }

    protected CampaignSectionsData(android.os.Parcel in) {
        this.id = in.readString();
        this.campaignId = in.readString();
        this.scopeId = in.readString();
        this.sections = new ArrayList<CampaignSection>();
        in.readList(this.sections, CampaignSection.class.getClassLoader());
        this.version = (Integer) in.readValue(Integer.class.getClassLoader());
        this.createdAt = in.readString();
        this.updatedAt = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final android.os.Parcelable.Creator<com.percolate.sdk.android.dto.CampaignSectionsData> CREATOR = new android.os.Parcelable.Creator<com.percolate.sdk.android.dto.CampaignSectionsData>() {
        @Override
        public com.percolate.sdk.android.dto.CampaignSectionsData createFromParcel(android.os.Parcel source) {
            return new com.percolate.sdk.android.dto.CampaignSectionsData(source);
        }

        @Override
        public com.percolate.sdk.android.dto.CampaignSectionsData[] newArray(int size) {
            return new com.percolate.sdk.android.dto.CampaignSectionsData[size];
        }
    };
}

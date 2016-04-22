package com.percolate.sdk.android.dto;

import android.os.Parcelable;

import com.percolate.sdk.dto.BriefSection;
import com.percolate.sdk.dto.CampaignSection;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.BriefSectionsData}.  Implements {@link Parcelable}
 */
public class BriefSectionsData extends com.percolate.sdk.dto.BriefSectionsData implements Parcelable {

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

    public BriefSectionsData() {
    }

    protected BriefSectionsData(android.os.Parcel in) {
        this.id = in.readString();
        this.campaignId = in.readString();
        this.scopeId = in.readString();
        this.sections = new ArrayList<BriefSection>();
        in.readList(this.sections, CampaignSection.class.getClassLoader());
        this.version = (Integer) in.readValue(Integer.class.getClassLoader());
        this.createdAt = in.readString();
        this.updatedAt = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final android.os.Parcelable.Creator<BriefSectionsData> CREATOR = new android.os.Parcelable.Creator<BriefSectionsData>() {
        @Override
        public BriefSectionsData createFromParcel(android.os.Parcel source) {
            return new BriefSectionsData(source);
        }

        @Override
        public BriefSectionsData[] newArray(int size) {
            return new BriefSectionsData[size];
        }
    };
}

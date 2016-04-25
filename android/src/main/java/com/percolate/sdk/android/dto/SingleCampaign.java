package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link SingleCampaign}.  Implements {@link Parcelable}
 */
public class SingleCampaign extends com.percolate.sdk.dto.SingleCampaign implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
        dest.writeMap(extraFields);
    }

    public SingleCampaign() {
    }

    protected SingleCampaign(Parcel in) {
        this.data = (com.percolate.sdk.dto.Campaign) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<SingleCampaign> CREATOR = new Creator<SingleCampaign>() {
        @Override
        public SingleCampaign createFromParcel(Parcel source) {
            return new SingleCampaign(source);
        }

        @Override
        public SingleCampaign[] newArray(int size) {
            return new SingleCampaign[size];
        }
    };
}

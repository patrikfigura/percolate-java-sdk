package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.BriefData}.  Implements {@link Parcelable}
 */
@SuppressWarnings("unused")
public class BriefData extends com.percolate.sdk.dto.BriefData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.brief);
        dest.writeMap(this.extraFields);
    }

    public BriefData() {
    }

    protected BriefData(Parcel in) {
        this.brief = (com.percolate.sdk.dto.Brief) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<BriefData> CREATOR = new Creator<BriefData>() {
        public BriefData createFromParcel(Parcel source) {
            return new BriefData(source);
        }

        public BriefData[] newArray(int size) {
            return new BriefData[size];
        }
    };
}

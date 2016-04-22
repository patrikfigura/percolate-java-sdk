package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.BriefSectionsData;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.SingleBriefSection}.  Implements {@link Parcelable}
 */
public class SingleBriefSection extends com.percolate.sdk.dto.SingleBriefSection implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.data);
        dest.writeMap(this.extraFields);
    }

    public SingleBriefSection() {
    }

    protected SingleBriefSection(Parcel in) {
        this.data = (BriefSectionsData) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Parcelable.Creator<SingleBriefSection> CREATOR = new Parcelable.Creator<SingleBriefSection>() {
        @Override
        public SingleBriefSection createFromParcel(Parcel source) {
            return new SingleBriefSection(source);
        }

        @Override
        public SingleBriefSection[] newArray(int size) {
            return new SingleBriefSection[size];
        }
    };
}

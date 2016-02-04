package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.InteractionData}.  Implements {@link Parcelable}
 */
public class InteractionData extends com.percolate.sdk.dto.InteractionData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.platform);
        dest.writeString(this.scopeId);
        dest.writeString(this.xid);
        dest.writeValue(this.read);
        dest.writeStringList(this.termIds);
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
    }

    public InteractionData() {
    }

    protected InteractionData(Parcel in) {
        this.id = in.readString();
        this.platform = in.readString();
        this.scopeId = in.readString();
        this.xid = in.readString();
        this.read = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.termIds = in.createStringArrayList();
        this.createdAt = in.readString();
        this.updatedAt = in.readString();
    }

    public static final Creator<InteractionData> CREATOR = new Creator<InteractionData>() {
        public InteractionData createFromParcel(Parcel source) {
            return new InteractionData(source);
        }

        public InteractionData[] newArray(int size) {
            return new InteractionData[size];
        }
    };
}

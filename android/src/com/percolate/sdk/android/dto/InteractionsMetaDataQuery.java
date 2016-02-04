package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Android version of {@link com.percolate.sdk.dto.InteractionsMetaDataQuery}.  Implements {@link Parcelable}
 */
public class InteractionsMetaDataQuery extends com.percolate.sdk.dto.InteractionsMetaDataQuery implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.platform);
        dest.writeString(this.xids);
        dest.writeString(this.scopeIds);
    }

    public InteractionsMetaDataQuery() {
    }

    protected InteractionsMetaDataQuery(Parcel in) {
        this.platform = in.readString();
        this.xids = in.readString();
        this.scopeIds = in.readString();
    }

    public static final Creator<InteractionsMetaDataQuery> CREATOR = new Creator<InteractionsMetaDataQuery>() {
        public InteractionsMetaDataQuery createFromParcel(Parcel source) {
            return new InteractionsMetaDataQuery(source);
        }

        public InteractionsMetaDataQuery[] newArray(int size) {
            return new InteractionsMetaDataQuery[size];
        }
    };
}

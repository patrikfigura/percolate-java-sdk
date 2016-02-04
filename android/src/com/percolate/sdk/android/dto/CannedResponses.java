package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;
import com.percolate.sdk.dto.CannedResponseData;

import java.util.ArrayList;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.CannedResponses}.  Implements {@link Parcelable}
 */
public class CannedResponses extends com.percolate.sdk.dto.CannedResponses implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.metaData);
        dest.writeList(this.data);
    }

    public CannedResponses() {
    }

    protected CannedResponses(Parcel in) {
        this.metaData = (com.percolate.sdk.dto.CannedResponsesMetaData) in.readSerializable();
        this.data = new ArrayList<CannedResponseData>();
        in.readList(this.data, List.class.getClassLoader());
    }

    public static final Creator<CannedResponses> CREATOR = new Creator<CannedResponses>() {
        public CannedResponses createFromParcel(Parcel source) {
            return new CannedResponses(source);
        }

        public CannedResponses[] newArray(int size) {
            return new CannedResponses[size];
        }
    };
}

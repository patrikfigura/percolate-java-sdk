package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.TokenStatus}.  Implements {@link Parcelable}
 */
public class TokenStatus extends com.percolate.sdk.dto.TokenStatus implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.status);
        dest.writeMap(this.extraFields);
    }

    public TokenStatus() {
    }

    protected TokenStatus(Parcel in) {
        this.status = (Integer) in.readValue(Integer.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<TokenStatus> CREATOR = new Creator<TokenStatus>() {
        public TokenStatus createFromParcel(Parcel source) {
            return new TokenStatus(source);
        }

        public TokenStatus[] newArray(int size) {
            return new TokenStatus[size];
        }
    };
}

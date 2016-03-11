package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.OAuthToken}.  Implements {@link Parcelable}
 */
public class OAuthToken extends com.percolate.sdk.dto.OAuthToken implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.oAuthTokenData);
        dest.writeMap(this.extraFields);
    }

    public OAuthToken() {
    }

    protected OAuthToken(Parcel in) {
        this.oAuthTokenData = (com.percolate.sdk.dto.OAuthTokenData) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<OAuthToken> CREATOR = new Creator<OAuthToken>() {
        public OAuthToken createFromParcel(Parcel source) {
            return new OAuthToken(source);
        }

        public OAuthToken[] newArray(int size) {
            return new OAuthToken[size];
        }
    };
}

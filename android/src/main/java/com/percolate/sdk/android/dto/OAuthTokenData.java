package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.OAuthTokenData}.  Implements {@link Parcelable}
 */
public class OAuthTokenData extends com.percolate.sdk.dto.OAuthTokenData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.tokenUID);
        dest.writeString(this.licenseTokenUID);
        dest.writeString(this.scopeUID);
        dest.writeMap(this.extraFields);
    }

    public OAuthTokenData() {
    }

    protected OAuthTokenData(Parcel in) {
        this.tokenUID = in.readString();
        this.licenseTokenUID = in.readString();
        this.scopeUID = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<OAuthTokenData> CREATOR = new Creator<OAuthTokenData>() {
        public OAuthTokenData createFromParcel(Parcel source) {
            return new OAuthTokenData(source);
        }

        public OAuthTokenData[] newArray(int size) {
            return new OAuthTokenData[size];
        }
    };
}

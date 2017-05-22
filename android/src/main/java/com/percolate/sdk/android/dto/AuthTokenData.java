package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.AuthTokenData}.  Implements {@link Parcelable}
 */
public class AuthTokenData extends com.percolate.sdk.dto.AuthTokenData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.tokenType);
        dest.writeString(this.accessToken);
        dest.writeString(this.userId);
        dest.writeString(this.grantId);
        dest.writeString(this.refreshToken);
        dest.writeString(this.updatedAt);
        dest.writeString(this.expiresAt);
        dest.writeMap(this.extraFields);
    }

    public AuthTokenData() {
    }

    protected AuthTokenData(Parcel in) {
        this.id = in.readString();
        this.tokenType = in.readString();
        this.accessToken = in.readString();
        this.userId = in.readString();
        this.grantId = in.readString();
        this.refreshToken = in.readString();
        this.updatedAt = in.readString();
        this.expiresAt = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<AuthTokenData> CREATOR = new Creator<AuthTokenData>() {
        public AuthTokenData createFromParcel(Parcel source) {
            return new AuthTokenData(source);
        }

        public AuthTokenData[] newArray(int size) {
            return new AuthTokenData[size];
        }
    };
}

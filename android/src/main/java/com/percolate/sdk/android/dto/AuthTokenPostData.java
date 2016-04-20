package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.AuthTokenPostData}.  Implements {@link Parcelable}
 */
public class AuthTokenPostData extends com.percolate.sdk.dto.AuthTokenPostData implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.code);
        dest.writeString(this.grantType);
        dest.writeString(this.clientId);
        dest.writeMap(this.extraFields);
    }

    public AuthTokenPostData() {
    }

    protected AuthTokenPostData(Parcel in) {
        this.code = in.readString();
        this.grantType = in.readString();
        this.clientId = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<AuthTokenPostData> CREATOR = new Creator<AuthTokenPostData>() {
        public AuthTokenPostData createFromParcel(Parcel source) {
            return new AuthTokenPostData(source);
        }

        public AuthTokenPostData[] newArray(int size) {
            return new AuthTokenPostData[size];
        }
    };
}

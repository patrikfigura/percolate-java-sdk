package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.AuthorizeDataExt}.  Implements {@link Parcelable}
 */
public class AuthorizeDataExt extends com.percolate.sdk.dto.AuthorizeDataExt implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.tokenSetupCode);
        dest.writeString(this.clientId);
        dest.writeString(this.callbackUrl);
        dest.writeMap(this.extraFields);
    }

    public AuthorizeDataExt() {
    }

    protected AuthorizeDataExt(Parcel in) {
        this.tokenSetupCode = in.readString();
        this.clientId = in.readString();
        this.callbackUrl = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<AuthorizeDataExt> CREATOR = new Creator<AuthorizeDataExt>() {
        public AuthorizeDataExt createFromParcel(Parcel source) {
            return new AuthorizeDataExt(source);
        }

        public AuthorizeDataExt[] newArray(int size) {
            return new AuthorizeDataExt[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.AuthorizePostData}.  Implements {@link Parcelable}
 */
public class AuthorizePostData extends com.percolate.sdk.dto.AuthorizePostData implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.email);
        dest.writeString(this.password);
        dest.writeString(this.type);
        dest.writeString(this.twoFactorAuthCode);
        dest.writeString(this.ssoPayload);
        dest.writeSerializable(this.ext);
        dest.writeMap(this.extraFields);
    }

    public AuthorizePostData() {
    }

    protected AuthorizePostData(Parcel in) {
        this.email = in.readString();
        this.password = in.readString();
        this.type = in.readString();
        this.twoFactorAuthCode = in.readString();
        this.ssoPayload = in.readString();
        this.ext = (com.percolate.sdk.dto.AuthorizePostDataExt) in.readSerializable();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<AuthorizePostData> CREATOR = new Creator<AuthorizePostData>() {
        public AuthorizePostData createFromParcel(Parcel source) {
            return new AuthorizePostData(source);
        }

        public AuthorizePostData[] newArray(int size) {
            return new AuthorizePostData[size];
        }
    };
}

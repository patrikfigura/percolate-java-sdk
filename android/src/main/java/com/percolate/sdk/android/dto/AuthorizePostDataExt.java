package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.AuthorizePostDataExt}.  Implements {@link Parcelable}
 */
public class AuthorizePostDataExt extends com.percolate.sdk.dto.AuthorizePostDataExt implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.clientId);
        dest.writeMap(this.extraFields);
    }

    public AuthorizePostDataExt() {
    }

    protected AuthorizePostDataExt(Parcel in) {
        this.clientId = in.readString();
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<AuthorizePostDataExt> CREATOR = new Creator<AuthorizePostDataExt>() {
        public AuthorizePostDataExt createFromParcel(Parcel source) {
            return new AuthorizePostDataExt(source);
        }

        public AuthorizePostDataExt[] newArray(int size) {
            return new AuthorizePostDataExt[size];
        }
    };
}

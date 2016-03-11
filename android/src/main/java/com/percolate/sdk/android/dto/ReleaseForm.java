package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * Android version of {@link com.percolate.sdk.dto.ReleaseForm}.  Implements {@link Parcelable}
 */
public class ReleaseForm extends com.percolate.sdk.dto.ReleaseForm implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.birthdate);
        dest.writeString(this.email);
        dest.writeString(this.name);
        dest.writeString(this.referenceUID);
        dest.writeValue(this.signatureImageId);
        dest.writeMap(this.extraFields);
    }

    public ReleaseForm() {
    }

    protected ReleaseForm(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.birthdate = in.readString();
        this.email = in.readString();
        this.name = in.readString();
        this.referenceUID = in.readString();
        this.signatureImageId = (Long) in.readValue(Long.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.readMap(this.extraFields, HashMap.class.getClassLoader());
    }

    public static final Creator<ReleaseForm> CREATOR = new Creator<ReleaseForm>() {
        public ReleaseForm createFromParcel(Parcel source) {
            return new ReleaseForm(source);
        }

        public ReleaseForm[] newArray(int size) {
            return new ReleaseForm[size];
        }
    };
}

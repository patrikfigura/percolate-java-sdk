package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.percolate.sdk.dto.*;

/**
 * Android version of {@link com.percolate.sdk.dto.TranslationData}.  Implements {@link Parcelable}
 */
public class TranslationData extends com.percolate.sdk.dto.TranslationData implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.translation);
        dest.writeString(this.detectedLanguage);
        dest.writeString(this.updatedAt);
        dest.writeSerializable(this.attribution);
    }

    public TranslationData() {
    }

    protected TranslationData(Parcel in) {
        this.id = in.readString();
        this.translation = in.readString();
        this.detectedLanguage = in.readString();
        this.updatedAt = in.readString();
        this.attribution = (com.percolate.sdk.dto.TranslationAttribution) in.readSerializable();
    }

    public static final Creator<TranslationData> CREATOR = new Creator<TranslationData>() {
        public TranslationData createFromParcel(Parcel source) {
            return new TranslationData(source);
        }

        public TranslationData[] newArray(int size) {
            return new TranslationData[size];
        }
    };
}

package com.percolate.sdk.android.dto;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Android version of {@link com.percolate.sdk.dto.Autocomplete}.  Implements {@link Parcelable}
 */
public class Autocomplete extends com.percolate.sdk.dto.Autocomplete implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.countries);
        dest.writeList(this.regions);
        dest.writeList(this.cities);
        dest.writeList(this.locales);
        dest.writeList(this.collegeNetworks);
        dest.writeList(this.collegeMajors);
        dest.writeList(this.collegeYears);
        dest.writeMap(this.extraFields);
    }

    public Autocomplete() {
    }

    protected Autocomplete(Parcel in) {
        this.countries = new ArrayList<LinkedHashMap<String, Object>>();
        in.readList(this.countries, List.class.getClassLoader());
        this.regions = new ArrayList<LinkedHashMap<String, Object>>();
        in.readList(this.regions, List.class.getClassLoader());
        this.cities = new ArrayList<LinkedHashMap<String, Object>>();
        in.readList(this.cities, List.class.getClassLoader());
        this.locales = new ArrayList<LinkedHashMap<String, Object>>();
        in.readList(this.locales, List.class.getClassLoader());
        this.collegeNetworks = new ArrayList<LinkedHashMap<String, Object>>();
        in.readList(this.collegeNetworks, List.class.getClassLoader());
        this.collegeMajors = new ArrayList<LinkedHashMap<String, Object>>();
        in.readList(this.collegeMajors, List.class.getClassLoader());
        this.collegeYears = new ArrayList<LinkedHashMap<String, Object>>();
        in.readList(this.collegeYears, List.class.getClassLoader());
        this.extraFields = new HashMap<>();
        in.writeMap(this.extraFields);
    }

    public static final Creator<Autocomplete> CREATOR = new Creator<Autocomplete>() {
        public Autocomplete createFromParcel(Parcel source) {
            return new Autocomplete(source);
        }

        public Autocomplete[] newArray(int size) {
            return new Autocomplete[size];
        }
    };
}

package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Autocomplete implements Serializable {

    private static final long serialVersionUID = 6883166262212102498L;

    @JsonProperty("countries")
    private List<LinkedHashMap<String, Object>> countries;

    @JsonProperty("regions")
    private List<LinkedHashMap<String, Object>> regions;

    @JsonProperty("cities")
    private List<LinkedHashMap<String, Object>> cities;

    @JsonProperty("locales")
    private List<LinkedHashMap<String, Object>> locales;

    @JsonProperty("college_networks")
    private List<LinkedHashMap<String, Object>> collegeNetworks;

    @JsonProperty("college_majors")
    private List<LinkedHashMap<String, Object>> collegeMajors;

    @JsonProperty("college_years")
    private List<LinkedHashMap<String, Object>> collegeYears;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public List<LinkedHashMap<String, Object>> getCountries() {
        return countries;
    }

    public void setCountries(List<LinkedHashMap<String, Object>> countries) {
        this.countries = countries;
    }

    public List<LinkedHashMap<String, Object>> getRegions() {
        return regions;
    }

    public void setRegions(List<LinkedHashMap<String, Object>> regions) {
        this.regions = regions;
    }

    public void setCities(List<LinkedHashMap<String, Object>> cities) {
        this.cities = cities;
    }

    public List<LinkedHashMap<String, Object>> getCities() {
        return cities;
    }

    public void setLocales(List<LinkedHashMap<String, Object>> locales) {
        this.locales = locales;
    }

    public List<LinkedHashMap<String, Object>> getLocales() {
        return locales;
    }

    public void setCollegeNetworks(List<LinkedHashMap<String, Object>> collegeNetworks) {
        this.collegeNetworks = collegeNetworks;
    }

    public List<LinkedHashMap<String, Object>> getCollegeNetworks() {
        return collegeNetworks;
    }

    public void setCollegeMajors(List<LinkedHashMap<String, Object>> collegeMajors) {
        this.collegeMajors = collegeMajors;
    }

    public List<LinkedHashMap<String, Object>> getCollegeMajors() {
        return collegeMajors;
    }

    public void setCollegeYears(List<LinkedHashMap<String, Object>> collegeYears) {
        this.collegeYears = collegeYears;
    }

    public List<LinkedHashMap<String, Object>> getCollegeYears() {
        return collegeYears;
    }
}

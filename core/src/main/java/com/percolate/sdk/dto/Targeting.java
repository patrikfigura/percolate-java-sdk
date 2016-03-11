package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Targeting implements Serializable {

    private static final long serialVersionUID = -3528442782770731771L;

    @JsonProperty("autocomplete")
    protected Autocomplete autocomplete;

    @JsonProperty("genders")
    protected List<Integer> genders;

    @JsonProperty("age_min")
    protected Integer ageMin;

    @JsonProperty("age_max")
    protected Integer ageMax;

    @JsonProperty("interested_in")
    protected List<Integer> interestedIn;

    @JsonProperty("relationship_statuses")
    protected List<Integer> relationshipStatuses;

    @JsonProperty("work_networks")
    protected List<LinkedHashMap<String, Object>> workNetworks;

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public Autocomplete getAutocomplete() {
        return autocomplete;
    }

    public void setAutocomplete(Autocomplete autocomplete) {
        this.autocomplete = autocomplete;
    }

    public List<Integer> getGenders() {
        return genders;
    }

    public void setGenders(List<Integer> genders) {
        this.genders = genders;
    }

    public Integer getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(Integer ageMin) {
        this.ageMin = ageMin;
    }

    public Integer getAgeMax() {
        return ageMax;
    }

    public void setAgeMax(Integer ageMax) {
        this.ageMax = ageMax;
    }

    public List<Integer> getInterestedIn() {
        return interestedIn;
    }

    public void setInterestedIn(List<Integer> interestedIn) {
        this.interestedIn = interestedIn;
    }

    public List<Integer> getRelationshipStatuses() {
        return relationshipStatuses;
    }

    public void setRelationshipStatuses(List<Integer> relationshipStatuses) {
        this.relationshipStatuses = relationshipStatuses;
    }

    public List<LinkedHashMap<String, Object>> getWorkNetworks() {
        return workNetworks;
    }

    public void setWorkNetworks(List<LinkedHashMap<String, Object>> workNetworks) {
        this.workNetworks = workNetworks;
    }

    @JsonIgnore
    public boolean isEmpty() {
        return autocomplete == null && genders == null && ageMin == null && ageMax == null &&
                interestedIn == null && relationshipStatuses == null && workNetworks == null;
    }
}

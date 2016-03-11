package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReleaseForm implements Serializable {

    private static final long serialVersionUID = -8124374256190243861L;

    @JsonProperty("id")
    protected Long id;

    @JsonProperty("birthdate")
    protected String birthdate;

    @JsonProperty("email")
    protected String email;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("reference_uid")
    protected String referenceUID;

    @JsonProperty("signature_image_id")
    protected Long signatureImageId;

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReferenceUID() {
        return referenceUID;
    }

    public void setReferenceUID(String referenceUID) {
        this.referenceUID = referenceUID;
    }

    public Long getSignatureImageId() {
        return signatureImageId;
    }

    public void setSignatureImageId(Long signatureImageId) {
        this.signatureImageId = signatureImageId;
    }

}

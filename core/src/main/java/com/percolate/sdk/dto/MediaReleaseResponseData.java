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
public class MediaReleaseResponseData implements Serializable {

    private static final long serialVersionUID = 3658251682257161899L;

    @JsonProperty("id")
    protected Long id;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("url_expiration")
    protected Long urlExpiration;

    @JsonProperty("reference_uid")
    protected String referenceUID;

    @JsonProperty("created_at")
    protected String createdAt;

    @JsonProperty("signature_image_id")
    protected String signatureImageId;

    @JsonProperty("birthdate")
    protected String birthdate;

    @JsonProperty("email")
    protected String email;

    @JsonProperty("signature_image_url")
    protected String signatureImageUrl;

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
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

    public Long getUrlExpiration() {
        return urlExpiration;
    }

    public void setUrlExpiration(Long urlExpiration) {
        this.urlExpiration = urlExpiration;
    }

    public String getReferenceUID() {
        return referenceUID;
    }

    public void setReferenceUID(String referenceUID) {
        this.referenceUID = referenceUID;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getSignatureImageId() {
        return signatureImageId;
    }

    public void setSignatureImageId(String signatureImageId) {
        this.signatureImageId = signatureImageId;
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

    public String getSignatureImageUrl() {
        return signatureImageUrl;
    }

    public void setSignatureImageUrl(String signatureImageUrl) {
        this.signatureImageUrl = signatureImageUrl;
    }
}

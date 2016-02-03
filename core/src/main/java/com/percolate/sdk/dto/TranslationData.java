package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TranslationData implements Serializable {

    private static final long serialVersionUID = -4721866404655539374L;

    @JsonProperty("id")
    private String id;

    @JsonProperty("translation")
    private String translation;

    @JsonProperty("detected_language")
    private String detectedLanguage;

    @JsonProperty("updated_at")
    private String updatedAt;

    @JsonProperty("attribution")
    private TranslationAttribution attribution;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getDetectedLanguage() {
        return detectedLanguage;
    }

    public void setDetectedLanguage(String detectedLanguage) {
        this.detectedLanguage = detectedLanguage;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public TranslationAttribution getAttribution() {
        return attribution;
    }

    public void setAttribution(TranslationAttribution attribution) {
        this.attribution = attribution;
    }

}

package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacebookMessageAttachment implements Serializable {

    private static final long serialVersionUID = -2968749522512483725L;

    @JsonProperty("id")
    private String id;

    @JsonProperty("mime_type")
    private String mimeType;

    @JsonProperty("name")
    private String name;

    @JsonProperty("image_data")
    private FacebookMessageAttachmentImageData imageData;

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

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FacebookMessageAttachmentImageData getImageData() {
        return imageData;
    }

    public void setImageData(FacebookMessageAttachmentImageData imageData) {
        this.imageData = imageData;
    }

}

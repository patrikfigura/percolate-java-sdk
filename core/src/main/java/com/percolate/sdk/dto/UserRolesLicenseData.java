package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRolesLicenseData implements Serializable {

    private static final long serialVersionUID = 9122975716120766793L;

    @JsonProperty("id")
    protected Long id;

    @JsonProperty("capabilities")
    protected List<UserRolesLicenseCapabilities> capabilities;

    @JsonProperty("code")
    protected String code;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("tags")
    protected List<String> tags;

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

    public List<UserRolesLicenseCapabilities> getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(List<UserRolesLicenseCapabilities> capabilities) {
        this.capabilities = capabilities;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

}
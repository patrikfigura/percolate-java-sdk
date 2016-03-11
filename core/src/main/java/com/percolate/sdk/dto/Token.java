package com.percolate.sdk.dto;

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
public class Token implements Serializable {

    private static final long serialVersionUID = -9204311148594925317L;

    @JsonProperty("id")
    protected Long id;

    @JsonProperty("platform")
    protected String platform;

    @JsonProperty("status")
    protected Integer status;

    @JsonProperty("pages")
    protected List<LinkedHashMap<String, Object>> pages;

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

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<LinkedHashMap<String, Object>> getPages() {
        return pages;
    }

    public void setPages(List<LinkedHashMap<String, Object>> pages) {
        this.pages = pages;
    }

}

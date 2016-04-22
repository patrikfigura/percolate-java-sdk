package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.*;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BriefSection implements Serializable, HasExtraFields {

    private static final long serialVersionUID = -4641325300395962379L;

    @JsonProperty("key")
    protected String key;

    @JsonProperty("title")
    protected String title;

    @JsonProperty("copy_html")
    protected String copyHtml;

    @JsonProperty("asset_ids")
    protected List<String> assetIds;

    @JsonProperty("version")
    protected Integer version;

    @JsonIgnore
    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCopyHtml() {
        return copyHtml;
    }

    public void setCopyHtml(String copyHtml) {
        this.copyHtml = copyHtml;
    }

    public List<String> getAssetIds() {
        return assetIds;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setAssetIds(List<String> assetIds) {
        this.assetIds = assetIds;
    }

    @Override
    public Map<String, Object> getExtraFields() {
        if(extraFields == null) {
            extraFields = new HashMap<>();
        }
        return extraFields;
    }

    @Override
    @JsonAnySetter
    public void putExtraField(String key, Object value) {
        getExtraFields().put(key, value);
    }
}

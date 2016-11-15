package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.*;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VersionData implements Serializable, HasExtraFields {

    private static final long serialVersionUID = -7945700686753544701L;

    @JsonProperty("version_id")
    protected String versionId;

    @JsonProperty("provenance_id")
    protected String provenanceId;

    @JsonProperty("latest_version_id")
    protected String latestVersionId;

    @JsonProperty("previous_version_id")
    protected String previousVersionId;

    @JsonIgnore
    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public String getProvenanceId() {
        return provenanceId;
    }

    public void setProvenanceId(String provenanceId) {
        this.provenanceId = provenanceId;
    }

    public String getLatestVersionId() {
        return latestVersionId;
    }

    public void setLatestVersionId(String latestVersionId) {
        this.latestVersionId = latestVersionId;
    }

    public String getPreviousVersionId() {
        return previousVersionId;
    }

    public void setPreviousVersionId(String previousVersionId) {
        this.previousVersionId = previousVersionId;
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

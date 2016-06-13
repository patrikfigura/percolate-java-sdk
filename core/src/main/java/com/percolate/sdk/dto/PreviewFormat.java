package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.percolate.sdk.interfaces.HasExtraFields;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PreviewFormat implements Serializable, HasExtraFields {

    private static final long serialVersionUID = 7640445609468000093L;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("active_preview_template_id")
    protected String activePreviewTemplateId;

    @JsonProperty("disabled_at")
    protected String disabledAt;

    @JsonProperty("label")
    protected String label;

    @JsonProperty("schema_id")
    protected String schemaId;

    @JsonProperty("updated_at")
    protected String updatedAt;

    @JsonIgnore
    protected Map<String, Object> extraFields = new HashMap<>();

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

    public String getActivePreviewTemplateId() {
        return activePreviewTemplateId;
    }

    public void setActivePreviewTemplateId(String activePreviewTemplateId) {
        this.activePreviewTemplateId = activePreviewTemplateId;
    }

    public String getDisabledAt() {
        return disabledAt;
    }

    public void setDisabledAt(String disabledAt) {
        this.disabledAt = disabledAt;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(String schemaId) {
        this.schemaId = schemaId;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
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

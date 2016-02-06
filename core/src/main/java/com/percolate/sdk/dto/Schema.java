package com.percolate.sdk.dto;

import org.jetbrains.annotations.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Schema implements Serializable, Comparable<Schema> {

    private static final long serialVersionUID = -6137788601263891457L;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("scope_id")
    protected String scopeId;

    @JsonProperty("status")
    protected String status;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("fields")
    protected List<SchemaField> fields;

    @JsonProperty("plugins")
    protected List<Object> plugins;

    @JsonProperty("fieldsets")
    protected List<Object> fieldsets;

    @JsonProperty("ext")
    protected LinkedHashMap<String, Object> ext;

    @JsonProperty("updated_at")
    protected String updated_at;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    /**
     * Sort alphabetically by {@link #name}.
     */
    @Override
    public int compareTo(@NotNull Schema another) {
        if (name != null && another.name != null) {
            return name.toLowerCase(Locale.getDefault())
                    .compareTo(another.name.toLowerCase(Locale.getDefault()));
        } else {
            return name == null ? 1 : -1;
        }
    }

    /**
     * @return {@code true} if {@code ext["platform_id"]} matches the given {@code platformId}.
     */
    public boolean belongsToPlatform(String platformId) {
        return ext != null &&
                !ext.isEmpty() &&
                ext.containsKey("platform_id") &&
                StringUtils.equalsIgnoreCase(ext.get("platform_id").toString(), platformId);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getScopeId() {
        return scopeId;
    }

    public void setScopeId(String scopeId) {
        this.scopeId = scopeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SchemaField> getFields() {
        return fields;
    }

    public void setFields(List<SchemaField> fields) {
        this.fields = fields;
    }

    public List<Object> getPlugins() {
        return plugins;
    }

    public void setPlugins(List<Object> plugins) {
        this.plugins = plugins;
    }

    public List<Object> getFieldsets() {
        return fieldsets;
    }

    public void setFieldsets(List<Object> fieldsets) {
        this.fieldsets = fieldsets;
    }

    public LinkedHashMap<String, Object> getExt() {
        return ext;
    }

    public void setExt(LinkedHashMap<String, Object> ext) {
        this.ext = ext;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}

package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.*;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.*;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Schema implements Serializable, HasExtraFields, Comparable<Schema> {

    private static final long serialVersionUID = 6842648994318822793L;

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
    protected List<SchemaPlugin> plugins;

    @JsonProperty("fieldsets")
    protected List<Object> fieldsets;

    @JsonProperty("limit_resource_types")
    protected List<String> limitResourceTypes;

    @JsonProperty("in_use")
    protected Boolean inUse;

    @JsonProperty("slug")
    protected String slug;

    @JsonProperty("version")
    protected VersionData version;

    @JsonProperty("ext")
    protected LinkedHashMap<String, Object> ext;

    @JsonProperty("updated_at")
    protected String updatedAt;

    @JsonIgnore
    protected Map<String, Object> extraFields = new HashMap<>();

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schema schema = (Schema) o;
        return new EqualsBuilder()
                .append(id, schema.id)
                .append(scopeId, schema.scopeId)
                .append(status, schema.status)
                .append(type, schema.type)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(scopeId)
                .append(status)
                .append(type)
                .toHashCode();
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

    public List<SchemaPlugin> getPlugins() {
        return plugins;
    }

    public void setPlugins(List<SchemaPlugin> plugins) {
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

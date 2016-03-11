package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Term implements Serializable {

    private static final long serialVersionUID = 3098198274190964473L;

    @JsonProperty("id")
    protected String id;   // term id

    @JsonProperty("name")
    protected String name;  // tag name

    @JsonProperty("namespace")
    protected String namespace;  // the namespace the term belongs to

    @JsonProperty("scope_id")
    protected String scopeId;  // an ID of the owner

    @JsonProperty("update_at")
    protected String updatedAt;

    /**
     * Objects equal if {@link #id} is equal.
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Term that = (Term) other;

        final EqualsBuilder equalsBuilder = new EqualsBuilder();
        if (StringUtils.isNotBlank(id)) {
            equalsBuilder.append(id, that.id);
        } else {
            equalsBuilder.append(name, that.name);
        }
        return equalsBuilder.isEquals();
    }

    @Override
    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(3, 17);
        if (StringUtils.isNotBlank(id)) {
            hashCodeBuilder.append(id);
        } else {
            hashCodeBuilder.append(name);
        }
        return hashCodeBuilder.build();
    }

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String getUid() {
        return id;
    }

    public void setUid(String uid) {
        this.id = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getScopeId() {
        return scopeId;
    }

    public void setScopeId(String scopeId) {
        this.scopeId = scopeId;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}

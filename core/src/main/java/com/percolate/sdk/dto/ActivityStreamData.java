package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActivityStreamData implements Serializable, HasExtraFields {

    private static final long serialVersionUID = 7701722333929308105L;

    @JsonIgnore
    protected Map<String, Object> metaDataMap; //Set by client code after calling getMetadataMap.

    @JsonProperty("related_object_uid")
    protected String relatedObjectUid;

    @JsonProperty("related_object_preview")
    protected String relatedObjectPreview;

    @JsonProperty("object_uid")
    protected String objectUid;

    @JsonProperty("user")
    protected User user;

    @JsonProperty("object_preview")
    protected String objectPreview;

    @JsonProperty("user_id")
    protected Integer userId;

    @JsonProperty("created_at")
    protected String createdAt;

    @JsonProperty("license_id")
    protected Integer licenseId;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("metadata")
    protected List<ActivityStreamMetadata> metadataList;

    @JsonProperty("mentions")
    protected List<Mention> mentions;

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    /**
    * The /api/v4/activity endpoint returns a list of {@link ActivityStreamMetadata} objects.
    * Ex:
    * metadata: [ { 'key': 'somekey', 'value': 'str' }, ...]
    * To avoid traversing the metadata repeatedly, this method flattens this array list into
    * a hash map as:
    * {'somekey': 'str',...}
    *
    * @return map of metadata keys and values.
    */
    public Map<String, Object> getMetadataMap() {
       if (metaDataMap == null) {
           metaDataMap = new HashMap<>();
           if (metadataList != null) {
               for (ActivityStreamMetadata activityStreamMetadata : metadataList) {
                   metaDataMap.put(activityStreamMetadata.getKey(), activityStreamMetadata.getValue());
               }
           }
       }
       return metaDataMap;
    }

    public String getRelatedObjectUid() {
        return relatedObjectUid;
    }

    public void setRelatedObjectUid(String relatedObjectUid) {
        this.relatedObjectUid = relatedObjectUid;
    }

    public String getRelatedObjectPreview() {
        return relatedObjectPreview;
    }

    public void setRelatedObjectPreview(String relatedObjectPreview) {
        this.relatedObjectPreview = relatedObjectPreview;
    }

    public String getObjectUid() {
        return objectUid;
    }

    public void setObjectUid(String objectUid) {
        this.objectUid = objectUid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getObjectPreview() {
        return objectPreview;
    }

    public void setObjectPreview(String objectPreview) {
        this.objectPreview = objectPreview;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(Integer licenseId) {
        this.licenseId = licenseId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ActivityStreamMetadata> getMetadataList() {
        return metadataList;
    }

    public void setMetadataList(List<ActivityStreamMetadata> metadataList) {
        this.metadataList = metadataList;
    }

    public List<Mention> getMentions() {
        return mentions;
    }

    public void setMentions(List<Mention> mentions) {
        this.mentions = mentions;
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

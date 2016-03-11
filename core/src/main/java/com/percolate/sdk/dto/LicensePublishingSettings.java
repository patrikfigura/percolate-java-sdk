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
public class LicensePublishingSettings implements Serializable {

    private static final long serialVersionUID = -5154375915441246126L;

    /* Everything available in the JSON:
         * guardrails
         * scheduling   
         * approvee_ids 
         * targeting_presets    
         * tags 
         * tag_ids  
         * paused
         * platforms    
         * image_editor_tools   
         * services 
         * external_media_rate_limit
         * publishing
    */

    @JsonProperty("tags")
    protected List<Topic> topics;

    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

}

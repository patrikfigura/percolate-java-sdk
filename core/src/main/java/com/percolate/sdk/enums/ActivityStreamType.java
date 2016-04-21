package com.percolate.sdk.enums;

import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

/**
 * Valid values for Activity API requests.
 */
public enum ActivityStreamType {

    CREATE_BRIEF,
    UPDATE_CAMPAIGN,
    CREATE_BRIEF_COMMENT,
    CREATE_BRIEF_FOLLOW,
    CREATE_BRIEF_POST,
    UPDATE_BRIEF_POST,
    CREATE_BRIEF_SECTION,
    UPDATE_BRIEF_SECTION,
    CREATE_WORKSPACE_SECTION,
    UPDATE_WORKSPACE_SECTION,
    SUBMIT_BRIEF_FOR_APPROVAL,
    APPROVE_BRIEF,
    CREATE_POST,
    UPDATE_POST,
    CREATE_POST_COMMENT,
    CREATE_POST_FOLLOW,
    SUBMIT_POST_FOR_APPROVAL,
    APPROVE,
    UNKNOWN;

    /**
     * Returns an {@link ActivityStreamType} enum based on a string returned by the API.
     *
     * @param activityStreamTypeName    activity type string
     * @return  ActivityStreamType
     */
    public static ActivityStreamType fromString(final String activityStreamTypeName){
        for (ActivityStreamType activityStreamType : ActivityStreamType.values()) {
            if(StringUtils.equalsIgnoreCase(activityStreamType.toString(), activityStreamTypeName)){
                return activityStreamType;
            }
        }
        return UNKNOWN;
    }

    /**
     * @return true or false if activity type is for creating and updating a campaign only.
     */
    public boolean isCampaignType() {
        return (this == CREATE_BRIEF || this == UPDATE_CAMPAIGN || this == CREATE_BRIEF_COMMENT
                || this == CREATE_BRIEF_FOLLOW);
    }

    /**
     * @return true or false if activity type is for creating or updating brief or workspace sections.
     */
    public boolean isCampaignSectionType() {
        return (this == CREATE_BRIEF_SECTION || this == CREATE_WORKSPACE_SECTION || this == UPDATE_BRIEF_SECTION
                || this == UPDATE_WORKSPACE_SECTION || this == SUBMIT_BRIEF_FOR_APPROVAL || this == APPROVE_BRIEF);
    }

    /**
     * @return true if stream type is creating or updating a post, otherwise false.
     */
    public boolean isPostType() {
        return (this == CREATE_BRIEF_POST  || this == UPDATE_BRIEF_POST || this == CREATE_POST
                || this == UPDATE_POST || this == SUBMIT_POST_FOR_APPROVAL || this == APPROVE
                || this == CREATE_POST_COMMENT || this == CREATE_POST_FOLLOW);
    }

    /**
     * @return true if activity type is for comment creation, otherwise false.
     */
    public boolean isCommentType() {
        return (this == CREATE_BRIEF_COMMENT || this == CREATE_POST_COMMENT);
    }

    /**
     * @return true if activity type is for creating, updating, submitting for approval or approving
     * a brief section, otherwise false.
     */
    public boolean isBriefSectionType() {
        return (this == CREATE_BRIEF_SECTION || this == UPDATE_BRIEF_SECTION
                || this == SUBMIT_BRIEF_FOR_APPROVAL || this == APPROVE_BRIEF);
    }

    /**
     * @return true if stream type is for an update to a campaign, brief section, workspace section or post
     * otherwise return false.
     */
    public boolean isUpdateType() {
        return (this == UPDATE_CAMPAIGN || this == UPDATE_BRIEF_SECTION ||
                this == UPDATE_WORKSPACE_SECTION || this == UPDATE_BRIEF_POST ||
                this == UPDATE_POST);
    }

    /**
     * @return true if stream type is for an new top-level data type.
     */
    public boolean isTopLevelCreationType() {
        return (this == CREATE_BRIEF || this == CREATE_BRIEF_SECTION ||
                this == CREATE_WORKSPACE_SECTION || this == CREATE_BRIEF_POST ||
                this == CREATE_POST);
    }

    /**
     * @return true if stream type is for an approval (send for approval event or an approved event).
     */
    public boolean isApprovalType() {
        return (this == APPROVE || this == APPROVE_BRIEF ||
                this == SUBMIT_POST_FOR_APPROVAL || this == SUBMIT_BRIEF_FOR_APPROVAL );
    }

    @Override
    public String toString() {
        return name().toLowerCase(Locale.getDefault());
    }
}

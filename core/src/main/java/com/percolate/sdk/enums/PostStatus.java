package com.percolate.sdk.enums;

/**
 * Possible post statuses for v4 posts, v5 posts, and API parameters.
 */
public class PostStatus {

    /**
     * Post statuses used by the v4 API.
     */
    public enum V4 {
        APPROVING("approving"),
        SCHEDULED("scheduled"),
        DRAFT("draft"),
        PUBLISHING("publishing"),
        PUBLISHED("published");

        private final String value;

        V4(final String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }

    /**
     * Post statuses used by the v5 API.
     */
    public enum V5 {
        DRAFT("draft"),
        APPROVALS("approvals"),
        APPROVALS_QUEUED("approvals.queued"),
        APPROVALS_DRAFT("approvals.draft"),
        QUEUED("queued"),
        QUEUED_PAUSED("queued.paused"),
        QUEUED_PUBLISHING("queued.publishing"),
        QUEUED_ERROR("queued.error"),
        QUEUED_PUBLISHED("queued.published"),
        UNPUBLISHED("unpublished"),
        LIVE("live");

        private final String value;

        V5(final String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }

    /**
     * v5 Post statuses used to query the API.
     */
    public enum Query {
        DRAFTS("draft"),
        APPROVAL_DRAFTS("approvals.draft"),
        APPROVALS("approvals.*"),
        QUEUED("queued.*"),
        UNPUBLISHED("unpublished"),
        LIVE("live");

        private final String value;

        Query(final String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

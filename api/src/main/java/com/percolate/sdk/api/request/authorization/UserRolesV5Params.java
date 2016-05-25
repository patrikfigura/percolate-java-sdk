package com.percolate.sdk.api.request.authorization;

import com.percolate.sdk.enums.UserRolesIncludeType;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parameters for v5 User Roles request.
 */
@SuppressWarnings("unused")
public class UserRolesV5Params {

    private Map<String, Object> params = new HashMap<>();

    public UserRolesV5Params() {
    }

    public UserRolesV5Params userIds(List<String> userIds) {
        params.put("user_ids", StringUtils.join(userIds, ","));
        return this;
    }

    public UserRolesV5Params include(List<UserRolesIncludeType> include) {
        params.put("include", StringUtils.join(include, ",").toLowerCase());
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}

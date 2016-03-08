package com.percolate.sdk.api.request.users;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters for User Update Password request.
 */
@SuppressWarnings("unused")
public class UsersUpdatePasswordParams {
    private Map<String, Object> params = new HashMap<>();
    private String userId;

    public UsersUpdatePasswordParams(String userId) {
        this.userId = userId;
    }

    public UsersUpdatePasswordParams oldPassword(String oldPassword) {
        params.put("old_password", oldPassword);
        return this;
    }

    public UsersUpdatePasswordParams newPassword(String newPassword) {
        params.put("new_password", newPassword);
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public String getUserId() {
        return userId;
    }
}

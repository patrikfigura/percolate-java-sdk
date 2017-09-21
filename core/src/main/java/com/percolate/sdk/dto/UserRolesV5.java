package com.percolate.sdk.dto;

import com.fasterxml.jackson.annotation.*;
import com.percolate.sdk.interfaces.HasExtraFields;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("UnusedDeclaration")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRolesV5 implements Serializable, HasExtraFields {

    private static final long serialVersionUID = 3944206064668759694L;

    @JsonProperty("meta")
    protected V5Meta meta;

    @JsonProperty("include")
    protected UserRolesInclude include;

    @JsonProperty("data")
    protected List<UserRole> data;

    @JsonIgnore
    protected Map<String, Object> extraFields = new HashMap<>();

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    /**
     * Returns the role that the user has for the given license and given session licenses.
     * @param licenseId Scope UID.
     * @param current session licenses.
     * @return The {@code Role} the user is in, or {@code null}.
     */
    @Nullable
    public Role getRoleForLicense(final String licenseId, List<License> allLicenses) {
        if (data != null && include != null) {
            Map<String, List<String>> map = licensesByAccountID(allLicenses);
            for (UserRole userRole : data) {
                List<String> scopeIdsForUserRole = scopeIdsForUserRole(userRole, map);
                if (scopeIdsForUserRole.contains(licenseId)) {
                    for (Role includeRole : include.getRole()) {
                        if (StringUtils.equalsIgnoreCase(includeRole.getId(), userRole.getRoleId())) {
                            return includeRole;
                        }
                    }
                }
            }
        }
        return null;
    }

    /**
     * Checks if the {@link #include} data contains the given capability for the given license.
     * @param licenseId Scope UID.
     * @param capability Capability to check for
     * @param current session licenses.
     * @return {@code true} if the user has the capability for the given scope.
     */
    public boolean hasCapability(final String licenseId, final String capability, final List<License> licenses) {
        final Role role = getRoleForLicense(licenseId, licenses);
        if(role != null && role.getCapabilities() != null) {
            for (String roleCapability : role.getCapabilities()) {
                if(StringUtils.equalsIgnoreCase(capability, roleCapability)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Returns all license IDs associated with a particular role.
     * @return List<String>.
     */
    public List<String> scopeIdsForUserRole(UserRole userRole, Map<String, List<String>> map) {
        List<String> scopeIds = new ArrayList<String>();
        if (userRole.scopeId.contains("account")) {
            if (map.get(userRole.scopeId) != null) {
                scopeIds.addAll(map.get(userRole.scopeId));
            }
        } else {
            scopeIds.add(userRole.scopeId);
        }
        return scopeIds;
    }

    /**
     * Returns mapping of all session license IDs to account ID.
     * @return {String: List<String>}.
     */
    public Map<String, List<String>>licensesByAccountID(List<License> licenses) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (License license : licenses) {
            String accountID = license.brand.getAccountID();
            if (accountID == null || license.UID == null) {
                continue;
            } else {
                List<String> UIDs = map.get(accountID) != null? map.get(accountID) : new ArrayList<String>();
                UIDs.add(license.UID);
                map.put(accountID, UIDs);
            }
        }
        return map;
    }

    public V5Meta getMeta() {
        return meta;
    }

    public void setMeta(V5Meta meta) {
        this.meta = meta;
    }

    public UserRolesInclude getInclude() {
        return include;
    }

    public void setInclude(UserRolesInclude include) {
        this.include = include;
    }

    public List<UserRole> getData() {
        return data;
    }

    public void setData(List<UserRole> data) {
        this.data = data;
    }

    @Override
    public Map<String, Object> getExtraFields() {
        if (extraFields == null) {
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

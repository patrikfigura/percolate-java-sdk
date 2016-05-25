package com.percolate.sdk.api.request.authorization

import com.percolate.sdk.api.BaseApiTest
import org.junit.Assert
import org.junit.Test

class UserRolesRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val userRoles = percolateApi
                .userRoles()
                .get(UserRolesParams("123"))
                .execute()
                .body();

        Assert.assertNotNull(userRoles)
        Assert.assertNotNull(userRoles.userRolesLicenseData)
        Assert.assertEquals(1, userRoles.userRolesLicenseData.size.toLong())
        Assert.assertNotNull(userRoles.userRolesLicenseData[0].capabilities)
        Assert.assertEquals(145, userRoles.userRolesLicenseData[0].capabilities.size.toLong())
    }

    @Test
    fun testGetV5() {
        val userRoles = percolateApi
                .userRoles()
                .get(UserRolesV5Params())
                .execute()
                .body();

        Assert.assertNotNull(userRoles)
        Assert.assertNotNull(userRoles.data)
        Assert.assertNotNull(userRoles.include)
        Assert.assertNotNull(userRoles.include.role)
        Assert.assertEquals(11, userRoles.data.size)
        Assert.assertEquals(4, userRoles.include.role.size)

        Assert.assertNotNull(userRoles.getRoleForLicense("license:123456"))
        Assert.assertNull(userRoles.getRoleForLicense("license:9999")) //License does not exist in JSON.

        Assert.assertTrue(userRoles.hasCapability("license:123456", "view:asset_library"))
        Assert.assertFalse(userRoles.hasCapability("license:123456", "does:not:exist"))
        Assert.assertFalse(userRoles.hasCapability("license:9999", "view:asset_library"))
    }
}

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
}

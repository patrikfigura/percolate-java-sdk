package com.percolate.sdk.api.request.users

import com.percolate.sdk.api.BaseApiTest
import org.junit.Assert
import org.junit.Test

class UsersRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val users = percolateApi
                .users()
                .get(UsersParams())
                .execute()
                .body();

        Assert.assertNotNull(users)
        Assert.assertNotNull(users.data)
        Assert.assertEquals(2, users.data.size.toLong())
    }
}

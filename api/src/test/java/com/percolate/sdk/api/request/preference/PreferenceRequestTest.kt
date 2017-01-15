package com.percolate.sdk.api.request.preference

import com.percolate.sdk.api.BaseApiTest
import org.junit.Assert
import org.junit.Test

class PreferenceRequestTest: BaseApiTest() {

    @Test
    fun testGet() {
        val preference = percolateApi
                .preference()
                .get(PreferenceParams())
                .execute()
                .body()

        Assert.assertNotNull(preference)
        Assert.assertNotNull(preference.data)
        Assert.assertEquals(preference.data.size, 1)
    }


}
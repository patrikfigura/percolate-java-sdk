package com.percolate.sdk.api.request.authorization

import com.percolate.sdk.api.BaseApiTest
import com.percolate.sdk.api.request.autocomplete.AutocompleteParams
import org.junit.Assert
import org.junit.Test

class AutocompleteRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val autocomplete = percolateApi
                .autocomplete()
                .get(AutocompleteParams())
                .execute()
                .body()

        Assert.assertNotNull(autocomplete)
        Assert.assertNotNull(autocomplete.data)
        Assert.assertEquals(3, autocomplete.data.size.toLong())
    }
}

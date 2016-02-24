package com.percolate.sdk.api.request.brief

import com.percolate.sdk.api.BaseApiTest
import com.percolate.sdk.dto.Brief
import org.junit.Assert
import org.junit.Test

class BriefRequestTest : BaseApiTest() {

    @Test
    fun testList() {
        val briefs = percolateApi
                .briefs()
                .list(BriefListParams())
                .execute()
                .body();

        Assert.assertNotNull(briefs)
        Assert.assertNotNull(briefs.data)
        Assert.assertEquals(2, briefs.data.size.toLong())
    }

    @Test
    fun testGet() {
        val briefData = percolateApi
                .briefs()
                .get(BriefParams("123"))
                .execute()
                .body();

        Assert.assertNotNull(briefData)
        Assert.assertNotNull(briefData.brief)
    }

    @Test
    fun testCreate() {
        val briefData = percolateApi
                .briefs()
                .create(Brief())
                .execute()
                .body();

        Assert.assertNotNull(briefData)
        Assert.assertNotNull(briefData.brief)
    }
}

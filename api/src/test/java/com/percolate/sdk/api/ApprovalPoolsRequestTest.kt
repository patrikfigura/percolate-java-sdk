package com.percolate.sdk.api

import com.percolate.sdk.api.request.approvals.pools.ApprovalPoolsParams
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test

class ApprovalPoolsRequestTest : PercolateApiTest() {

    @Test
    fun testApiGetRequest() {
        val approvalPools = percolateApi
                .approvalPools()
                .get(ApprovalPoolsParams())
                .execute()
                .body();

        assertNotNull(approvalPools)
        assertNotNull(approvalPools.data)
        assertEquals(2, approvalPools.data.size.toLong())
    }
}

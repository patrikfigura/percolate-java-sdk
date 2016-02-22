package com.percolate.sdk.api.request.approvals.pools

import com.percolate.sdk.api.BaseApiTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test

class ApprovalPoolsRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
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

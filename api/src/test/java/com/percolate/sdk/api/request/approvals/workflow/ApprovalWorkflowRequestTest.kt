package com.percolate.sdk.api.request.approvals.workflow

import com.percolate.sdk.api.BaseApiTest
import org.junit.Assert
import org.junit.Test

class ApprovalWorkflowRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val workflow = percolateApi
                .approvalWorkflow()
                .get(ApprovalWorkflowParams())
                .execute()
                .body();

        Assert.assertNotNull(workflow)
        Assert.assertNotNull(workflow.data)
        Assert.assertEquals(3, workflow.data.size.toLong())
    }
}

package com.percolate.sdk.api.request.monitoring.facebook

import com.percolate.sdk.api.BaseApiTest
import org.junit.Assert
import org.junit.Test

class FacebookMonitoringRequestTest : BaseApiTest() {

    @Test
    fun testInteractions() {
        val facebookMonitoringObjects = percolateApi
                .facebookMonitoring()
                .interactions(FacebookMonitoringInteractionsParams())
                .execute()
                .body();

        Assert.assertNotNull(facebookMonitoringObjects)
        Assert.assertNotNull(facebookMonitoringObjects.data)
        Assert.assertEquals(6, facebookMonitoringObjects.data.size.toLong())
    }

    @Test
    fun testAncestors() {
        val facebookMonitoringObjectsList = percolateApi
                .facebookMonitoring()
                .ancestors(FacebookMonitoringAncestorsParams("123"))
                .execute()
                .body();

        Assert.assertNotNull(facebookMonitoringObjectsList)
        Assert.assertEquals(1, facebookMonitoringObjectsList.size.toLong())
    }

    @Test
    fun testResponses() {
        val facebookMonitoringObjects = percolateApi
                .facebookMonitoring()
                .responses(FacebookMonitoringResponsesParams("123"))
                .execute()
                .body();

        Assert.assertNotNull(facebookMonitoringObjects)
        Assert.assertNotNull(facebookMonitoringObjects.data)
        Assert.assertEquals(1, facebookMonitoringObjects.data.size.toLong())
    }

    @Test
    fun testConversation() {
        val facebookConversationList = percolateApi
                .facebookMonitoring()
                .conversation(FacebookMonitoringConversationParams())
                .execute()
                .body();

        Assert.assertNotNull(facebookConversationList)
        Assert.assertNotNull(facebookConversationList.data)
        Assert.assertEquals(6, facebookConversationList.data.size.toLong())
    }

    @Test
    fun testMessages() {
        val facebookConversationThread = percolateApi
                .facebookMonitoring()
                .messages(FacebookMonitoringMessagesParams("123"))
                .execute()
                .body();

        Assert.assertNotNull(facebookConversationThread)
        Assert.assertNotNull(facebookConversationThread.data)
        Assert.assertEquals(24, facebookConversationThread.data.size.toLong())
    }
}

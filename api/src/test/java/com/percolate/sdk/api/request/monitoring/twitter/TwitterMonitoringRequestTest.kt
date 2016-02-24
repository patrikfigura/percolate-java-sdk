package com.percolate.sdk.api.request.monitoring.twitter

import com.percolate.sdk.api.BaseApiTest
import org.junit.Assert
import org.junit.Test

class TwitterMonitoringRequestTest : BaseApiTest() {

    @Test
    fun testConversations() {
        val twitterConversationList = percolateApi
                .twitterMonitoring()
                .conversations(TwitterMonitoringConversationParams())
                .execute()
                .body();

        Assert.assertNotNull(twitterConversationList)
        Assert.assertNotNull(twitterConversationList.data)
        Assert.assertEquals(3, twitterConversationList.data.size.toLong())
    }

    @Test
    fun testMessages() {
        val twitterConversationThread = percolateApi
                .twitterMonitoring()
                .messages(TwitterMonitoringMessagesParams("123"))
                .execute()
                .body();

        Assert.assertNotNull(twitterConversationThread)
        Assert.assertNotNull(twitterConversationThread.data)
        Assert.assertEquals(4, twitterConversationThread.data.size.toLong())
    }

    @Test
    fun testInteractions() {
        val twitterMonitoringObjects = percolateApi
                .twitterMonitoring()
                .interactions(TwitterMonitoringInteractionsParams())
                .execute()
                .body();

        Assert.assertNotNull(twitterMonitoringObjects)
        Assert.assertNotNull(twitterMonitoringObjects.data)
        Assert.assertEquals(8, twitterMonitoringObjects.data.size.toLong())
    }

    @Test
    fun testQuery() {
        val twitterQueries = percolateApi
                .twitterMonitoring()
                .query(TwitterMonitoringQueryParams())
                .execute()
                .body();

        Assert.assertNotNull(twitterQueries)
        Assert.assertNotNull(twitterQueries.data)
        Assert.assertEquals(3, twitterQueries.data.size.toLong())
    }
}

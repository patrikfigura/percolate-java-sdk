package com.percolate.sdk.api.request.monitoring.instagram

import com.percolate.sdk.api.BaseApiTest
import org.junit.Assert
import org.junit.Test

class InstagramMonitoringRequestTest : BaseApiTest() {

    @Test
    fun testInteractions() {
        val instagramMonitoringObjects = percolateApi
                .instagramMonitoring()
                .interactions(InstagramMonitoringInteractionsParams())
                .execute()
                .body();

        Assert.assertNotNull(instagramMonitoringObjects)
        Assert.assertNotNull(instagramMonitoringObjects.data)
        Assert.assertEquals(4, instagramMonitoringObjects.data.size.toLong())
        Assert.assertNotNull(instagramMonitoringObjects.includes)
        Assert.assertEquals(4, instagramMonitoringObjects.includes.posts.size.toLong())
    }

    @Test
    fun testInteraction() {
        val instagramSingleMonitoringObject = percolateApi
                .instagramMonitoring()
                .interaction(InstagramMonitoringInteractionParams("123"))
                .execute()
                .body();

        Assert.assertNotNull(instagramSingleMonitoringObject)
        Assert.assertNotNull(instagramSingleMonitoringObject.data)
        Assert.assertNotNull(instagramSingleMonitoringObject.data.xobj)
        Assert.assertNotNull(instagramSingleMonitoringObject.data.xobj.id)
    }
}

package com.percolate.sdk.api.request.licensechannel

import com.percolate.sdk.api.BaseApiTest
import com.percolate.sdk.dto.LicenseChannel
import org.junit.Assert
import org.junit.Test

class LicenseChannelRequestTest : BaseApiTest() {

    @Test
    fun testGet() {
        val licenseChannels = percolateApi
                .licenseChannels()
                .get(LicenseChannelParams())
                .execute()
                .body();

        Assert.assertNotNull(licenseChannels)
        Assert.assertNotNull(licenseChannels.data)
        Assert.assertEquals(2, licenseChannels.data.size.toLong())
    }

    @Test
    fun testCreate() {
        val singleLicenseChannel = percolateApi
                .licenseChannels()
                .create(LicenseChannel())
                .execute()
                .body();

        Assert.assertNotNull(singleLicenseChannel)
        Assert.assertNotNull(singleLicenseChannel.data)
        Assert.assertNotNull(singleLicenseChannel.data.id)
    }
}

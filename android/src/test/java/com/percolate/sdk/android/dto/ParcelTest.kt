package com.percolate.sdk.android.dto

import android.os.Build
import android.os.Parcel
import com.percolate.sdk.android.BuildConfig
import org.apache.commons.lang3.builder.EqualsBuilder
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.robolectric.RobolectricGradleTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricGradleTestRunner::class)
@Config(constants = BuildConfig::class, sdk = intArrayOf(Build.VERSION_CODES.LOLLIPOP))
class ParcelTest {

    @Test
    fun testParceling() {
        assertTrue(true);
        val paginationData = PaginationData().apply {
            setTotal(1)
            setLimit(2)
            setOffset(3)
            setOrderBy("test")
            setOrderDirection("desc")
            setStartKey("start")
            setEndKey("end")
        }

        val parcel = Parcel.obtain()
        paginationData.writeToParcel(parcel, 0)
        parcel.setDataPosition(0)

        val fromParcel = PaginationData.CREATOR.createFromParcel(parcel);
        assertTrue(EqualsBuilder.reflectionEquals(paginationData, fromParcel));
    }
}

package com.percolate.sdk.auth

import com.percolate.sdk.dto.AuthorizeData
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test

class JacksonUtilsTest {

    @Test
    @Throws(Exception::class)
    fun jsonToObject() {
        val data = JacksonUtils.jsonToObject<AuthorizeData>(json, AuthorizeData::class.java)
        assertNotNull(data)
        assertEquals("authorize:123", data?.id)
        assertEquals("token", data?.type)
        assertEquals("user:123", data?.userId)
        assertNotNull(data?.ext)
        assertEquals("client:123", data?.ext?.clientId)
        assertEquals("123456789", data?.ext?.code)
    }

    companion object {
        private val json = """{
            "type": "token",
            "ext": {
                "code": "123456789",
                "client_id": "client:123",
                "callback_url": "unit-testing:\/\/oauth"
            },
            "user_id": "user:123",
            "id": "authorize:123",
            "updated_at": "2016-04-13T18:20:22+00:00"
        }"""
    }
}

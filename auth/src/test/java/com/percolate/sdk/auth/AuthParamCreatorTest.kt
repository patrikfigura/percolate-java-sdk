package com.percolate.sdk.auth

import net.iharder.Base64
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

/**
 * TODO
 */
class AuthParamCreatorTest {

    private var authParamCreator: AuthParamCreator? = null
    private var authData: AuthData? = null

    @Before
    fun setUp() {
        authData = AuthData(CLIENT_ID, CLIENT_SECRET).apply {
            username = USERNAME
            password = PASSWORD
            twoFactorAuthCode = TWO_FACTOR_CODE
            ssoPayload = SSO_PAYLOAD
        }
        authParamCreator = AuthParamCreator(authData)
    }

    @Test
    @Throws(Exception::class)
    fun authData() {
        val data = authParamCreator!!.authData()
        with(data) {
            assertEquals(USERNAME, email)
            assertEquals(PASSWORD, password)
            assertEquals(TWO_FACTOR_CODE, twoFactorAuthCode)
            assertEquals(SSO_PAYLOAD, ssoPayload)
            assertEquals(USERNAME, email)
            assertEquals("token", type)
            assertNotNull(ext)
            assertEquals(ext.clientId, CLIENT_ID)
        }
    }

    @Test
    @Throws(Exception::class)
    fun tokenParams() {
        val data = authParamCreator!!.tokenParams();
        val expected = "Basic " + Base64.encodeBytes(
                (CLIENT_ID + ":" + CLIENT_SECRET).toByteArray()
        );

        assertEquals(expected, data.tokenAuthHeader())
    }

    companion object {
        private val CLIENT_ID = "client:123"
        private val CLIENT_SECRET = "12345abcde"
        private val USERNAME = "user@percolate.com"
        private val PASSWORD = "password"
        private val TWO_FACTOR_CODE = "123456"
        private val SSO_PAYLOAD = "{\"data\":\"payload\"}"
    }
}

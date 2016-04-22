package com.percolate.sdk.auth

import com.percolate.sdk.dto.AuthorizeData
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import java.util.*

class AuthErrorCheckerTest {

    private var authErrorChecker: AuthErrorChecker? = null

    @Before
    fun setUp() {
        authErrorChecker = AuthErrorChecker()
    }

    @Test
    fun twoFactorAuthRequired() {
        assertTrue(authErrorChecker!!.twoFactorAuthRequired(
            createAuthorizeData("authorize.totp_required"))
        )
        assertFalse(authErrorChecker!!.twoFactorAuthRequired(
            createAuthorizeData(""))
        )
    }

    @Test
    fun ssoRequired() {
        assertTrue(authErrorChecker!!.ssoRequired(
            createAuthorizeData("authorize.is_sso_user"))
        )
        assertFalse(authErrorChecker!!.ssoRequired(
            createAuthorizeData(""))
        )
    }

    @Test
    fun loginFailed() {
        assertTrue(authErrorChecker!!.loginFailed(
            createAuthorizeData("authorize.invalid_credentials"))
        )
        assertFalse(authErrorChecker!!.loginFailed(
            createAuthorizeData(""))
        )
    }

    private fun createAuthorizeData(errorCode: String): AuthorizeData {
        val authorizeData = AuthorizeData()
        val errors = ArrayList<LinkedHashMap<String, Any>>()
        val error = LinkedHashMap<String, Any>()
        error.put("code", errorCode)
        errors.add(error)
        authorizeData.errors = errors
        return authorizeData
    }
}

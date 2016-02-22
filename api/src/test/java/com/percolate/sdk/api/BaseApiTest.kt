package com.percolate.sdk.api

/**
 * Base class used by API endpoint tests.
 *
 * Sets up a [UnitTestingHttpInterceptor] that uses local json fixture data.
 */
open class BaseApiTest {

    var percolateApi : PercolateApi;

    constructor() {
        percolateApi = PercolateApi("")
        percolateApi.selectedServer.customInterceptor = UnitTestingHttpInterceptor()
    }
}

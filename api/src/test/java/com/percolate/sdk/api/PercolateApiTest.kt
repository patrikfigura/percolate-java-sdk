package com.percolate.sdk.api

open class PercolateApiTest {

    var percolateApi : PercolateApi;

    constructor() {
        percolateApi = PercolateApi("")
        percolateApi.selectedServer.customInterceptor = UnitTestingHttpInterceptor()
    }
}

package com.percolate.sdk.api.config;

/**
 * Percolate server endpoint configuration data.
 */
public class PercolateServer {

    /**
     * Transport layer.  {@code "http"} or {@code "https"}.
     */
    private final String transport;

    /**
     * Domain name.  Eg: "percolate.com".
     */
    private final String domain;

    /**
     * Will proxy all network requests through {@code 127.0.0.1:8888}.
     */
    private boolean enableLocalProxy = false;

    public PercolateServer(String transport, String domain) {
        this.transport = transport;
        this.domain = domain;
    }

    public String getTransport() {
        return transport;
    }

    public String getDomain() {
        return domain;
    }

    public boolean getEnableLocalProxy() {
        return enableLocalProxy;
    }

    public void setEnableLocalProxy(boolean enableLocalProxy) {
        this.enableLocalProxy = enableLocalProxy;
    }
}

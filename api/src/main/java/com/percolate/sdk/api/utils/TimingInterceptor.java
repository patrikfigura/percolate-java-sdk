package com.percolate.sdk.api.utils;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;

public class TimingInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        final Request request = chain.request();

        final String eventName = constructTrackingEventName(request);
        System.out.println("BRENT TEMP: tracking: " + eventName);
        MixpanelUtils.startTiming(eventName);
        final Response response = chain.proceed(request);
        MixpanelUtils.endTiming(eventName);
        return response;
    }

    private String constructTrackingEventName(final Request request) {
        return "API " + request.method() + " Request " + convertIdsInUrlToXs(request.url());
    }

    private String convertIdsInUrlToXs(final HttpUrl url) {
        if (url != null && StringUtils.isNotBlank(url.encodedPath())) {
            return url.encodedPath().replaceAll("(?<!/v)\\d", "x");
        }
        return "";
    }

}

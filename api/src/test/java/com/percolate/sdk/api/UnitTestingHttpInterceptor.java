package com.percolate.sdk.api;

import okhttp3.*;
import okio.Buffer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * This {@link Interceptor} gets plugged into Retrofit's okhttp client
 * and is used to return local JSON data for unit testing instead of
 * going over the network.
 */
public class UnitTestingHttpInterceptor implements Interceptor {

    private static final String FIXTURES_DIR = "src/test/fixtures";

    @Override
    public Response intercept(Chain chain) throws IOException {
        final Request request = chain.request();
        final HttpUrl requestedUrl = request.url();
        final String requestedPath = requestedUrl.encodedPath();
        final String requestedMethod = request.method();

        final String fixtureJsonPath = FIXTURES_DIR + requestedPath + requestedMethod + ".json";
        final InputStream inputStream = new FileInputStream(fixtureJsonPath);
        Buffer input = new Buffer().readFrom(inputStream);

        final MediaType mediaType = MediaType.parse("application/json");
        final ResponseBody responseBody = ResponseBody.create(mediaType, input.size(), input);

        return new Response.Builder()
                .request(request)
                .protocol(Protocol.HTTP_1_1)
                .code(200)
                .body(responseBody)
                .build();
    }
}

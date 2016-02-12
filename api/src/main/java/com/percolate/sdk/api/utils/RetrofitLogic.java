package com.percolate.sdk.api.utils;

import com.percolate.sdk.api.PercolateApi;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;

/**
 * Code to hide away Retrofit logic and implementation details. It configures
 * Retrofit by setting an application interceptor and sets the Jackson Converter factory.
 */
class RetrofitLogic {

    /**
     * {@link Retrofit}
     */
    private static Retrofit retrofit = null;

    /**
     * Context.
     */
    private final PercolateApi context;

    /**
     * User Agent String.
     */
    private final String userAgentString = "percolate-java-sdk-" + PercolateApi.VERSION_NUMBER;

    /**
     * Construct instance.
     */
    RetrofitLogic(@NotNull PercolateApi context) {
        this.context = context;
    }

    /**
     * Lazy load Retrofit.
     */
    protected Retrofit getRetrofit(){
        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(context.getSelectedServer().getTransport() + "://" + context.getSelectedServer().getDomain() + "/")
                    .addConverterFactory(JacksonConverterFactory.create())
                    .client(createOkHttpClient())
                    .build();
        }
        return retrofit;
    }

    /**
     * Creates an OkHttpClient object and sets an application level interceptor that
     * adds the User-Agent and Authorization headers to each request.
     *
     * @return OkHttpClient {@link OkHttpClient}
     */
    public OkHttpClient createOkHttpClient() {
        OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();

        if(context.getSelectedServer().getEnableLocalProxy()) {
            final Proxy proxy = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved("127.0.0.1", 8888));
            okHttpClientBuilder.proxy(proxy);
        }

        okHttpClientBuilder.interceptors().add(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                request = request.newBuilder()
                        .addHeader("User-Agent", userAgentString)
                        .addHeader("Authorization", context.getApiKey())
                        .build();
                return chain.proceed(request);
            }
        });
        return  okHttpClientBuilder.build();
    }
}

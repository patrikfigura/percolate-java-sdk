package com.percolate.sdk.api.utils;

import com.percolate.sdk.api.PercolateApi;
import retrofit2.Retrofit;

import java.util.HashMap;
import java.util.Map;

/**
 * Creates a Retrofit Service interface and caches it.
 */
public class RetrofitApiFactory {

    /**
     * Context.
     */
    private final PercolateApi context;

    /**
     * Lazy-loaded instance of {@link RetrofitLogic}.
     */
    private static RetrofitLogic retrofitLogic = null;

    /**
     * Cache of Retrofit API Services.  Objects created by calling getService().
     */
    private static final Map<Class, Object> cache = new HashMap<>();

    /**
     * Construct instance.
     */
    public RetrofitApiFactory(PercolateApi context) {
        this.context = context;
    }

    /**
     * Create and cache instance of the given Retrofit Service interface.
     */
    @SuppressWarnings("unchecked")
    public synchronized <T> T getService(Class<T> serviceClass){
        if(!cache.containsKey(serviceClass)) {
            T service = getRetrofit().create(serviceClass);
            cache.put(serviceClass, service);
        }
        return (T) cache.get(serviceClass);
    }

    /**
     * Lazy-load {@link #retrofitLogic} instance and use it to return a {@link Retrofit} object.
     */
    protected Retrofit getRetrofit() {
        if (retrofitLogic == null) {
            retrofitLogic = new RetrofitLogic(context);
        }
        return retrofitLogic.getRetrofit();
    }

    /**
     * Reset cached {@link #retrofitLogic} instance and empties service endpoint cache.
     */
    public static void reset() {
        retrofitLogic = null;
        cache.clear();
    }
}

# Percolate Java SDK

[![Circle CI](https://circleci.com/gh/percolate/percolate-java-sdk.svg?style=svg)](https://circleci.com/gh/percolate/percolate-java-sdk)
[![codecov.io](https://codecov.io/github/percolate/percolate-java-sdk/coverage.svg?branch=master)](https://codecov.io/github/percolate/percolate-java-sdk?branch=master)

## Usage

The SDK is broken up into multiple libraries:

| Component     | Description                        |
|---------------|------------------------------------| 
| core          | Core objects.  Required.           |
| api           | API requests.                      |
| auth          | OAuth2 helper objects.             |
| android       | Android-specific objects.          |
| python-bridge | Allows core/api usage from python. |
   

### Using Gradle / Maven

See our wiki on instructions for adding the libraries to your application using [gradle](../../wiki/Setup-Using-Gradle) or [maven](../../wiki/Setup-Using-Maven).
[sbt and leinigen](https://jitpack.io/#percolate/percolate-java-sdk) build configuration is also supported.


### Usage example

Use the `PercolateApi` class to access an API endpoint by name.   For example, `PercolateApi#terms` is used to access
our `v5/terms` endpoint.  You can then call `get()`, `create()`, `update()`, or `delete()` on the returned object.

```java
new PercolateApi(API_KEY)
  .terms()
  .get(params);
```


### Extended Example:
```java
PercolateApi percolateApi = new PercolateApi(API_KEY);
TermsParams params = new TermsParams()
  .scopeId("license:12345")
  .search("abc");
Call<Terms> call = percolateApi.terms().get(params);
Terms terms = call.execute().body();  
...  
```

The returned `Call` objects can be used in 1 of 2 ways:

**Synchronously**
```java
Terms terms = call.execute().body();
```

**Asynchronously**
```java
call.enqueue(new Callback<Terms>() {

    @Override
    public void onResponse(Call<Terms> call, Response<Terms> response) {
        Terms terms = response.body();
        ...
    }

    @Override
    public void onFailure(Call<Terms> call, Throwable t) { }    
});
```


## OAuth2 Authentication
This library supports API_KEY authentication or OAuth2 authentication.
See the [auth module README file](auth) and the [wiki page](../../wiki/OAuth2-vs-API_KEY-Authentication) for details.


## Usage from Python
This is an experimental feature.
See [python-bridge](python-bridge) for details.


## License
Distributed under the BSD 3 license. See [LICENSE](LICENSE.txt) for details.

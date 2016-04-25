# Auth Module

This module provides convenience classes to authenticate to the API using OAuth2.

## How it works:

Make a `PercolateApi` instance as usual:

```java
final PercolateApi api = new PercolateApi();
```

Pass that instance, along with your OAuth2 client id and client secret to a new instance of `Authorize`.

```java
final Authorize authorize = new Authorize(percolateApi, CLIENT_ID, CLIENT_SECRET);
```

`Authorize` has 3 methods:

```java
authorize.authorize(username, password);
authorize.sendTwoFactorAuthCode(twoFactorAuthCode);
authorize.sendSsoPayload(ssoPayload);
```

All of these methods return a `AuthResponse` which can have 1 of 4 statuses:

```java
LOGIN_FAILED
TWO_FACTOR_AUTH_CODE_REQUIRED
SSO_REQUIRED
READY
ERROR
```

`READY` signifies that OAuth2 is complete and the `PercolateApi` class can now be used to make requests. 

A normal flow would be to call `authorize.authorize(username, password)`, 
check the response to see if 2FA is required, 
and call `authorize.sendTwoFactorAuthCode(twoFactorAuthCode)` after prompting the user for their 2FA code.

## Troubleshooting

`AuthResponse` actually contains 3 fields:
 
| Field | Type | Nullable? |
|-------|------|------------|
| status | AuthStatus (enum) | No |
| error | Throwable | yes |
| response | [Response](https://square.github.io/retrofit/2.x/retrofit/retrofit2/Response.html) | yes |

if `status == AuthStatus.ERROR`, check `error` to see if an error was thrown, and check `response` for network details:

```java          
resp.getResponse().body(); // 200 OK response body
resp.getResponse().errorBody(); // Body for failed requests (non-200)
resp.getResponse().code(); // HTTP response code (int)
```

Network requests within this module are done as blocking operations.  If you need non-blocking network operations, take a look at our [wiki page on using OAuth](../wiki/OAuth2-vs-API_KEY-Authentication).

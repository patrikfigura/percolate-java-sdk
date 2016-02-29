# Python Bridge

**This is an experimental feature**

Using [py4j](https://www.py4j.org/) you can use the core/api libraries from python.

First, you must run `PercolateSdkPythonBridge.java` to start the java bridge required by py4j.

```
java PercolateSdkPythonBridge
>Python Bridge Running.  Ctrl+C to stop.
```

Here is an example request to get a `Post` object.  See the [py4j docs](https://www.py4j.org/contents.html) for details.

```python
#!/usr/bin/python
from py4j.java_gateway import (
    JavaGateway,
    GatewayParameters,
    java_import
)

API_KEY = "--your-api-key--"

gateway = JavaGateway(gateway_parameters=GatewayParameters(auto_convert=True))
api = gateway.jvm
java_import(api, 'com.percolate.sdk.api.PercolateApi')
java_import(api, 'com.percolate.sdk.api.request.post.PostGetParams')

percolate_api = api.PercolateApi(API_KEY)
percolate_api.getSelectedServer().setEnableLocalProxy(True);

params = api.PostGetParams("post:--your-post-id--")\
  .scopeIds(["license:--your-license-id--"])

post = percolate_api\
  .post()\
  .get(params)\
  .execute()\
  .body();

print post
print "-" * 30
print "ID: %s" % post.getData().getId()
print "Name: %s" % post.getData().getName()
print "User: %s" % post.getData().getUserId()
print "Platform: %s" % post.getData().getPlatformId()
print "Channel: %s" % post.getData().getChannelId()
print "Schema: %s" % post.getData().getSchemaId()
print "User: %s" % post.getData().getUserId()
```
# UsersApi

All URIs are relative to *http://localhost:3045*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userControllerUpdate**](UsersApi.md#userControllerUpdate) | **PATCH** /api/user/{id} | 


<a name="userControllerUpdate"></a>
# **userControllerUpdate**
> String userControllerUpdate(id, body)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3045");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String id = "id_example"; // String | 
    Object body = null; // Object | 
    try {
      String result = apiInstance.userControllerUpdate(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#userControllerUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | **Object**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |


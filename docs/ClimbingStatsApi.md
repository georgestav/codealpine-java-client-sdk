# ClimbingStatsApi

All URIs are relative to *http://localhost:3045*

Method | HTTP request | Description
------------- | ------------- | -------------
[**climbingStatsControllerGetUserProfile**](ClimbingStatsApi.md#climbingStatsControllerGetUserProfile) | **GET** /api/v1/climbing-stats/user/assessment | 
[**climbingStatsControllerGetUserStats**](ClimbingStatsApi.md#climbingStatsControllerGetUserStats) | **POST** /api/v1/climbing-stats/user | 


<a name="climbingStatsControllerGetUserProfile"></a>
# **climbingStatsControllerGetUserProfile**
> List&lt;Object&gt; climbingStatsControllerGetUserProfile(authorization)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClimbingStatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3045");

    ClimbingStatsApi apiInstance = new ClimbingStatsApi(defaultClient);
    String authorization = "authorization_example"; // String | 
    try {
      List<Object> result = apiInstance.climbingStatsControllerGetUserProfile(authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClimbingStatsApi#climbingStatsControllerGetUserProfile");
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
 **authorization** | **String**|  |

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="climbingStatsControllerGetUserStats"></a>
# **climbingStatsControllerGetUserStats**
> Object climbingStatsControllerGetUserStats(authorization)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClimbingStatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3045");

    ClimbingStatsApi apiInstance = new ClimbingStatsApi(defaultClient);
    String authorization = "authorization_example"; // String | 
    try {
      Object result = apiInstance.climbingStatsControllerGetUserStats(authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClimbingStatsApi#climbingStatsControllerGetUserStats");
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
 **authorization** | **String**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |


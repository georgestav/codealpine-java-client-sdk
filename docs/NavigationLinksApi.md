# NavigationLinksApi

All URIs are relative to *http://localhost:3045*

Method | HTTP request | Description
------------- | ------------- | -------------
[**navlinksControllerV1Create**](NavigationLinksApi.md#navlinksControllerV1Create) | **POST** /api/v1/navlinks | 
[**navlinksControllerV1FindAll**](NavigationLinksApi.md#navlinksControllerV1FindAll) | **GET** /api/v1/navlinks | 
[**navlinksControllerV1FindOne**](NavigationLinksApi.md#navlinksControllerV1FindOne) | **GET** /api/v1/navlinks/{id} | 
[**navlinksControllerV1Remove**](NavigationLinksApi.md#navlinksControllerV1Remove) | **DELETE** /api/v1/navlinks/{id} | 
[**navlinksControllerV1Update**](NavigationLinksApi.md#navlinksControllerV1Update) | **PATCH** /api/v1/navlinks/{id} | 


<a name="navlinksControllerV1Create"></a>
# **navlinksControllerV1Create**
> navlinksControllerV1Create(createNavlinkDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NavigationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3045");

    NavigationLinksApi apiInstance = new NavigationLinksApi(defaultClient);
    CreateNavlinkDto createNavlinkDto = new CreateNavlinkDto(); // CreateNavlinkDto | 
    try {
      apiInstance.navlinksControllerV1Create(createNavlinkDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling NavigationLinksApi#navlinksControllerV1Create");
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
 **createNavlinkDto** | [**CreateNavlinkDto**](CreateNavlinkDto.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** |  |  -  |

<a name="navlinksControllerV1FindAll"></a>
# **navlinksControllerV1FindAll**
> navlinksControllerV1FindAll()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NavigationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3045");

    NavigationLinksApi apiInstance = new NavigationLinksApi(defaultClient);
    try {
      apiInstance.navlinksControllerV1FindAll();
    } catch (ApiException e) {
      System.err.println("Exception when calling NavigationLinksApi#navlinksControllerV1FindAll");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="navlinksControllerV1FindOne"></a>
# **navlinksControllerV1FindOne**
> navlinksControllerV1FindOne(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NavigationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3045");

    NavigationLinksApi apiInstance = new NavigationLinksApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.navlinksControllerV1FindOne(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling NavigationLinksApi#navlinksControllerV1FindOne");
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

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="navlinksControllerV1Remove"></a>
# **navlinksControllerV1Remove**
> navlinksControllerV1Remove(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NavigationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3045");

    NavigationLinksApi apiInstance = new NavigationLinksApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.navlinksControllerV1Remove(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling NavigationLinksApi#navlinksControllerV1Remove");
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

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="navlinksControllerV1Update"></a>
# **navlinksControllerV1Update**
> navlinksControllerV1Update(id, updateNavlinkDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NavigationLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3045");

    NavigationLinksApi apiInstance = new NavigationLinksApi(defaultClient);
    String id = "id_example"; // String | 
    UpdateNavlinkDto updateNavlinkDto = new UpdateNavlinkDto(); // UpdateNavlinkDto | 
    try {
      apiInstance.navlinksControllerV1Update(id, updateNavlinkDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling NavigationLinksApi#navlinksControllerV1Update");
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
 **updateNavlinkDto** | [**UpdateNavlinkDto**](UpdateNavlinkDto.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |


# NotificationsApi

All URIs are relative to *http://localhost:3045*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationControllerCreate**](NotificationsApi.md#notificationControllerCreate) | **POST** /api/v1/notification | 
[**notificationControllerFindAll**](NotificationsApi.md#notificationControllerFindAll) | **GET** /api/v1/notification | 
[**notificationControllerFindOne**](NotificationsApi.md#notificationControllerFindOne) | **GET** /api/v1/notification/{id} | 
[**notificationControllerRemove**](NotificationsApi.md#notificationControllerRemove) | **DELETE** /api/v1/notification/{id} | 
[**notificationControllerUpdate**](NotificationsApi.md#notificationControllerUpdate) | **PATCH** /api/v1/notification/{id} | 


<a name="notificationControllerCreate"></a>
# **notificationControllerCreate**
> Object notificationControllerCreate(createNotificationDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3045");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    CreateNotificationDto createNotificationDto = new CreateNotificationDto(); // CreateNotificationDto | 
    try {
      Object result = apiInstance.notificationControllerCreate(createNotificationDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#notificationControllerCreate");
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
 **createNotificationDto** | [**CreateNotificationDto**](CreateNotificationDto.md)|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** |  |  -  |

<a name="notificationControllerFindAll"></a>
# **notificationControllerFindAll**
> List&lt;Notification&gt; notificationControllerFindAll()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3045");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    try {
      List<Notification> result = apiInstance.notificationControllerFindAll();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#notificationControllerFindAll");
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

[**List&lt;Notification&gt;**](Notification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="notificationControllerFindOne"></a>
# **notificationControllerFindOne**
> String notificationControllerFindOne(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3045");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      String result = apiInstance.notificationControllerFindOne(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#notificationControllerFindOne");
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

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="notificationControllerRemove"></a>
# **notificationControllerRemove**
> String notificationControllerRemove(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3045");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      String result = apiInstance.notificationControllerRemove(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#notificationControllerRemove");
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

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="notificationControllerUpdate"></a>
# **notificationControllerUpdate**
> String notificationControllerUpdate(id, updateNotificationDto)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.NotificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3045");

    NotificationsApi apiInstance = new NotificationsApi(defaultClient);
    String id = "id_example"; // String | 
    UpdateNotificationDto updateNotificationDto = new UpdateNotificationDto(); // UpdateNotificationDto | 
    try {
      String result = apiInstance.notificationControllerUpdate(id, updateNotificationDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#notificationControllerUpdate");
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
 **updateNotificationDto** | [**UpdateNotificationDto**](UpdateNotificationDto.md)|  |

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


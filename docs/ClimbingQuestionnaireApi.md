# ClimbingQuestionnaireApi

All URIs are relative to *http://localhost:3045*

Method | HTTP request | Description
------------- | ------------- | -------------
[**climbingQuestionnaireControllerFindAll**](ClimbingQuestionnaireApi.md#climbingQuestionnaireControllerFindAll) | **GET** /api/v1/climbing-questionnaire/all/{withQuestions} | 
[**climbingQuestionnaireControllerFindForUser**](ClimbingQuestionnaireApi.md#climbingQuestionnaireControllerFindForUser) | **GET** /api/v1/climbing-questionnaire/user | 
[**climbingQuestionnaireControllerFindOne**](ClimbingQuestionnaireApi.md#climbingQuestionnaireControllerFindOne) | **GET** /api/v1/climbing-questionnaire/{id}/{withQuestions} | 
[**climbingQuestionnaireControllerGetAnalysisMessage**](ClimbingQuestionnaireApi.md#climbingQuestionnaireControllerGetAnalysisMessage) | **POST** /api/v1/climbing-questionnaire/analysis/{questionnaire} | 
[**climbingQuestionnaireControllerSaveUserQuestionnaire**](ClimbingQuestionnaireApi.md#climbingQuestionnaireControllerSaveUserQuestionnaire) | **POST** /api/v1/climbing-questionnaire/save-answers | 


<a name="climbingQuestionnaireControllerFindAll"></a>
# **climbingQuestionnaireControllerFindAll**
> List&lt;ClimbingQuestionnaire&gt; climbingQuestionnaireControllerFindAll(withQuestions)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClimbingQuestionnaireApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3045");

    ClimbingQuestionnaireApi apiInstance = new ClimbingQuestionnaireApi(defaultClient);
    String withQuestions = "withQuestions_example"; // String | 
    try {
      List<ClimbingQuestionnaire> result = apiInstance.climbingQuestionnaireControllerFindAll(withQuestions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClimbingQuestionnaireApi#climbingQuestionnaireControllerFindAll");
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
 **withQuestions** | **String**|  |

### Return type

[**List&lt;ClimbingQuestionnaire&gt;**](ClimbingQuestionnaire.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="climbingQuestionnaireControllerFindForUser"></a>
# **climbingQuestionnaireControllerFindForUser**
> List&lt;ClimbingQuestionnaire&gt; climbingQuestionnaireControllerFindForUser(authorization)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClimbingQuestionnaireApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3045");

    ClimbingQuestionnaireApi apiInstance = new ClimbingQuestionnaireApi(defaultClient);
    String authorization = "authorization_example"; // String | 
    try {
      List<ClimbingQuestionnaire> result = apiInstance.climbingQuestionnaireControllerFindForUser(authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClimbingQuestionnaireApi#climbingQuestionnaireControllerFindForUser");
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

[**List&lt;ClimbingQuestionnaire&gt;**](ClimbingQuestionnaire.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="climbingQuestionnaireControllerFindOne"></a>
# **climbingQuestionnaireControllerFindOne**
> ClimbingQuestionnaire climbingQuestionnaireControllerFindOne(id, withQuestions)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClimbingQuestionnaireApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3045");

    ClimbingQuestionnaireApi apiInstance = new ClimbingQuestionnaireApi(defaultClient);
    String id = "id_example"; // String | 
    String withQuestions = "withQuestions_example"; // String | 
    try {
      ClimbingQuestionnaire result = apiInstance.climbingQuestionnaireControllerFindOne(id, withQuestions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClimbingQuestionnaireApi#climbingQuestionnaireControllerFindOne");
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
 **withQuestions** | **String**|  |

### Return type

[**ClimbingQuestionnaire**](ClimbingQuestionnaire.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

<a name="climbingQuestionnaireControllerGetAnalysisMessage"></a>
# **climbingQuestionnaireControllerGetAnalysisMessage**
> climbingQuestionnaireControllerGetAnalysisMessage(questionnaire)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClimbingQuestionnaireApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3045");

    ClimbingQuestionnaireApi apiInstance = new ClimbingQuestionnaireApi(defaultClient);
    BigDecimal questionnaire = new BigDecimal(78); // BigDecimal | 
    try {
      apiInstance.climbingQuestionnaireControllerGetAnalysisMessage(questionnaire);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClimbingQuestionnaireApi#climbingQuestionnaireControllerGetAnalysisMessage");
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
 **questionnaire** | **BigDecimal**|  |

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

<a name="climbingQuestionnaireControllerSaveUserQuestionnaire"></a>
# **climbingQuestionnaireControllerSaveUserQuestionnaire**
> climbingQuestionnaireControllerSaveUserQuestionnaire(authorization)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClimbingQuestionnaireApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3045");

    ClimbingQuestionnaireApi apiInstance = new ClimbingQuestionnaireApi(defaultClient);
    String authorization = "authorization_example"; // String | 
    try {
      apiInstance.climbingQuestionnaireControllerSaveUserQuestionnaire(authorization);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClimbingQuestionnaireApi#climbingQuestionnaireControllerSaveUserQuestionnaire");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** |  |  -  |


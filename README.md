# openapi-java-client

Codealpine
- API version: 1.0
  - Build date: 2023-04-12T19:52:35.504818235+02:00[Europe/Paris]

The codealpine API description


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:1.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *http://localhost:3045*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ClimbingQuestionnaireApi* | [**climbingQuestionnaireControllerFindAll**](docs/ClimbingQuestionnaireApi.md#climbingQuestionnaireControllerFindAll) | **GET** /api/v1/climbing-questionnaire/all/{withQuestions} | 
*ClimbingQuestionnaireApi* | [**climbingQuestionnaireControllerFindForUser**](docs/ClimbingQuestionnaireApi.md#climbingQuestionnaireControllerFindForUser) | **GET** /api/v1/climbing-questionnaire/user | 
*ClimbingQuestionnaireApi* | [**climbingQuestionnaireControllerFindOne**](docs/ClimbingQuestionnaireApi.md#climbingQuestionnaireControllerFindOne) | **GET** /api/v1/climbing-questionnaire/{id}/{withQuestions} | 
*ClimbingQuestionnaireApi* | [**climbingQuestionnaireControllerGetAnalysisMessage**](docs/ClimbingQuestionnaireApi.md#climbingQuestionnaireControllerGetAnalysisMessage) | **POST** /api/v1/climbing-questionnaire/analysis/{questionnaire} | 
*ClimbingQuestionnaireApi* | [**climbingQuestionnaireControllerSaveUserQuestionnaire**](docs/ClimbingQuestionnaireApi.md#climbingQuestionnaireControllerSaveUserQuestionnaire) | **POST** /api/v1/climbing-questionnaire/save-answers | 
*ClimbingStatsApi* | [**climbingStatsControllerGetUserProfile**](docs/ClimbingStatsApi.md#climbingStatsControllerGetUserProfile) | **GET** /api/v1/climbing-stats/user/assessment | 
*ClimbingStatsApi* | [**climbingStatsControllerGetUserStats**](docs/ClimbingStatsApi.md#climbingStatsControllerGetUserStats) | **POST** /api/v1/climbing-stats/user | 
*DefaultApi* | [**appControllerGetInfo**](docs/DefaultApi.md#appControllerGetInfo) | **GET** /api | 
*NavigationLinksApi* | [**navlinksControllerV1Create**](docs/NavigationLinksApi.md#navlinksControllerV1Create) | **POST** /api/v1/navlinks | 
*NavigationLinksApi* | [**navlinksControllerV1FindAll**](docs/NavigationLinksApi.md#navlinksControllerV1FindAll) | **GET** /api/v1/navlinks | 
*NavigationLinksApi* | [**navlinksControllerV1FindOne**](docs/NavigationLinksApi.md#navlinksControllerV1FindOne) | **GET** /api/v1/navlinks/{id} | 
*NavigationLinksApi* | [**navlinksControllerV1Remove**](docs/NavigationLinksApi.md#navlinksControllerV1Remove) | **DELETE** /api/v1/navlinks/{id} | 
*NavigationLinksApi* | [**navlinksControllerV1Update**](docs/NavigationLinksApi.md#navlinksControllerV1Update) | **PATCH** /api/v1/navlinks/{id} | 
*NotificationsApi* | [**notificationControllerCreate**](docs/NotificationsApi.md#notificationControllerCreate) | **POST** /api/v1/notification | 
*NotificationsApi* | [**notificationControllerFindAll**](docs/NotificationsApi.md#notificationControllerFindAll) | **GET** /api/v1/notification | 
*NotificationsApi* | [**notificationControllerFindOne**](docs/NotificationsApi.md#notificationControllerFindOne) | **GET** /api/v1/notification/{id} | 
*NotificationsApi* | [**notificationControllerRemove**](docs/NotificationsApi.md#notificationControllerRemove) | **DELETE** /api/v1/notification/{id} | 
*NotificationsApi* | [**notificationControllerUpdate**](docs/NotificationsApi.md#notificationControllerUpdate) | **PATCH** /api/v1/notification/{id} | 
*UsersApi* | [**userControllerUpdate**](docs/UsersApi.md#userControllerUpdate) | **PATCH** /api/user/{id} | 


## Documentation for Models

 - [ClimbingProvidedAnswers](docs/ClimbingProvidedAnswers.md)
 - [ClimbingQuestion](docs/ClimbingQuestion.md)
 - [ClimbingQuestionnaire](docs/ClimbingQuestionnaire.md)
 - [ClimbingQuestionnaireAnalysis](docs/ClimbingQuestionnaireAnalysis.md)
 - [ClimbingQuestionnaireUser](docs/ClimbingQuestionnaireUser.md)
 - [CreateNavlinkDto](docs/CreateNavlinkDto.md)
 - [CreateNotificationDto](docs/CreateNotificationDto.md)
 - [Notification](docs/Notification.md)
 - [UpdateNavlinkDto](docs/UpdateNavlinkDto.md)
 - [UpdateNotificationDto](docs/UpdateNotificationDto.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




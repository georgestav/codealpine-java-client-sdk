/*
 * Codealpine
 * The codealpine API description
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClimbingStatsApi {
    private ApiClient localVarApiClient;

    public ClimbingStatsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ClimbingStatsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for climbingStatsControllerGetUserProfile
     * @param authorization  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call climbingStatsControllerGetUserProfileCall(String authorization, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/climbing-stats/user/assessment";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (authorization != null) {
            localVarHeaderParams.put("Authorization", localVarApiClient.parameterToString(authorization));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call climbingStatsControllerGetUserProfileValidateBeforeCall(String authorization, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling climbingStatsControllerGetUserProfile(Async)");
        }
        

        okhttp3.Call localVarCall = climbingStatsControllerGetUserProfileCall(authorization, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param authorization  (required)
     * @return List&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<Object> climbingStatsControllerGetUserProfile(String authorization) throws ApiException {
        ApiResponse<List<Object>> localVarResp = climbingStatsControllerGetUserProfileWithHttpInfo(authorization);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param authorization  (required)
     * @return ApiResponse&lt;List&lt;Object&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Object>> climbingStatsControllerGetUserProfileWithHttpInfo(String authorization) throws ApiException {
        okhttp3.Call localVarCall = climbingStatsControllerGetUserProfileValidateBeforeCall(authorization, null);
        Type localVarReturnType = new TypeToken<List<Object>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param authorization  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call climbingStatsControllerGetUserProfileAsync(String authorization, final ApiCallback<List<Object>> _callback) throws ApiException {

        okhttp3.Call localVarCall = climbingStatsControllerGetUserProfileValidateBeforeCall(authorization, _callback);
        Type localVarReturnType = new TypeToken<List<Object>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for climbingStatsControllerGetUserStats
     * @param authorization  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call climbingStatsControllerGetUserStatsCall(String authorization, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/climbing-stats/user";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (authorization != null) {
            localVarHeaderParams.put("Authorization", localVarApiClient.parameterToString(authorization));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call climbingStatsControllerGetUserStatsValidateBeforeCall(String authorization, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling climbingStatsControllerGetUserStats(Async)");
        }
        

        okhttp3.Call localVarCall = climbingStatsControllerGetUserStatsCall(authorization, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param authorization  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Object climbingStatsControllerGetUserStats(String authorization) throws ApiException {
        ApiResponse<Object> localVarResp = climbingStatsControllerGetUserStatsWithHttpInfo(authorization);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param authorization  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> climbingStatsControllerGetUserStatsWithHttpInfo(String authorization) throws ApiException {
        okhttp3.Call localVarCall = climbingStatsControllerGetUserStatsValidateBeforeCall(authorization, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param authorization  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call climbingStatsControllerGetUserStatsAsync(String authorization, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = climbingStatsControllerGetUserStatsValidateBeforeCall(authorization, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

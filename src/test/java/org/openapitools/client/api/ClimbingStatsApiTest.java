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

import org.openapitools.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClimbingStatsApi
 */
@Ignore
public class ClimbingStatsApiTest {

    private final ClimbingStatsApi api = new ClimbingStatsApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void climbingStatsControllerGetUserProfileTest() throws ApiException {
        String authorization = null;
        List<Object> response = api.climbingStatsControllerGetUserProfile(authorization);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void climbingStatsControllerGetUserStatsTest() throws ApiException {
        String authorization = null;
        Object response = api.climbingStatsControllerGetUserStats(authorization);

        // TODO: test validations
    }
    
}

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
import org.openapitools.client.model.CreateNotificationDto;
import org.openapitools.client.model.Notification;
import org.openapitools.client.model.UpdateNotificationDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotificationsApi
 */
@Ignore
public class NotificationsApiTest {

    private final NotificationsApi api = new NotificationsApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void notificationControllerCreateTest() throws ApiException {
        CreateNotificationDto createNotificationDto = null;
        Object response = api.notificationControllerCreate(createNotificationDto);

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
    public void notificationControllerFindAllTest() throws ApiException {
        List<Notification> response = api.notificationControllerFindAll();

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
    public void notificationControllerFindOneTest() throws ApiException {
        String id = null;
        String response = api.notificationControllerFindOne(id);

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
    public void notificationControllerRemoveTest() throws ApiException {
        String id = null;
        String response = api.notificationControllerRemove(id);

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
    public void notificationControllerUpdateTest() throws ApiException {
        String id = null;
        UpdateNotificationDto updateNotificationDto = null;
        String response = api.notificationControllerUpdate(id, updateNotificationDto);

        // TODO: test validations
    }
    
}

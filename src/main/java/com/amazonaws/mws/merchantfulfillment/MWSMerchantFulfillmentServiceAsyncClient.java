/*******************************************************************************
 * Copyright 2009-2020 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * MWS Merchant Fulfillment Service
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonaws.mws.merchantfulfillment;

import com.amazonaws.mws.merchantfulfillment.model.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * <p>MWSMerchantFulfillmentServiceAsyncClient class.</p>
 */
public class MWSMerchantFulfillmentServiceAsyncClient extends MWSMerchantFulfillmentServiceClient implements MWSMerchantFulfillmentServiceAsync {

    /**
     * <p>Constructor for MWSMerchantFulfillmentServiceAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.merchantfulfillment.MWSMerchantFulfillmentServiceConfig} object.
     * @param executor a {@link java.util.concurrent.ExecutorService} object.
     */
    public MWSMerchantFulfillmentServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MWSMerchantFulfillmentServiceConfig config,
            ExecutorService executor) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
        connection.setExecutorService(executor);
    }

    /**
     * <p>Constructor for MWSMerchantFulfillmentServiceAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.merchantfulfillment.MWSMerchantFulfillmentServiceConfig} object.
     */
    public MWSMerchantFulfillmentServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MWSMerchantFulfillmentServiceConfig config) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
    }

    /**
     * <p>Constructor for MWSMerchantFulfillmentServiceAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.merchantfulfillment.MWSMerchantFulfillmentServiceConfig} object.
     */
    public MWSMerchantFulfillmentServiceAsyncClient(
            String accessKey,
            String secretKey,
            MWSMerchantFulfillmentServiceConfig config) {
        super(accessKey, secretKey, config);
    }

    /**
     * <p>Constructor for MWSMerchantFulfillmentServiceAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     */
    public MWSMerchantFulfillmentServiceAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        super(accessKey, secretKey, applicationName, applicationVersion);
    }

    /** {@inheritDoc} */
    public Future<CancelShipmentResponse> cancelShipmentAsync(
        CancelShipmentRequest request) {
        return connection.callAsync(
            new RequestType("CancelShipment", CancelShipmentResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<CreateShipmentResponse> createShipmentAsync(
        CreateShipmentRequest request) {
        return connection.callAsync(
            new RequestType("CreateShipment", CreateShipmentResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<GetAdditionalSellerInputsResponse> getAdditionalSellerInputsAsync(
        GetAdditionalSellerInputsRequest request) {
        return connection.callAsync(
            new RequestType("GetAdditionalSellerInputs", GetAdditionalSellerInputsResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<GetEligibleShippingServicesResponse> getEligibleShippingServicesAsync(
        GetEligibleShippingServicesRequest request) {
        return connection.callAsync(
            new RequestType("GetEligibleShippingServices", GetEligibleShippingServicesResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<GetShipmentResponse> getShipmentAsync(
        GetShipmentRequest request) {
        return connection.callAsync(
            new RequestType("GetShipment", GetShipmentResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<GetServiceStatusResponse> getServiceStatusAsync(
        GetServiceStatusRequest request) {
        return connection.callAsync(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }


}

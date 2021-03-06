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

/**
 * This is the Merchant Fulfillment API section of the Marketplace Web Service.  It allows clients to view shipping services that meet the specific criteria.  Also, it allows clients to create shipments that result in a shipping label being generated (and paid for by the seller).  Lastly, clients can cancel the label and according to different carrier rules get refunds for their unused labels.
 */
public interface MWSMerchantFulfillmentService {

    /**
     * Cancel Shipment
     *
     * Cancels an existing shipment.  This will only succeed if the cancellation window has not passed and if the shipment
     *     has not been cancelled already.
     *
     * @param request
     *           CancelShipmentRequest request.
     * @return CancelShipmentResponse response.
     * @throws com.amazonaws.mws.merchantfulfillment.MWSMerchantFulfillmentServiceException {@link MWSMerchantFulfillmentServiceException}
     */
    CancelShipmentResponse cancelShipment(
        CancelShipmentRequest request)
        throws MWSMerchantFulfillmentServiceException;

    /**
     * Create Shipment
     *
     * Creates a shipment for the shipping information specified.  Purchases and returns a label for the specified
     *     shipping service or shipping service offering.
     *
     * @param request
     *           CreateShipmentRequest request.
     * @return CreateShipmentResponse response.
     * @throws com.amazonaws.mws.merchantfulfillment.MWSMerchantFulfillmentServiceException {@link MWSMerchantFulfillmentServiceException}
     */
    CreateShipmentResponse createShipment(
        CreateShipmentRequest request)
        throws MWSMerchantFulfillmentServiceException;

    /**
     * Get Additional Seller Inputs
     *
     * Gets the list of additional seller inputs required for a ship-method.
     *     Also returns any saved values the seller has for these additional inputs.
     *
     * @param request
     *           GetAdditionalSellerInputsRequest request.
     * @return GetAdditionalSellerInputsResponse response.
     * @throws com.amazonaws.mws.merchantfulfillment.MWSMerchantFulfillmentServiceException {@link MWSMerchantFulfillmentServiceException}
     */
    GetAdditionalSellerInputsResponse getAdditionalSellerInputs(
        GetAdditionalSellerInputsRequest request)
        throws MWSMerchantFulfillmentServiceException;

    /**
     * Get Eligible Shipping Services
     *
     * Gets a list of eligible shipping services for the shipment information specified.  The ShippingServiceId or
     *     ShippingServiceOfferingId can be used in CreateShipment to specify the shipping service or the specific offer
     *     respectively.  A list of carriers that are temporarily unavailable is also returned.
     *
     * @param request
     *           GetEligibleShippingServicesRequest request.
     * @return GetEligibleShippingServicesResponse response.
     * @throws com.amazonaws.mws.merchantfulfillment.MWSMerchantFulfillmentServiceException {@link MWSMerchantFulfillmentServiceException}
     */
    GetEligibleShippingServicesResponse getEligibleShippingServices(
        GetEligibleShippingServicesRequest request)
        throws MWSMerchantFulfillmentServiceException;

    /**
     * Get Shipment
     *
     * Gets an existing shipment, including the label status, label content, shipping information.
     *
     * @param request
     *           GetShipmentRequest request.
     * @return GetShipmentResponse response.
     * @throws com.amazonaws.mws.merchantfulfillment.MWSMerchantFulfillmentServiceException {@link MWSMerchantFulfillmentServiceException}
     */
    GetShipmentResponse getShipment(
        GetShipmentRequest request)
        throws MWSMerchantFulfillmentServiceException;

    /**
     * Get Service Status
     *
     * @param request
     *           GetServiceStatusRequest request.
     * @return GetServiceStatusResponse response.
     * @throws com.amazonaws.mws.merchantfulfillment.MWSMerchantFulfillmentServiceException {@link MWSMerchantFulfillmentServiceException}
     */
    GetServiceStatusResponse getServiceStatus(
        GetServiceStatusRequest request)
        throws MWSMerchantFulfillmentServiceException;

}

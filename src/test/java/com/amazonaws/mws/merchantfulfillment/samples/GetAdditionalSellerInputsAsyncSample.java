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
package com.amazonaws.mws.merchantfulfillment.samples;

import com.amazonaws.mws.merchantfulfillment.MWSMerchantFulfillmentServiceAsync;
import com.amazonaws.mws.merchantfulfillment.MWSMerchantFulfillmentServiceAsyncClient;
import com.amazonaws.mws.merchantfulfillment.MWSMerchantFulfillmentServiceException;
import com.amazonaws.mws.merchantfulfillment.model.Address;
import com.amazonaws.mws.merchantfulfillment.model.GetAdditionalSellerInputsRequest;
import com.amazonaws.mws.merchantfulfillment.model.GetAdditionalSellerInputsResponse;
import com.amazonaws.mws.merchantfulfillment.model.ResponseHeaderMetadata;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/** Sample async call for GetAdditionalSellerInputs. */
public class GetAdditionalSellerInputsAsyncSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param requestList
     *
     * @return The response.
     */
    public static List<Object> invokeGetAdditionalSellerInputs(
            MWSMerchantFulfillmentServiceAsync client,
            List<GetAdditionalSellerInputsRequest> requestList) {
        // Call the service async.
        List<Future<GetAdditionalSellerInputsResponse>> futureList =
            new ArrayList<Future<GetAdditionalSellerInputsResponse>>();
        for (GetAdditionalSellerInputsRequest request : requestList) {
            Future<GetAdditionalSellerInputsResponse> future = 
                client.getAdditionalSellerInputsAsync(request);
            futureList.add(future);
        }
        List<Object> responseList = new ArrayList<Object>();
        for (Future<GetAdditionalSellerInputsResponse> future : futureList) {
            Object xresponse;
            try {
                GetAdditionalSellerInputsResponse response = future.get();
                ResponseHeaderMetadata rhmd = response.getResponseHeaderMetadata();
                // We recommend logging every the request id and timestamp of every call.
                System.out.println("Response:");
                System.out.println("RequestId: "+rhmd.getRequestId());
                System.out.println("Timestamp: "+rhmd.getTimestamp());
                String responseXml = response.toXML();
                System.out.println(responseXml);
                xresponse = response;
            } catch (ExecutionException ee) {
                Throwable cause = ee.getCause();
                if (cause instanceof MWSMerchantFulfillmentServiceException) {
                    // Exception properties are important for diagnostics.
                    MWSMerchantFulfillmentServiceException ex = 
                        (MWSMerchantFulfillmentServiceException)cause;
                    ResponseHeaderMetadata rhmd = ex.getResponseHeaderMetadata();
                    System.out.println("Service Exception:");
                    System.out.println("RequestId: "+rhmd.getRequestId());
                    System.out.println("Timestamp: "+rhmd.getTimestamp());
                    System.out.println("Message: "+ex.getMessage());
                    System.out.println("StatusCode: "+ex.getStatusCode());
                    System.out.println("ErrorCode: "+ex.getErrorCode());
                    System.out.println("ErrorType: "+ex.getErrorType());
                    xresponse = ex;
                } else {
                    xresponse = cause;
                }
            } catch (Exception e) {
                xresponse = e;
            }
            responseList.add(xresponse);
        }
        return responseList;
    }

    /**
     *  Command line entry point.
     */
    public static void main(String[] args) {

        // Get a client connection.
        MWSMerchantFulfillmentServiceAsyncClient client = MWSMerchantFulfillmentServiceSampleConfig.getAsyncClient();

        // Create a request list.
        List<GetAdditionalSellerInputsRequest> requestList = new ArrayList<GetAdditionalSellerInputsRequest>();
        GetAdditionalSellerInputsRequest request = new GetAdditionalSellerInputsRequest();
        String orderId = "example";
        request.setOrderId(orderId);
        String mwsAuthToken = "example";
        request.setMWSAuthToken(mwsAuthToken);
        String sellerId = "example";
        request.setSellerId(sellerId);
        String shippingServiceId = "example";
        request.setShippingServiceId(shippingServiceId);
        Address shipFromAddress = new Address();
        request.setShipFromAddress(shipFromAddress);
        requestList.add(request);

        // Make the calls.
        GetAdditionalSellerInputsAsyncSample.invokeGetAdditionalSellerInputs(client, requestList);

    }

}

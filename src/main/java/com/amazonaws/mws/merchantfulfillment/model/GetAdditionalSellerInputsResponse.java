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
 * Get Additional Seller Inputs Response
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonaws.mws.merchantfulfillment.model;

import com.amazonservices.mws.client.*;

/**
 * GetAdditionalSellerInputsResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetAdditionalSellerInputsResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="GetAdditionalSellerInputsResult" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}GetAdditionalSellerInputsResult" minOccurs="0"/&gt;
 *             &lt;element name="ResponseMetadata" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class GetAdditionalSellerInputsResponse extends AbstractMwsObject implements MWSResponse {

    private GetAdditionalSellerInputsResult getAdditionalSellerInputsResult;

    private ResponseMetadata responseMetadata;

    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of GetAdditionalSellerInputsResult.
     *
     * @return The value of GetAdditionalSellerInputsResult.
     */
    public GetAdditionalSellerInputsResult getGetAdditionalSellerInputsResult() {
        return getAdditionalSellerInputsResult;
    }

    /**
     * Set the value of GetAdditionalSellerInputsResult.
     *
     * @param getAdditionalSellerInputsResult
     *            The new value to set.
     */
    public void setGetAdditionalSellerInputsResult(GetAdditionalSellerInputsResult getAdditionalSellerInputsResult) {
        this.getAdditionalSellerInputsResult = getAdditionalSellerInputsResult;
    }

    /**
     * Check to see if GetAdditionalSellerInputsResult is set.
     *
     * @return true if GetAdditionalSellerInputsResult is set.
     */
    public boolean isSetGetAdditionalSellerInputsResult() {
        return getAdditionalSellerInputsResult != null;
    }

    /**
     * Set the value of GetAdditionalSellerInputsResult, return this.
     *
     * @param getAdditionalSellerInputsResult
     *             The new value to set.
     * @return This instance.
     */
    public GetAdditionalSellerInputsResponse withGetAdditionalSellerInputsResult(GetAdditionalSellerInputsResult getAdditionalSellerInputsResult) {
        this.getAdditionalSellerInputsResult = getAdditionalSellerInputsResult;
        return this;
    }

    /**
     * Get the value of ResponseMetadata.
     *
     * @return The value of ResponseMetadata.
     */
    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    /**
     * Set the value of ResponseMetadata.
     *
     * @param responseMetadata
     *            The new value to set.
     */
    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    /**
     * Check to see if ResponseMetadata is set.
     *
     * @return true if ResponseMetadata is set.
     */
    public boolean isSetResponseMetadata() {
        return responseMetadata != null;
    }

    /**
     * Set the value of ResponseMetadata, return this.
     *
     * @param responseMetadata
     *             The new value to set.
     * @return This instance.
     */
    public GetAdditionalSellerInputsResponse withResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
        return this;
    }

    /**
     * Get the value of ResponseHeaderMetadata.
     *
     * @return The value of ResponseHeaderMetadata.
     */
    public ResponseHeaderMetadata getResponseHeaderMetadata() {
        return responseHeaderMetadata;
    }

    /**
     * {@inheritDoc}
     *
     * Set the value of ResponseHeaderMetadata.
     */
    public void setResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
    }

    /**
     * Check to see if ResponseHeaderMetadata is set.
     *
     * @return true if ResponseHeaderMetadata is set.
     */
    public boolean isSetResponseHeaderMetadata() {
        return responseHeaderMetadata != null;
    }

    /**
     * Set the value of ResponseHeaderMetadata, return this.
     *
     * @param responseHeaderMetadata
     *             The new value to set.
     * @return This instance.
     */
    public GetAdditionalSellerInputsResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        getAdditionalSellerInputsResult = r.read("GetAdditionalSellerInputsResult", GetAdditionalSellerInputsResult.class);
        responseMetadata = r.read("ResponseMetadata", ResponseMetadata.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("GetAdditionalSellerInputsResult", getAdditionalSellerInputsResult);
        w.write("ResponseMetadata", responseMetadata);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "GetAdditionalSellerInputsResponse",this);
    }


    /**
     * Default constructor.
     */
    public GetAdditionalSellerInputsResponse() {
        super();
    }

}

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
 * Get Eligible Shipping Services Result
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonaws.mws.merchantfulfillment.model;

import java.util.List;
import java.util.ArrayList;

import com.amazonservices.mws.client.*;

/**
 * GetEligibleShippingServicesResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetEligibleShippingServicesResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ShippingServiceList" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}ShippingService" maxOccurs="unbounded"/&gt;
 *             &lt;element name="RejectedShippingServiceList" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}RejectedShippingService" maxOccurs="unbounded"/&gt;
 *             &lt;element name="TemporarilyUnavailableCarrierList" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}TemporarilyUnavailableCarrier" maxOccurs="unbounded"/&gt;
 *             &lt;element name="TermsAndConditionsNotAcceptedCarrierList" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}TermsAndConditionsNotAcceptedCarrier" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 */
public class GetEligibleShippingServicesResult extends AbstractMwsObject {

    private List<ShippingService> shippingServiceList;

    private List<RejectedShippingService> rejectedShippingServiceList;

    private List<TemporarilyUnavailableCarrier> temporarilyUnavailableCarrierList;

    private List<TermsAndConditionsNotAcceptedCarrier> termsAndConditionsNotAcceptedCarrierList;

    /**
     * Get the value of ShippingServiceList.
     *
     * @return The value of ShippingServiceList.
     */
    public List<ShippingService> getShippingServiceList() {
        if (shippingServiceList==null) {
            shippingServiceList = new ArrayList<ShippingService>();
        }
        return shippingServiceList;
    }

    /**
     * Set the value of ShippingServiceList.
     *
     * @param shippingServiceList
     *            The new value to set.
     */
    public void setShippingServiceList(List<ShippingService> shippingServiceList) {
        this.shippingServiceList = shippingServiceList;
    }

    /**
     * Clear ShippingServiceList.
     */
    public void unsetShippingServiceList() {
        this.shippingServiceList = null;
    }

    /**
     * Check to see if ShippingServiceList is set.
     *
     * @return true if ShippingServiceList is set.
     */
    public boolean isSetShippingServiceList() {
        return shippingServiceList != null && !shippingServiceList.isEmpty();
    }

    /**
     * Add values for ShippingServiceList, return this.
     *
     * @return This instance.
     * @param values a {@link com.amazonaws.mws.merchantfulfillment.model.ShippingService} object.
     */
    public GetEligibleShippingServicesResult withShippingServiceList(ShippingService... values) {
        List<ShippingService> list = getShippingServiceList();
        for (ShippingService value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of RejectedShippingServiceList.
     *
     * @return The value of RejectedShippingServiceList.
     */
    public List<RejectedShippingService> getRejectedShippingServiceList() {
        if (rejectedShippingServiceList==null) {
            rejectedShippingServiceList = new ArrayList<RejectedShippingService>();
        }
        return rejectedShippingServiceList;
    }

    /**
     * Set the value of RejectedShippingServiceList.
     *
     * @param rejectedShippingServiceList
     *            The new value to set.
     */
    public void setRejectedShippingServiceList(List<RejectedShippingService> rejectedShippingServiceList) {
        this.rejectedShippingServiceList = rejectedShippingServiceList;
    }

    /**
     * Clear RejectedShippingServiceList.
     */
    public void unsetRejectedShippingServiceList() {
        this.rejectedShippingServiceList = null;
    }

    /**
     * Check to see if RejectedShippingServiceList is set.
     *
     * @return true if RejectedShippingServiceList is set.
     */
    public boolean isSetRejectedShippingServiceList() {
        return rejectedShippingServiceList != null && !rejectedShippingServiceList.isEmpty();
    }

    /**
     * Add values for RejectedShippingServiceList, return this.
     *
     * @return This instance.
     * @param values a {@link com.amazonaws.mws.merchantfulfillment.model.RejectedShippingService} object.
     */
    public GetEligibleShippingServicesResult withRejectedShippingServiceList(RejectedShippingService... values) {
        List<RejectedShippingService> list = getRejectedShippingServiceList();
        for (RejectedShippingService value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of TemporarilyUnavailableCarrierList.
     *
     * @return The value of TemporarilyUnavailableCarrierList.
     */
    public List<TemporarilyUnavailableCarrier> getTemporarilyUnavailableCarrierList() {
        if (temporarilyUnavailableCarrierList==null) {
            temporarilyUnavailableCarrierList = new ArrayList<TemporarilyUnavailableCarrier>();
        }
        return temporarilyUnavailableCarrierList;
    }

    /**
     * Set the value of TemporarilyUnavailableCarrierList.
     *
     * @param temporarilyUnavailableCarrierList
     *            The new value to set.
     */
    public void setTemporarilyUnavailableCarrierList(List<TemporarilyUnavailableCarrier> temporarilyUnavailableCarrierList) {
        this.temporarilyUnavailableCarrierList = temporarilyUnavailableCarrierList;
    }

    /**
     * Clear TemporarilyUnavailableCarrierList.
     */
    public void unsetTemporarilyUnavailableCarrierList() {
        this.temporarilyUnavailableCarrierList = null;
    }

    /**
     * Check to see if TemporarilyUnavailableCarrierList is set.
     *
     * @return true if TemporarilyUnavailableCarrierList is set.
     */
    public boolean isSetTemporarilyUnavailableCarrierList() {
        return temporarilyUnavailableCarrierList != null && !temporarilyUnavailableCarrierList.isEmpty();
    }

    /**
     * Add values for TemporarilyUnavailableCarrierList, return this.
     *
     * @return This instance.
     * @param values a {@link com.amazonaws.mws.merchantfulfillment.model.TemporarilyUnavailableCarrier} object.
     */
    public GetEligibleShippingServicesResult withTemporarilyUnavailableCarrierList(TemporarilyUnavailableCarrier... values) {
        List<TemporarilyUnavailableCarrier> list = getTemporarilyUnavailableCarrierList();
        for (TemporarilyUnavailableCarrier value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of TermsAndConditionsNotAcceptedCarrierList.
     *
     * @return The value of TermsAndConditionsNotAcceptedCarrierList.
     */
    public List<TermsAndConditionsNotAcceptedCarrier> getTermsAndConditionsNotAcceptedCarrierList() {
        if (termsAndConditionsNotAcceptedCarrierList==null) {
            termsAndConditionsNotAcceptedCarrierList = new ArrayList<TermsAndConditionsNotAcceptedCarrier>();
        }
        return termsAndConditionsNotAcceptedCarrierList;
    }

    /**
     * Set the value of TermsAndConditionsNotAcceptedCarrierList.
     *
     * @param termsAndConditionsNotAcceptedCarrierList
     *            The new value to set.
     */
    public void setTermsAndConditionsNotAcceptedCarrierList(List<TermsAndConditionsNotAcceptedCarrier> termsAndConditionsNotAcceptedCarrierList) {
        this.termsAndConditionsNotAcceptedCarrierList = termsAndConditionsNotAcceptedCarrierList;
    }

    /**
     * Clear TermsAndConditionsNotAcceptedCarrierList.
     */
    public void unsetTermsAndConditionsNotAcceptedCarrierList() {
        this.termsAndConditionsNotAcceptedCarrierList = null;
    }

    /**
     * Check to see if TermsAndConditionsNotAcceptedCarrierList is set.
     *
     * @return true if TermsAndConditionsNotAcceptedCarrierList is set.
     */
    public boolean isSetTermsAndConditionsNotAcceptedCarrierList() {
        return termsAndConditionsNotAcceptedCarrierList != null && !termsAndConditionsNotAcceptedCarrierList.isEmpty();
    }

    /**
     * Add values for TermsAndConditionsNotAcceptedCarrierList, return this.
     *
     * @return This instance.
     * @param values a {@link com.amazonaws.mws.merchantfulfillment.model.TermsAndConditionsNotAcceptedCarrier} object.
     */
    public GetEligibleShippingServicesResult withTermsAndConditionsNotAcceptedCarrierList(TermsAndConditionsNotAcceptedCarrier... values) {
        List<TermsAndConditionsNotAcceptedCarrier> list = getTermsAndConditionsNotAcceptedCarrierList();
        for (TermsAndConditionsNotAcceptedCarrier value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        shippingServiceList = r.readList("ShippingServiceList", "ShippingService", ShippingService.class);
        rejectedShippingServiceList = r.readList("RejectedShippingServiceList", "RejectedShippingService", RejectedShippingService.class);
        temporarilyUnavailableCarrierList = r.readList("TemporarilyUnavailableCarrierList", "TemporarilyUnavailableCarrier", TemporarilyUnavailableCarrier.class);
        termsAndConditionsNotAcceptedCarrierList = r.readList("TermsAndConditionsNotAcceptedCarrierList", "TermsAndConditionsNotAcceptedCarrier", TermsAndConditionsNotAcceptedCarrier.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("ShippingServiceList", "ShippingService", shippingServiceList);
        w.writeList("RejectedShippingServiceList", "RejectedShippingService", rejectedShippingServiceList);
        w.writeList("TemporarilyUnavailableCarrierList", "TemporarilyUnavailableCarrier", temporarilyUnavailableCarrierList);
        w.writeList("TermsAndConditionsNotAcceptedCarrierList", "TermsAndConditionsNotAcceptedCarrier", termsAndConditionsNotAcceptedCarrierList);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "GetEligibleShippingServicesResult",this);
    }

    /**
     * Legacy Value constructor.
     *
     * @param shippingServiceList a {@link java.util.List} object.
     * @param temporarilyUnavailableCarrierList a {@link java.util.List} object.
     * @param termsAndConditionsNotAcceptedCarrierList a {@link java.util.List} object.
     */
    public GetEligibleShippingServicesResult(List<ShippingService> shippingServiceList,List<TemporarilyUnavailableCarrier> temporarilyUnavailableCarrierList,List<TermsAndConditionsNotAcceptedCarrier> termsAndConditionsNotAcceptedCarrierList) {
        this.shippingServiceList = shippingServiceList;
        this.temporarilyUnavailableCarrierList = temporarilyUnavailableCarrierList;
        this.termsAndConditionsNotAcceptedCarrierList = termsAndConditionsNotAcceptedCarrierList;
    }

    /**
     * Value constructor.
     *
     * @param shippingServiceList a {@link java.util.List} object.
     */
    public GetEligibleShippingServicesResult(List<ShippingService> shippingServiceList) {
        this.shippingServiceList = shippingServiceList;
    }    

    /**
     * Default constructor.
     */
    public GetEligibleShippingServicesResult() {
        super();
    }

}

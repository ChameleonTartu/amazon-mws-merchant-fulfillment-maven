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
 * Terms And Conditions Not Accepted Carrier
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonaws.mws.merchantfulfillment.model;

import com.amazonservices.mws.client.*;

/**
 * TermsAndConditionsNotAcceptedCarrier complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="TermsAndConditionsNotAcceptedCarrier"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="CarrierName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class TermsAndConditionsNotAcceptedCarrier extends AbstractMwsObject {

    private String carrierName;

    /**
     * Get the value of CarrierName.
     *
     * @return The value of CarrierName.
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Set the value of CarrierName.
     *
     * @param carrierName
     *            The new value to set.
     */
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    /**
     * Check to see if CarrierName is set.
     *
     * @return true if CarrierName is set.
     */
    public boolean isSetCarrierName() {
        return carrierName != null;
    }

    /**
     * Set the value of CarrierName, return this.
     *
     * @param carrierName
     *             The new value to set.
     * @return This instance.
     */
    public TermsAndConditionsNotAcceptedCarrier withCarrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        carrierName = r.read("CarrierName", String.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("CarrierName", carrierName);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "TermsAndConditionsNotAcceptedCarrier",this);
    }

    /**
     * Value constructor.
     *
     * @param carrierName a {@link java.lang.String} object.
     */
    public TermsAndConditionsNotAcceptedCarrier(String carrierName) {
        this.carrierName = carrierName;
    }    

    /**
     * Default constructor.
     */
    public TermsAndConditionsNotAcceptedCarrier() {
        super();
    }

}

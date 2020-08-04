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
 * Available Carrier Will Pick Up Option
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonaws.mws.merchantfulfillment.model;

import com.amazonservices.mws.client.*;

/**
 * AvailableCarrierWillPickUpOption complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="AvailableCarrierWillPickUpOption"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="CarrierWillPickUpOption" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="Charge" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}CurrencyAmount"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class AvailableCarrierWillPickUpOption extends AbstractMwsObject {

    private String carrierWillPickUpOption;

    private CurrencyAmount charge;

    /**
     * Get the value of CarrierWillPickUpOption.
     *
     * @return The value of CarrierWillPickUpOption.
     */
    public String getCarrierWillPickUpOption() {
        return carrierWillPickUpOption;
    }

    /**
     * Set the value of CarrierWillPickUpOption.
     *
     * @param carrierWillPickUpOption
     *            The new value to set.
     */
    public void setCarrierWillPickUpOption(String carrierWillPickUpOption) {
        this.carrierWillPickUpOption = carrierWillPickUpOption;
    }

    /**
     * Check to see if CarrierWillPickUpOption is set.
     *
     * @return true if CarrierWillPickUpOption is set.
     */
    public boolean isSetCarrierWillPickUpOption() {
        return carrierWillPickUpOption != null;
    }

    /**
     * Set the value of CarrierWillPickUpOption, return this.
     *
     * @param carrierWillPickUpOption
     *             The new value to set.
     * @return This instance.
     */
    public AvailableCarrierWillPickUpOption withCarrierWillPickUpOption(String carrierWillPickUpOption) {
        this.carrierWillPickUpOption = carrierWillPickUpOption;
        return this;
    }

    /**
     * Get the value of Charge.
     *
     * @return The value of Charge.
     */
    public CurrencyAmount getCharge() {
        return charge;
    }

    /**
     * Set the value of Charge.
     *
     * @param charge
     *            The new value to set.
     */
    public void setCharge(CurrencyAmount charge) {
        this.charge = charge;
    }

    /**
     * Check to see if Charge is set.
     *
     * @return true if Charge is set.
     */
    public boolean isSetCharge() {
        return charge != null;
    }

    /**
     * Set the value of Charge, return this.
     *
     * @param charge
     *             The new value to set.
     * @return This instance.
     */
    public AvailableCarrierWillPickUpOption withCharge(CurrencyAmount charge) {
        this.charge = charge;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        carrierWillPickUpOption = r.read("CarrierWillPickUpOption", String.class);
        charge = r.read("Charge", CurrencyAmount.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("CarrierWillPickUpOption", carrierWillPickUpOption);
        w.write("Charge", charge);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "AvailableCarrierWillPickUpOption",this);
    }

    /**
     * Value constructor.
     *
     * @param carrierWillPickUpOption a {@link java.lang.String} object.
     * @param charge a {@link com.amazonaws.mws.merchantfulfillment.model.CurrencyAmount} object.
     */
    public AvailableCarrierWillPickUpOption(String carrierWillPickUpOption,CurrencyAmount charge) {
        this.carrierWillPickUpOption = carrierWillPickUpOption;
        this.charge = charge;
    }    

    /**
     * Default constructor.
     */
    public AvailableCarrierWillPickUpOption() {
        super();
    }

}

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
 * Available Shipping Service Options
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonaws.mws.merchantfulfillment.model;

import java.util.List;
import java.util.ArrayList;

import com.amazonservices.mws.client.*;

/**
 * AvailableShippingServiceOptions complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="AvailableShippingServiceOptions"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="AvailableCarrierWillPickUpOptions" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}AvailableCarrierWillPickUpOption" maxOccurs="unbounded"/&gt;
 *             &lt;element name="AvailableDeliveryExperienceOptions" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}AvailableDeliveryExperienceOption" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class AvailableShippingServiceOptions extends AbstractMwsObject {

    private List<AvailableCarrierWillPickUpOption> availableCarrierWillPickUpOptions;

    private List<AvailableDeliveryExperienceOption> availableDeliveryExperienceOptions;

    /**
     * Get the value of AvailableCarrierWillPickUpOptions.
     *
     * @return The value of AvailableCarrierWillPickUpOptions.
     */
    public List<AvailableCarrierWillPickUpOption> getAvailableCarrierWillPickUpOptions() {
        if (availableCarrierWillPickUpOptions==null) {
            availableCarrierWillPickUpOptions = new ArrayList<AvailableCarrierWillPickUpOption>();
        }
        return availableCarrierWillPickUpOptions;
    }

    /**
     * Set the value of AvailableCarrierWillPickUpOptions.
     *
     * @param availableCarrierWillPickUpOptions
     *            The new value to set.
     */
    public void setAvailableCarrierWillPickUpOptions(List<AvailableCarrierWillPickUpOption> availableCarrierWillPickUpOptions) {
        this.availableCarrierWillPickUpOptions = availableCarrierWillPickUpOptions;
    }

    /**
     * Clear AvailableCarrierWillPickUpOptions.
     */
    public void unsetAvailableCarrierWillPickUpOptions() {
        this.availableCarrierWillPickUpOptions = null;
    }

    /**
     * Check to see if AvailableCarrierWillPickUpOptions is set.
     *
     * @return true if AvailableCarrierWillPickUpOptions is set.
     */
    public boolean isSetAvailableCarrierWillPickUpOptions() {
        return availableCarrierWillPickUpOptions != null && !availableCarrierWillPickUpOptions.isEmpty();
    }

    /**
     * Add values for AvailableCarrierWillPickUpOptions, return this.
     *
     * @return This instance.
     * @param values a {@link com.amazonaws.mws.merchantfulfillment.model.AvailableCarrierWillPickUpOption} object.
     */
    public AvailableShippingServiceOptions withAvailableCarrierWillPickUpOptions(AvailableCarrierWillPickUpOption... values) {
        List<AvailableCarrierWillPickUpOption> list = getAvailableCarrierWillPickUpOptions();
        for (AvailableCarrierWillPickUpOption value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * Get the value of AvailableDeliveryExperienceOptions.
     *
     * @return The value of AvailableDeliveryExperienceOptions.
     */
    public List<AvailableDeliveryExperienceOption> getAvailableDeliveryExperienceOptions() {
        if (availableDeliveryExperienceOptions==null) {
            availableDeliveryExperienceOptions = new ArrayList<AvailableDeliveryExperienceOption>();
        }
        return availableDeliveryExperienceOptions;
    }

    /**
     * Set the value of AvailableDeliveryExperienceOptions.
     *
     * @param availableDeliveryExperienceOptions
     *            The new value to set.
     */
    public void setAvailableDeliveryExperienceOptions(List<AvailableDeliveryExperienceOption> availableDeliveryExperienceOptions) {
        this.availableDeliveryExperienceOptions = availableDeliveryExperienceOptions;
    }

    /**
     * Clear AvailableDeliveryExperienceOptions.
     */
    public void unsetAvailableDeliveryExperienceOptions() {
        this.availableDeliveryExperienceOptions = null;
    }

    /**
     * Check to see if AvailableDeliveryExperienceOptions is set.
     *
     * @return true if AvailableDeliveryExperienceOptions is set.
     */
    public boolean isSetAvailableDeliveryExperienceOptions() {
        return availableDeliveryExperienceOptions != null && !availableDeliveryExperienceOptions.isEmpty();
    }

    /**
     * Add values for AvailableDeliveryExperienceOptions, return this.
     *
     * @return This instance.
     * @param values a {@link com.amazonaws.mws.merchantfulfillment.model.AvailableDeliveryExperienceOption} object.
     */
    public AvailableShippingServiceOptions withAvailableDeliveryExperienceOptions(AvailableDeliveryExperienceOption... values) {
        List<AvailableDeliveryExperienceOption> list = getAvailableDeliveryExperienceOptions();
        for (AvailableDeliveryExperienceOption value : values) {
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
        availableCarrierWillPickUpOptions = r.readList("AvailableCarrierWillPickUpOptions", "AvailableCarrierWillPickUpOption", AvailableCarrierWillPickUpOption.class);
        availableDeliveryExperienceOptions = r.readList("AvailableDeliveryExperienceOptions", "AvailableDeliveryExperienceOption", AvailableDeliveryExperienceOption.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("AvailableCarrierWillPickUpOptions", "AvailableCarrierWillPickUpOption", availableCarrierWillPickUpOptions);
        w.writeList("AvailableDeliveryExperienceOptions", "AvailableDeliveryExperienceOption", availableDeliveryExperienceOptions);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "AvailableShippingServiceOptions",this);
    }

    /**
     * Value constructor.
     *
     * @param availableCarrierWillPickUpOptions a {@link java.util.List} object.
     * @param availableDeliveryExperienceOptions a {@link java.util.List} object.
     */
    public AvailableShippingServiceOptions(List<AvailableCarrierWillPickUpOption> availableCarrierWillPickUpOptions,List<AvailableDeliveryExperienceOption> availableDeliveryExperienceOptions) {
        this.availableCarrierWillPickUpOptions = availableCarrierWillPickUpOptions;
        this.availableDeliveryExperienceOptions = availableDeliveryExperienceOptions;
    }    

    /**
     * Default constructor.
     */
    public AvailableShippingServiceOptions() {
        super();
    }

}

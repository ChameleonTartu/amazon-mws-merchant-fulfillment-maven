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
 * Cancel Shipment Result
 * API Version: 2015-06-01
 * Library Version: 2020-02-06
 * Generated: Mon Mar 02 20:07:22 UTC 2020
 */
package com.amazonaws.mws.merchantfulfillment.model;

import com.amazonservices.mws.client.*;

/**
 * CancelShipmentResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="CancelShipmentResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Shipment" type="{https://mws.amazonservices.com/MerchantFulfillment/2015-06-01}Shipment"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class CancelShipmentResult extends AbstractMwsObject {

    private Shipment shipment;

    /**
     * Get the value of Shipment.
     *
     * @return The value of Shipment.
     */
    public Shipment getShipment() {
        return shipment;
    }

    /**
     * Set the value of Shipment.
     *
     * @param shipment
     *            The new value to set.
     */
    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    /**
     * Check to see if Shipment is set.
     *
     * @return true if Shipment is set.
     */
    public boolean isSetShipment() {
        return shipment != null;
    }

    /**
     * Set the value of Shipment, return this.
     *
     * @param shipment
     *             The new value to set.
     * @return This instance.
     */
    public CancelShipmentResult withShipment(Shipment shipment) {
        this.shipment = shipment;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        shipment = r.read("Shipment", Shipment.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Shipment", shipment);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/MerchantFulfillment/2015-06-01", "CancelShipmentResult",this);
    }

    /**
     * Value constructor.
     *
     * @param shipment a {@link com.amazonaws.mws.merchantfulfillment.model.Shipment} object.
     */
    public CancelShipmentResult(Shipment shipment) {
        this.shipment = shipment;
    }    

    /**
     * Default constructor.
     */
    public CancelShipmentResult() {
        super();
    }

}
